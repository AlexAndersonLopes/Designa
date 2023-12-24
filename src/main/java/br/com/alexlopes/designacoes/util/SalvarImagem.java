package br.com.alexlopes.designacoes.util;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SalvarImagem {

    private final String cam = System.getProperty("user.home") + "\\OneDrive\\Área de Trabalho\\Designações\\";

    
    public void salvar(BufferedImage imagem, String nome, String mes) {
        // Crie o nome do arquivo
        String seguir = nome + ".jpg";
        String caminho = cam + mes + "\\" + seguir;

        // Verificar e criar o diretório do mês se necessário
        Path directoryPath = Paths.get(cam + mes);
        try {
            Files.createDirectories(directoryPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            File file = new File(caminho);
            ImageIO.write(imagem, "jpg", file);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
