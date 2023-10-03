package br.com.alexlopes.designacoes;

import br.com.alexlopes.designacoes.dao.UsuarioDAO;
import br.com.alexlopes.designacoes.util.Janela;

public class Designacoes {

    public static void main(String[] args) {

        UsuarioDAO dao = new UsuarioDAO();

        if (!dao.existeUsuariosCadastrados()) {
            Janela.irCadastrarUsuario();
        } else {
            Janela.irEntrar();
        }

    }
}
