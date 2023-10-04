package br.com.alexlopes.designacoes.util;

import java.util.Properties;
import java.util.Random;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class ClasseEmail {

    private final String host = "smtp.gmail.com";
    private final String username = "alex91lopes@gmail.com";
    private final String password = "vggqwmeqvtvcfnyt";
    private final Properties props;

    public ClasseEmail() {
        props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", "587");
    }

    public String emailValidarCadastro(String to, String subject, String content) {
        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });
        try {
            // Gera uma senha aleatória
            String generatedPassword = generateRandomPassword();
            // Cria uma mensagem de e-mail
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject(subject);
            // Cria o conteúdo do e-mail com a senha gerada
            String emailContent = content + "\n\nPara confirmar o seu cadastro, \ncopie o seguinte código: " + generatedPassword;
            message.setText(emailContent);
            // Envia o e-mail
            Transport.send(message);
            return generatedPassword;

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

    public String emailValidarAlterar(String to, String subject, String content) {
        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });
        try {
            // Gera uma senha aleatória
            String generatedPassword = generateRandomPassword();
            // Cria uma mensagem de e-mail
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject(subject);
            // Cria o conteúdo do e-mail com a senha gerada
            String emailContent = content + "\n\nSe é você que está tentando alterar os seus dados, \ncopie o seguinte código: " + generatedPassword;
            message.setText(emailContent);
            // Envia o e-mail
            Transport.send(message);
            return generatedPassword;

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

    public String emailValidarAlterarSenha(String to, String subject, String content) {
        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });
        try {
            // Gera uma senha aleatória
            String generatedPassword = generateRandomPassword();
            // Cria uma mensagem de e-mail
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject(subject);
            // Cria o conteúdo do e-mail com a senha gerada
            String emailContent = content + "\n\nPara gerar uma nova Senha, \ncopie o seguinte código: " + generatedPassword;
            message.setText(emailContent);
            // Envia o e-mail
            Transport.send(message);
            return generatedPassword;

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

    private String generateRandomPassword() {
        // Define os caracteres que podem estar na senha aleatória
        String allowedChars = "0123456789";
        // Define o tamanho da senha
        int passwordLength = 6;
        // Gera a senha aleatória
        StringBuilder sb = new StringBuilder(passwordLength);
        Random random = new Random();
        for (int i = 0; i < passwordLength; i++) {
            int randomIndex = random.nextInt(allowedChars.length());
            char randomChar = allowedChars.charAt(randomIndex);
            sb.append(randomChar);
        }
        return sb.toString();
    }

    public void enviarEmail(String titulo, String texto) {
        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(username));
            message.setSubject(titulo);
            message.setText(texto);
            // Envia o e-mail
            Transport.send(message);
            Mensagem.mensagemExito("Email enviado com Sucesso para o Desenvolvedor");
        } catch (MessagingException e) {
            Mensagem.mensagemErro("Tente novamente mais tarde");
        }
    }

}
