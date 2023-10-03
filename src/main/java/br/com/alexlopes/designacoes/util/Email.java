package br.com.alexlopes.designacoes.util;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.util.ByteArrayDataSource;


public class Email {

    private final String host = "smtp.gmail.com";
    private final String username = "alex91lopes@gmail.com";
    private final String password = "vggqwmeqvtvcfnyt";
    private final Properties props;

    public Email() {
        props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", "587");
    }

      public void enviarEmail(Session session, String to, String subject, String content, BufferedImage imagem) {
        try {
            // Cria uma mensagem de e-mail
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject(subject);

            // Cria o conteúdo principal do e-mail (opcional)
            MimeBodyPart textPart = new MimeBodyPart();
            textPart.setText(content);

            // Cria o conteúdo do e-mail com a imagem
            MimeBodyPart imagePart = new MimeBodyPart();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            javax.imageio.ImageIO.write(imagem, "jpg", baos);
            byte[] bytes = baos.toByteArray();
            DataSource imageDataSource = new ByteArrayDataSource(bytes, "image/jpeg");
            imagePart.setDataHandler(new DataHandler(imageDataSource));
            imagePart.setFileName("TesteDesignação.jpg");

            // Cria um Multipart e adiciona as partes
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(textPart);
            multipart.addBodyPart(imagePart);

            // Define o conteúdo do e-mail como o Multipart
            message.setContent(multipart);

            // Envia o e-mail
            Transport.send(message, username, password);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}