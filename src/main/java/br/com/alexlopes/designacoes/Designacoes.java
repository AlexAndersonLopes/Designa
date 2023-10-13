package br.com.alexlopes.designacoes;

import br.com.alexlopes.designacoes.dao.EstudoBiblicoCongregacaoDAO;
import br.com.alexlopes.designacoes.dao.JoiasDAO;
import br.com.alexlopes.designacoes.dao.LeitorDAO;
import br.com.alexlopes.designacoes.dao.NossaVidaDAO;
import br.com.alexlopes.designacoes.dao.OracaoDAO;
import br.com.alexlopes.designacoes.dao.ParteDAO;
import br.com.alexlopes.designacoes.dao.PessoaDAO;
import br.com.alexlopes.designacoes.dao.PresidenteDAO;
import br.com.alexlopes.designacoes.dao.SemanaDAO;
import br.com.alexlopes.designacoes.dao.TesourosDAO;
import br.com.alexlopes.designacoes.dao.TodasPartesDAO;
import br.com.alexlopes.designacoes.dao.UsuarioDAO;
import br.com.alexlopes.designacoes.util.Janela;
import java.io.File;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Designacoes {

    public static void main(String[] args) {

        if (!bancoDeDadosExiste() || !UsuarioDAO.tabelaUsuarioPossuiRegistros()) {
            if (!bancoDeDadosExiste()) {
                criarBancoDeDados();
                criarTabelas();
            }
            Janela.irCadastrarUsuario();
        } else {
            Janela.irEntrar();
        }
    }

    public static boolean bancoDeDadosExiste() {
        File databaseDir = new File("pessoa_db");
        return databaseDir.exists();
    }

    public static void criarTabelas() {
        PessoaDAO.criarTabela();
        ParteDAO.criarTabela();
        EstudoBiblicoCongregacaoDAO.criarTabela();
        JoiasDAO.criarTabela();
        LeitorDAO.criarTabela();
        NossaVidaDAO.criarTabela();
        OracaoDAO.criarTabela();
        PresidenteDAO.criarTabela();
        SemanaDAO.criarTabela();
        TesourosDAO.criarTabela();
        TodasPartesDAO.criarTabela();
        UsuarioDAO.criarTabela();
    }

    public static void criarBancoDeDados() {
        String url = "jdbc:derby:pessoa_db;create=true";
        try {
            DriverManager.getConnection(url);
            System.out.println("Banco de dados criado com sucesso.");
        } catch (SQLException e) {
        }
    }

}
