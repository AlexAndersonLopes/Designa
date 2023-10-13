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
import br.com.alexlopes.designacoes.util.Mensagem;
import java.io.File;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Designacoes {

    public static void main(String[] args) {
        
        if (!bancoDeDadosExiste()) {
            criarBancoDeDados();
            criarTabelas();
            Janela.irCadastrarUsuario();
        } else {
            Janela.irEntrar();
        }
    }
/*
    public static boolean bancoDeDadosExiste() {
        try {
            DriverManager.getConnection("jdbc:derby:pessoa_db");
            return true;
        } catch (SQLException e) {
            Mensagem.mensagemErro("ERRO");
            return false;
        }
    }*/
    public static boolean bancoDeDadosExiste() {
        // Verifique se o diretório do banco de dados existe
        File databaseDir = new File("pessoa_db");
        return databaseDir.exists();
    }
    

    public static boolean tabelaUsuarioExiste() {
        try {
            // Verifica se a tabela de usuário existe no banco de dados
            DatabaseMetaData metaData = DriverManager.getConnection("jdbc:derby:pessoa_db").getMetaData();
            ResultSet tables = metaData.getTables(null, null, "Usuario", null);
            return tables.next();
        } catch (SQLException e) {           
            return false;
        }
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
            e.printStackTrace();
        }
    }


}