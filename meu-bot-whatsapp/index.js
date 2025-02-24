const express = require('express');
const makeWASocket = require('@whiskeysockets/baileys').default;
const { useMultiFileAuthState, DisconnectReason } = require('@whiskeysockets/baileys');
const qrcode = require('qrcode-terminal');
const cors = require('cors');
const fs = require('fs');


const app = express();
app.use(express.json());
app.use(cors());

let sock; // Variável global para o socket do WhatsApp
let lastQRCode = ''; // Armazena o último QR Code gerado
let server; // Referência para o servidor HTTP

// Função para iniciar o bot
async function startBot() {
    try {
        const { state, saveCreds } = await useMultiFileAuthState('./auth_info');
        console.log('Auth state loaded:', state);

        sock = makeWASocket({ auth: state });

        sock.ev.on('connection.update', (update) => {
            const { connection, lastDisconnect, qr } = update;
            console.log('Connection update:', update);

            if (qr) {
                console.log('QR Code gerado. Escaneie para conectar:');
                lastQRCode = qr;
                qrcode.generate(qr, { small: true });
            }
            if (connection === 'close') {
                const shouldReconnect =
                    lastDisconnect?.error?.output?.statusCode !== DisconnectReason.loggedOut;
                if (shouldReconnect) {
                    console.log('Reconectando...');
                    startBot(); // Tenta reconectar
                } else {
                    console.log('Desconectado. Reescaneie o QR code.');
                    deleteAuthFolder(); // Exclui pasta de autenticação
                    startBot(); // Reinicia o processo para gerar novo QR Codeaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
                }
            } else if (connection === 'open') {
                console.log('Conexão aberta.');
            }
        });

        sock.ev.on('creds.update', saveCreds); // Salva credenciais
    } catch (error) {
        console.error('Erro ao iniciar o bot:', error);
    }
}

// Inicia o bot
startBot();

// Rota para verificar o status da sessão
app.get('/status', (req, res) => {
    try {
        const status = sock.user ? 'conectado' : 'desconectado';
        res.status(200).json({ status });
    } catch (error) {
        res.status(500).json({ status: 'error', error: error.message });
    }
});


// Rota GET para obter o QR Code
app.get('/obter-qr', (req, res) => {
    console.log('Recebida requisição GET /obter-qr');
    if (lastQRCode) {
        res.send(lastQRCode);
    } else {
        res.status(404).send('QR Code não disponível');
    }
});

// Rota POST para enviar mensagem
app.post('/send-message', async (req, res) => {
    console.log('Recebida requisição POST /send-message');
    const { number, message } = req.body;

    if (!number || !message) {
        return res.status(400).json({ error: 'Número ou mensagem ausente' });
    }

    try {
        await sock.sendMessage(`${number}@s.whatsapp.net`, { text: message });
        res.json({ success: true, message: 'Mensagem enviada com sucesso!' });
    } catch (error) {
        console.error('Erro ao enviar mensagem:', error);
        res.status(500).json({ error: 'Erro ao enviar mensagem', details: error.toString() });
    }
});





// Rota para enviar imagem
// Rota POST para enviar uma imagem
app.post('/send-image', async (req, res) => {
    const { number, imageData, caption } = req.body;

    if (!number || !imageData) {
        return res.status(400).json({ error: 'Número ou imagem ausente.' });
    }

    try {
        // Converte a imagem Base64 para Buffer
        const imageBuffer = Buffer.from(imageData, 'base64');

        // Envia a mensagem com imagem pelo Baileys
        await sock.sendMessage(`${number}@s.whatsapp.net`, {
            image: imageBuffer,
            caption: caption || ''
        });

        res.json({ success: true, message: 'Imagem enviada com sucesso!' });
    } catch (error) {
        console.error('Erro ao enviar imagem:', error);
        res.status(500).json({ error: 'Erro ao enviar imagem', details: error.toString() });
    }
});







// Inicia o servidor na porta 3000
server = app.listen(3000, () => {
    console.log('Servidor rodando na porta 3000');
});

// Função para encerrar o servidor e limpar o socket
function shutdownServer() {
    if (sock) {
        console.log('Encerrando socket do WhatsApp...');
        sock.logout(); // Desconecta do WhatsApp
    }

    if (server) {
        server.close(() => {
            console.log('Servidor encerrado.');
            // deleteAuthFolder();
            process.exit(0); // Encerra o processo Node.js
        });
    } else {
        console.log('Servidor já está encerrado.');
    }
}

// Função para excluir a pasta auth_info
function deleteAuthFolder() {
    const path = './auth_info';
    if (fs.existsSync(path)) {
        fs.rmSync(path, { recursive: true, force: true });
        console.log('Pasta auth_info excluída.');
    }
}

// Rota para encerrar o servidor
app.post('/shutdown', (req, res) => {
    console.log('Recebida requisição POST /shutdown');
    shutdownServer();
    res.json({ success: true, message: 'Servidor encerrado com sucesso!' });
});
