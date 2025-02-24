package br.com.alexlopes.designacoes.util.whats;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Paths;
import java.util.Base64;
import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.stream.ImageOutputStream;

public class WhatsApp {

    private static final String SERVER_IMAGE_URL = "http://localhost:3000/send-image";

    //Caminho para abrir o index.js no prompt
    //private static final String projectDirs = "meu-bot-whatsapp";
    private static final String projectDirs = Paths.get("").toAbsolutePath().toString() + "/meu-bot-whatsapp";

    public void enviarMensagem(String number, BufferedImage image, String caption) {
        try {
            // Reduzir o tamanho da imagem para 600x600 pixels
            BufferedImage resizedImage = resizeImage(image, 650, 900);

            // Converter imagem para JPEG com qualidade reduzida
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            compressImageToJPEG(resizedImage, baos, 0.7f); // Qualidade 70%
            byte[] imageBytes = baos.toByteArray();
            String imageData = Base64.getEncoder().encodeToString(imageBytes);

            // Criar a URL
            URL url = new URL(SERVER_IMAGE_URL);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);

            // Criar o corpo da requisição
            String jsonInputString = String.format(
                    "{\"number\":\"%s\", \"imageData\":\"%s\", \"caption\":\"%s\"}",
                    55 + number, imageData, caption != null ? caption : ""
            );

            // Enviar a requisição
            try (OutputStream os = conn.getOutputStream()) {
                byte[] input = jsonInputString.getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            // Verificar a resposta
            int responseCode = conn.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                System.out.println("Imagem enviada com sucesso!");
            } else {
                System.out.println("Falha ao enviar imagem. Código de resposta: " + responseCode);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para redimensionar a imagem
    private static BufferedImage resizeImage(BufferedImage originalImage, int targetWidth, int targetHeight) {
        Image resultingImage = originalImage.getScaledInstance(targetWidth, targetHeight, Image.SCALE_SMOOTH);
        BufferedImage outputImage = new BufferedImage(targetWidth, targetHeight, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = outputImage.createGraphics();
        g2d.drawImage(resultingImage, 0, 0, null);
        g2d.dispose();
        return outputImage;
    }

    // Método para comprimir imagem para JPEG com qualidade ajustada
    private static void compressImageToJPEG(BufferedImage image, OutputStream os, float quality) throws IOException {
        ImageWriter jpegWriter = ImageIO.getImageWritersByFormatName("jpg").next();
        ImageWriteParam jpegParams = jpegWriter.getDefaultWriteParam();
        jpegParams.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
        jpegParams.setCompressionQuality(quality); // Qualidade de 0 a 1

        try (ImageOutputStream ios = ImageIO.createImageOutputStream(os)) {
            jpegWriter.setOutput(ios);
            jpegWriter.write(null, new IIOImage(image, null, null), jpegParams);
        } finally {
            jpegWriter.dispose();
        }
    }

    // Método para verificar o status do WhatsApp
    public static String getWhatsAppStatus() {
        String result = "";
        try {
            URL url = new URL("http://localhost:3000/status");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            int code = conn.getResponseCode();
            if (code == 200) {
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
                result = response.toString();
            } else {
                System.out.println("Erro ao verificar status: " + code);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void iniciarWhatsApp() {
        // Verificar se a porta 3000 está em uso
        if (isPortInUse(3000)) {
            System.out.println("A porta 3000 está em uso. Tentando fechá-la...");
            closePort(3000);
        } else {
            System.out.println("A porta 3000 está livre. Iniciando o servidor Node.js...");
        }

        // Criar um ProcessBuilder para iniciar o servidor Node.js no cmd
        ProcessBuilder processBuilder = new ProcessBuilder("cmd.exe", "/c", "start", "cmd.exe", "/k", "cd " + projectDirs + " && node index.js");

        processBuilder.inheritIO(); // Isso herda a saída e erro do processo pai (console)

        try {
            // Iniciar o processo
            Process process = processBuilder.start();

            System.out.println("Servidor Node.js iniciado com sucesso!");

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Erro ao iniciar o servidor Node.js.");
        }
    }

    // Método para verificar se a porta está em uso
    private static boolean isPortInUse(int port) {
        String command = "netstat -ano | findstr :" + port;
        try {
            Process process = Runtime.getRuntime().exec(command);
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            return reader.readLine() != null; // Se houver uma linha, a porta está em uso
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Método para fechar a porta (terminar o processo que está usando a porta)
    private static void closePort(int port) {
        String command = "netstat -ano | findstr :" + port;
        try {
            Process process = Runtime.getRuntime().exec(command);
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                // Extrair o PID da linha que contém o uso da porta
                String[] parts = line.trim().split("\\s+");
                String pid = parts[parts.length - 1]; // O PID é o último elemento
                System.out.println("Fechando o processo com PID: " + pid);
                // Matar o processo
                Runtime.getRuntime().exec("taskkill /PID " + pid + " /F");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para encerrar o servidor Node.js via endpoint HTTP
    public static void shutdownServer() {
        try {
            // Configura a URL para a chamada ao endpoint de shutdown
            URL url = new URL("http://localhost:3000/shutdown");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            // Define o método como POST
            conn.setRequestMethod("POST");
            conn.setDoOutput(true); // Permite enviar dados na requisição

            // Envia a requisição POST
            try (OutputStream os = conn.getOutputStream()) {
                byte[] input = "{}".getBytes("utf-8"); // Corpo vazio para a requisição
                os.write(input, 0, input.length);
            }

            // Verifica a resposta do servidor
            int responseCode = conn.getResponseCode();
            if (responseCode == 200) {
                System.out.println("Servidor encerrado com sucesso.");
            } else {
                System.out.println("Erro ao encerrar o servidor. Código: " + responseCode);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
