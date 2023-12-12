package br.com.alexlopes.designacoes;

import br.com.alexlopes.designacoes.dao.EstudoBiblicoCongregacaoDAO;
import br.com.alexlopes.designacoes.dao.LeitorDAO;
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

public class Designacoes {

    public static void main(String[] args) {

        if (!bancoDeDadosExiste() || !UsuarioDAO.tabelaUsuarioPossuiRegistros()) {
            if (!bancoDeDadosExiste()) {
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
        LeitorDAO.criarTabela();
        OracaoDAO.criarTabela();
        PresidenteDAO.criarTabela();
        SemanaDAO.criarTabela();
        TesourosDAO.criarTabela();
        TodasPartesDAO.criarTabela();
        UsuarioDAO.criarTabela();
    }

}
/*
<persistence xmlns="https://jakarta.ee/xml/ns/persistence"
             xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
             version="3.0"
             xsi:schemaLocation="https://jakarta.ee/xml/ns/persistence https://jakarta.ee/xml/ns/persistence/persistence_3_0.xsd">
    <persistence-unit name="go" transaction-type="RESOURCE_LOCAL">
        <properties>
            <!-- Configurações do driver e URL do banco de dados -->
            <property name="jakarta.persistence.jdbc.driver" value="org.apache.derby.jdbc.EmbeddedDriver" />
            <property name="jakarta.persistence.jdbc.url" value="jdbc:derby:pessoa_db;create=true" />
            <property name="jakarta.persistence.jdbc.user" value="designa" />
            <property name="jakarta.persistence.jdbc.password" value="123" />

            <!-- Configurações do HikariCP -->
            <property name="hibernate.hikari.connectionTimeout" value="20000" />
            <property name="hibernate.hikari.minimumIdle" value="10" />
            <property name="hibernate.hikari.maximumPoolSize" value="20" />
            <property name="hibernate.hikari.idleTimeout" value="300000" />
            <property name="hibernate.hikari.poolName" value="HikariCP" />
            <property name="hibernate.hikari.autoCommit" value="false" />

            <!-- Outras propriedades do Hibernate -->
            <property name="hibernate.dialect" value="org.hibernate.dialect.DerbyDialect" />
            <property name="hibernate.show_sql" value="true" />
            <property name="hibernate.format_sql" value="true" />
        </properties>
    </persistence-unit>
</persistence>
*/




/*
<?xml version="1.0" encoding="UTF-8"?>
<persistence xmlns="https://jakarta.ee/xml/ns/persistence"
             xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
             version="3.0"
             xsi:schemaLocation="https://jakarta.ee/xml/ns/persistence https://jakarta.ee/xml/ns/persistence/persistence_3_0.xsd">

    <persistence-unit name="go" transaction-type="RESOURCE_LOCAL">
        <properties>
            <property name="jakarta.persistence.jdbc.driver" value="org.apache.derby.jdbc.EmbeddedDriver" />
            <property name="jakarta.persistence.jdbc.url" value="jdbc:derby:pessoa_db;create=true" />
            <property name="jakarta.persistence.jdbc.user" value="designa" />
            <property name="jakarta.persistence.jdbc.password" value="123" />
        </properties>
    </persistence-unit>

</persistence>


*/