package br.com.alexlopes.designacoes.util.whats;

import br.com.alexlopes.designacoes.dao.PessoaDAO;
import br.com.alexlopes.designacoes.model.Pessoa;
import br.com.alexlopes.designacoes.model.TodasPartes;
import br.com.alexlopes.designacoes.util.Janela;
import br.com.alexlopes.designacoes.util.SalvarImagem;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class FolhaDesignacao extends javax.swing.JFrame {

    public FolhaDesignacao() {
        initComponents();
    }

    public FolhaDesignacao(TodasPartes dados) {
        initComponents();
    }

    public FolhaDesignacao(Pessoa a01, Pessoa b02, String dataParte, String parteTipo, String salaLocal, String ParteNum) {
        initComponents();
        try {
            dataParte = dataParte.replace("Semana: ", "");
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dataa = LocalDate.parse(dataParte, formatter);

            int diadia = dataa.getDayOfMonth();
            int mesmes = dataa.getMonthValue();
            int anoano = dataa.getYear();
            String mess = definirNomeMes(mesmes);
            //String mesAno = mesmes + String.valueOf(anoano);

            SalvarImagem si = new SalvarImagem();
            WhatsApp zap = new WhatsApp();

            txtNome.setText(a01.getNome() + " " + a01.getSobrenome());
            if (b02 != null) {
                txtAjudante.setText(b02.getNome() + " " + b02.getSobrenome() + " - " + b02.getCelular());
            } else {
                txtAjudante.setText("    ");
            }
            txtData.setText("Semana: " + diadia + " de " + mess + ", " + anoano);
            txtParteNumero.setText(ParteNum);
            txtParte.setText("<html>" + parteTipo + "</html>");
            txtLocal.setText(salaLocal);
            BufferedImage imag = preencherDesignacao();
            //si.salvar(imag, a01.getNome() + a01.getSobrenome() + "_" + diadia + mess);
            si.salvar(imag, a01.getNome() + a01.getSobrenome() + "_" + diadia + mess, "Substituicao");
            zap.enviarMensagem(a01.getCelular().replaceAll("[^0-9]", ""), imag);

            this.dispose();

        } catch (Exception e) {
        }
    }   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel(){
            ImageIcon icon = new ImageIcon(getClass().getResource("/Imagem/novaFolhaS89.jpg"));
            Image image = icon.getImage();
            public void paintComponent(Graphics g){
                super.paintComponent(g); // Chama o método paintComponent da superclasse
                g.drawImage(image, 0,0, getWidth(), getHeight(),this);
            }
        };
        txtNome = new javax.swing.JLabel();
        txtAjudante = new javax.swing.JLabel();
        txtData = new javax.swing.JLabel();
        txtLocal = new javax.swing.JLabel();
        txtParte = new javax.swing.JLabel();
        txtParteNumero = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setVerifyInputWhenFocusTarget(false);

        txtNome.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        txtNome.setForeground(new java.awt.Color(0, 0, 0));
        txtNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNome.setText("??????????");

        txtAjudante.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtAjudante.setForeground(new java.awt.Color(0, 0, 0));
        txtAjudante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAjudante.setText("NOME NOME NOME NOME   CEL 13 9 8181-6525");

        txtData.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        txtData.setForeground(new java.awt.Color(0, 0, 0));
        txtData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtData.setText("???????????????????????????????");

        txtLocal.setFont(new java.awt.Font("Arial Black", 0, 33)); // NOI18N
        txtLocal.setForeground(new java.awt.Color(102, 0, 0));
        txtLocal.setText("???????????");

        txtParte.setFont(new java.awt.Font("Arial Black", 0, 33)); // NOI18N
        txtParte.setForeground(new java.awt.Color(0, 0, 102));
        txtParte.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtParte.setText("?????");
        txtParte.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        txtParteNumero.setFont(new java.awt.Font("Arial Black", 0, 30)); // NOI18N
        txtParteNumero.setForeground(new java.awt.Color(0, 0, 0));
        txtParteNumero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtParteNumero.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtAjudante)
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtParte, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(txtParteNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtAjudante, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtParteNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtParte, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(txtLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(254, Short.MAX_VALUE))
        );

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private String definirNomeMes(int a) {
        switch (a) {
            case 01 -> {
                return "Janeiro";
            }
            case 2 -> {
                return "Fevereiro";
            }
            case 3 -> {
                return "Março";
            }
            case 4 -> {
                return "Abril";
            }
            case 5 -> {
                return "Maio";
            }
            case 6 -> {
                return "Junho";
            }
            case 7 -> {
                return "Julho";
            }
            case 8 -> {
                return "Agosto";
            }
            case 9 -> {
                return "Setembro";
            }
            case 10 -> {
                return "Outubro";
            }
            case 11 -> {
                return "Novembro";
            }
            case 12 -> {
                return "Dezembro";
            }
            default -> {
            }
        }
        return null;
    }

    public static BufferedImage imagemFolha(JPanel panel) {
        BufferedImage bufferedImage = new BufferedImage(panel.getWidth(), panel.getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics = bufferedImage.createGraphics();
        panel.paint(graphics);
        graphics.dispose();
        return bufferedImage;
    }

    public void definirNome(String nome) {
        txtNome.setText(nome);
    }

    public BufferedImage preencherDesignacao() {
        return imagemFolha(jPanel1);
    }

    public void enviarWhatsApp(TodasPartes dados) {
        PessoaDAO dao = new PessoaDAO();
        SalvarImagem si = new SalvarImagem();
        WhatsApp zap = new WhatsApp();

        if (!dados.getLeituraBibliaA().isEmpty()) {
            zap = new WhatsApp();
            Pessoa leituraA = dao.buscarPessoaPorNomeESobrenomeZap(dados.getLeituraBibliaA());
            txtNome.setText(leituraA.getNome() + " " + leituraA.getSobrenome());
            Janela.ag.a1.setText(leituraA.getNome() + " " + leituraA.getSobrenome());
            txtAjudante.setText("");
            txtData.setText("Semana  " + dados.getDia() + " de " + dados.getMes() + ", " + dados.getAno());
            txtParte.setText("Leitura da Bíblia");
            txtLocal.setText("SALA  A");
            BufferedImage imag = preencherDesignacao();
            si.salvar(imag, leituraA.getNome() + leituraA.getSobrenome() + "_" + dados.getDia() + dados.getMes(), dados.getMes() + dados.getAno());
            try {
                if (zap.enviarMensagem(leituraA.getCelular().replaceAll("[^0-9]", ""), imag)) {
                    Janela.ag.b1.setText("ENVIADO");
                } else {
                    //zap.enviarMensagemUsuario(imag);
                    Janela.ag.b1.setText("NÃO ENVIADO");
                }
            } catch (Exception e) {
                Janela.ag.b1.setText("NÃO ENVIADO");
            }
        }
        if (!dados.getParte1A().isEmpty() && !dados.getParte1A().equals("NA")) {
            zap = new WhatsApp();
            Pessoa parte1A = dao.buscarPessoaPorNomeESobrenomeZap(dados.getParte1A());
            Pessoa ajudante1A = dao.buscarPessoaPorNomeESobrenomeZap(dados.getAjudante1A());
            txtNome.setText(parte1A.getNome() + " " + parte1A.getSobrenome());
            Janela.ag.a2.setText(parte1A.getNome() + " " + parte1A.getSobrenome());
            txtAjudante.setText(ajudante1A.getNome() + " " + ajudante1A.getSobrenome() + " - " + ajudante1A.getCelular());
            txtData.setText("Semana  " + dados.getDia() + " de " + dados.getMes() + ", " + dados.getAno());
            txtParte.setText(dados.getNomeParte1());
            txtLocal.setText("SALA  A");
            BufferedImage imag = preencherDesignacao();
            si.salvar(imag, parte1A.getNome() + parte1A.getSobrenome() + "_" + dados.getDia() + dados.getMes(), dados.getMes() + dados.getAno());
            try {
                if (zap.enviarMensagem(parte1A.getCelular().replaceAll("[^0-9]", ""), imag)) {
                    Janela.ag.b2.setText("ENVIADO");
                } else {
                    //zap.enviarMensagemUsuario(imag);
                    Janela.ag.b2.setText("NÃO ENVIADO");
                }
            } catch (Exception e) {
                Janela.ag.b2.setText("NÃO ENVIADO");
            }
        }
        if (!dados.getParte2A().isEmpty()) {
            zap = new WhatsApp();
            Pessoa parte2A = dao.buscarPessoaPorNomeESobrenomeZap(dados.getParte2A());
            Pessoa ajudante2A = dao.buscarPessoaPorNomeESobrenomeZap(dados.getAjudante2A());
            txtNome.setText(parte2A.getNome() + " " + parte2A.getSobrenome());
            Janela.ag.a3.setText(parte2A.getNome() + " " + parte2A.getSobrenome());
            txtAjudante.setText(ajudante2A.getNome() + " " + ajudante2A.getSobrenome() + " - " + ajudante2A.getCelular());
            txtData.setText("Semana  " + dados.getDia() + " de " + dados.getMes() + ", " + dados.getAno());
            txtParte.setText(dados.getNomeParte2());
            txtLocal.setText("SALA  A");
            BufferedImage imag = preencherDesignacao();
            si.salvar(imag, parte2A.getNome() + parte2A.getSobrenome() + "_" + dados.getDia() + dados.getMes(), dados.getMes() + dados.getAno());
            try {
                if (zap.enviarMensagem(parte2A.getCelular().replaceAll("[^0-9]", ""), imag)) {
                    Janela.ag.b3.setText("ENVIADO");
                } else {
                   // zap.enviarMensagemUsuario(imag);
                    Janela.ag.b3.setText("NÃO ENVIADO");
                }
            } catch (Exception e) {
                Janela.ag.b3.setText("NÃO ENVIADO");
            }
        }
        if (!dados.getParte3A().isEmpty()) {
            zap = new WhatsApp();
            Pessoa parte3A = dao.buscarPessoaPorNomeESobrenomeZap(dados.getParte3A());
            Pessoa ajudante3A = dao.buscarPessoaPorNomeESobrenomeZap(dados.getAjudante3A());
            txtNome.setText(parte3A.getNome() + " " + parte3A.getSobrenome());
            Janela.ag.a4.setText(parte3A.getNome() + " " + parte3A.getSobrenome());
            if (!dados.getAjudante3A().isEmpty() && !dados.getAjudante3A().equals("NA")) {
                txtAjudante.setText(ajudante3A.getNome() + " " + ajudante3A.getSobrenome() + " - " + ajudante3A.getCelular());
            } else {
                txtAjudante.setText("");
            }
            txtData.setText("Semana  " + dados.getDia() + " de " + dados.getMes() + ", " + dados.getAno());
            txtParte.setText(dados.getNomeparte3());
            txtLocal.setText("SALA  A");
            BufferedImage imag = preencherDesignacao();
            si.salvar(imag, parte3A.getNome() + parte3A.getSobrenome() + "_" + dados.getDia() + dados.getMes(), dados.getMes() + dados.getAno());
            try {
                if (zap.enviarMensagem(parte3A.getCelular().replaceAll("[^0-9]", ""), imag)) {
                    Janela.ag.b4.setText("ENVIADO");
                } else {
                    //zap.enviarMensagemUsuario(imag);
                    Janela.ag.b4.setText("NÃO ENVIADO");
                }
            } catch (Exception e) {
                Janela.ag.b4.setText("NÃO ENVIADO");
            }
        }
        if (!dados.getLeituraBibliaB().isEmpty() && !dados.getLeituraBibliaB().equals("NA")) {
            zap = new WhatsApp();
            Pessoa leituraB = dao.buscarPessoaPorNomeESobrenomeZap(dados.getLeituraBibliaB());
            Janela.ag.a5.setText(leituraB.getNome() + " " + leituraB.getSobrenome());
            txtNome.setText(leituraB.getNome() + " " + leituraB.getSobrenome());
            txtAjudante.setText("");
            txtData.setText("Semana  " + dados.getDia() + " de " + dados.getMes() + ", " + dados.getAno());
            txtParte.setText("Leitura da Bíblia");
            txtLocal.setText("SALA  B");
            BufferedImage imag = preencherDesignacao();
            si.salvar(imag, leituraB.getNome() + leituraB.getSobrenome() + "_" + dados.getDia() + dados.getMes(), dados.getMes() + dados.getAno());
            try {
                if (zap.enviarMensagem(leituraB.getCelular().replaceAll("[^0-9]", ""), imag)) {
                    Janela.ag.b5.setText("ENVIADO");
                } else {
                   // zap.enviarMensagemUsuario(imag);
                    Janela.ag.b5.setText("NÃO ENVIADO");
                }
            } catch (Exception e) {
                Janela.ag.b5.setText("NÃO ENVIADO");
            }
        }
        if (!dados.getParte1B().isEmpty() && !dados.getParte1B().equals("NA")) {
            zap = new WhatsApp();
            Pessoa parte1B = dao.buscarPessoaPorNomeESobrenomeZap(dados.getParte1B());
            Pessoa ajudante1B = dao.buscarPessoaPorNomeESobrenomeZap(dados.getAjudante1B());
            txtNome.setText(parte1B.getNome() + " " + parte1B.getSobrenome());
            Janela.ag.a6.setText(parte1B.getNome() + " " + parte1B.getSobrenome());
            txtAjudante.setText(ajudante1B.getNome() + " " + ajudante1B.getSobrenome() + " - " + ajudante1B.getCelular());
            txtData.setText("Semana  " + dados.getDia() + " de " + dados.getMes() + ", " + dados.getAno());
            txtParte.setText(dados.getNomeParte1());
            txtLocal.setText("SALA  B");
            BufferedImage imag = preencherDesignacao();
            si.salvar(imag, parte1B.getNome() + parte1B.getSobrenome() + "_" + dados.getDia() + dados.getMes(), dados.getMes() + dados.getAno());
            try {
                if (zap.enviarMensagem(parte1B.getCelular().replaceAll("[^0-9]", ""), imag)) {
                    Janela.ag.b6.setText("ENVIADO");
                } else {
                   // zap.enviarMensagemUsuario(imag);
                    Janela.ag.b6.setText("NÃO ENVIADO");
                }
            } catch (Exception e) {
                Janela.ag.b6.setText("NÃO ENVIADO");
            }
        }
        if (!dados.getParte2B().isEmpty() && !dados.getParte2B().equals("NA")) {
            zap = new WhatsApp();
            Pessoa parte2B = dao.buscarPessoaPorNomeESobrenomeZap(dados.getParte2B());
            Pessoa ajudante2B = dao.buscarPessoaPorNomeESobrenomeZap(dados.getAjudante2B());
            txtNome.setText(parte2B.getNome() + " " + parte2B.getSobrenome());
            Janela.ag.a7.setText(parte2B.getNome() + " " + parte2B.getSobrenome());
            txtAjudante.setText(ajudante2B.getNome() + " " + ajudante2B.getSobrenome() + " - " + ajudante2B.getCelular());
            txtData.setText("Semana  " + dados.getDia() + " de " + dados.getMes() + ", " + dados.getAno());
            txtParte.setText(dados.getNomeParte2());
            txtLocal.setText("SALA  B");
            BufferedImage imag = preencherDesignacao();
            si.salvar(imag, parte2B.getNome() + parte2B.getSobrenome() + "_" + dados.getDia() + dados.getMes(), dados.getMes() + dados.getAno());
            try {
                if (zap.enviarMensagem(parte2B.getCelular().replaceAll("[^0-9]", ""), imag)) {
                    Janela.ag.b7.setText("ENVIADO");
                } else {
                   // zap.enviarMensagemUsuario(imag);
                    Janela.ag.b7.setText("NÃO ENVIADO");
                }
            } catch (Exception e) {
                Janela.ag.b7.setText("NÃO ENVIADO");
            }
        }
        if (!dados.getParte3B().isEmpty() && !dados.getParte3B().equals("NA")) {
            zap = new WhatsApp();
            Pessoa parte3B = dao.buscarPessoaPorNomeESobrenomeZap(dados.getParte3B());
            Pessoa ajudante3B = dao.buscarPessoaPorNomeESobrenomeZap(dados.getAjudante3B());
            txtNome.setText(parte3B.getNome() + " " + parte3B.getSobrenome());
            Janela.ag.a8.setText(parte3B.getNome() + " " + parte3B.getSobrenome());
            if (!dados.getAjudante3B().isEmpty() && !dados.getAjudante3B().equals("NA")) {
                txtAjudante.setText(ajudante3B.getNome() + " " + ajudante3B.getSobrenome() + " - " + ajudante3B.getCelular());
            } else {
                txtAjudante.setText("");
            }
            txtData.setText("Semana  " + dados.getDia() + " de " + dados.getMes() + ", " + dados.getAno());
            txtParte.setText(dados.getNomeparte3());
            txtLocal.setText("SALA  B");
            BufferedImage imag = preencherDesignacao();
            si.salvar(imag, parte3B.getNome() + parte3B.getSobrenome() + "_" + dados.getDia() + dados.getMes(), dados.getMes() + dados.getAno());
            try {
                if (zap.enviarMensagem(parte3B.getCelular().replaceAll("[^0-9]", ""), imag)) {
                    Janela.ag.b8.setText("ENVIADO");
                } else {
                   // zap.enviarMensagemUsuario(imag);
                    Janela.ag.b8.setText("NÃO ENVIADO");
                }
            } catch (Exception e) {
                Janela.ag.b8.setText("NÃO ENVIADO");
            }
        }
        this.dispose();
    }

    private void validar(BufferedImage imag) {
        WhatsApp zap = new WhatsApp();
        try {
            zap.enviarMensagemUsuario(imag);
        } catch (Exception e) {
        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FolhaDesignacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FolhaDesignacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FolhaDesignacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FolhaDesignacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FolhaDesignacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtAjudante;
    private javax.swing.JLabel txtData;
    private javax.swing.JLabel txtLocal;
    public javax.swing.JLabel txtNome;
    private javax.swing.JLabel txtParte;
    private javax.swing.JLabel txtParteNumero;
    // End of variables declaration//GEN-END:variables
}
