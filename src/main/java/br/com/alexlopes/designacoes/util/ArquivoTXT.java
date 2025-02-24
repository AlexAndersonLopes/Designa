package br.com.alexlopes.designacoes.util;

import br.com.alexlopes.designacoes.model.TodasPartes;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class ArquivoTXT {

  //private final String cam = System.getProperty("user.home") + "\\OneDrive\\Área de Trabalho\\Designações\\";
    private final String cam = System.getProperty("user.home") + "\\Designações\\";
    private String seguir;
    private String caminho;

    public void salvarDados(TodasPartes dados) throws IOException {
        try {
            seguir = "Designados" + dados.getMes() + dados.getAno() + ".txt";
            caminho = cam + seguir;

            File file = new File(caminho);
            if (!verificarArquivoExiste()) {
                criarArquivo();
            }

            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String dadosFormatados = "\n\n\n\t\t" + dados.getSemana() 
                    + "\n\nPresidente Sala A: " + dados.getPresidenteA()
                    + "\n\tPresidente Sala B: " 
                    + dados.getPresidenteB() + "\n\nOração Inicial: " + dados.getOracaoInicial()
                    + "\nTesouros: " + dados.getTesouros() 
                    + "\nJoias: " + dados.getJoias()
                    + "\n\tLeitura da Bíblia Sala B: " + dados.getLeituraBibliaB()
                    + "\n_____SALA A_____\n" 
                    + "\nLeitura da Bíblia Sala A: " + dados.getLeituraBibliaA()
                    + "\n\n" + dados.getNomeParte1() + " " + dados.getParte1A() 
                    + "\nAjudante: " + dados.getAjudante1A()
                    + "\n\n" + dados.getNomeParte2() + " " + dados.getParte2A() 
                    + "\nAjudante: " + dados.getAjudante2A()
                    + "\n\n" + dados.getNomeparte3() + " " + dados.getParte3A() 
                    + "\nAjudante: " + dados.getAjudante3A()
                    + "\n\n\t_____SALA B_____\n" 
                    + "\n\n\tLeitura da Bíblia Sala B: " + dados.getLeituraBibliaB()
                    + "\n\t" + dados.getNomeParte1() + " " + dados.getParte1B() 
                    + "\n\tAjudante: " + dados.getParte1B()
                    + "\n\n\t" + dados.getNomeParte2() + " " + dados.getParte2B() 
                    + "\n\tAjudante: " + dados.getAjudante2B()
                    + "\n\n\t" + dados.getNomeparte3() + " " + dados.getParte3B() 
                    + "\n\tAjudante: " + dados.getAjudante3B()
                    + "\n\nNossa Vida Cristã parte 1: " + dados.getNossaVida1() 
                    + "\nNossa Vida Cristã parte 2: " + dados.getNossaVida2()
                    + "\nEstudo de Livro: " + dados.getEstudoLivro() 
                    + "\n\tLeitor: " + dados.getLeitor()
                    + "\nOração Final: " + dados.getOracaoFinal();

            bufferedWriter.write(dadosFormatados);
            bufferedWriter.newLine();
            bufferedWriter.close();
            fileWriter.close();
            JOptionPane.showMessageDialog(null, "Dados gravados com Sucesso");

        } catch (HeadlessException | IOException e) {
            JOptionPane.showMessageDialog(null, "ERRO ao salvar o arquivo de texto");
        }
    }

    public boolean verificarArquivoExiste() {
        File file = new File(caminho);
        return file.exists();
    }

    public void criarArquivo() throws IOException {
        File file = new File(caminho);
        file.getParentFile().mkdirs();

        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("");
        bufferedWriter.newLine();
        bufferedWriter.close();
        fileWriter.close();
        try {
            file.createNewFile();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "ERRO ao criar o arquivo de texto");
        }
    }

    public String lerArquivo() {
        if (verificarArquivoExiste()) {
            StringBuilder conteudoArquivo = new StringBuilder();
            try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
                String linha;
                while ((linha = br.readLine()) != null) {
                    conteudoArquivo.append(linha).append("\n");
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Erro ao ler o arquivo: ");
            }
            return conteudoArquivo.toString();
        } else {
            return null;
        }
    }

}
