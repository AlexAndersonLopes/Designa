package br.com.alexlopes.designacoes.util;

import javax.swing.JOptionPane;

public class Mensagem {
    
    /**
     * Mensagem de alerta para o usuario
     *
     * @param e
     */
    public static void mensagemAlerta(String e) {
        String[] options = {"Fechar"};
        int selectedOption = JOptionPane.showOptionDialog(null, e, "Atenção",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
    }

    /**
     * Mensagem de erro para o usuario
     *
     * @param e
     */
    public static void mensagemErro(String e) {
        String[] options = {"Fechar"};
        int selectedOption = JOptionPane.showOptionDialog(null, e, "Erro",
                JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE, null, options, options[0]);
    }

    /**
     * Mensagem de sucesso para o usuario
     *
     * @param e
     */
    public static void mensagemExito(String e) {
        String[] options = {"Fechar"};
        int selectedOption = JOptionPane.showOptionDialog(null, e, "Sucesso",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
    }
    
}
