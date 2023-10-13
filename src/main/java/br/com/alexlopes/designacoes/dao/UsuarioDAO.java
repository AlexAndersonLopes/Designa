package br.com.alexlopes.designacoes.dao;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import br.com.alexlopes.designacoes.fabrica.FabricaJPA;
import br.com.alexlopes.designacoes.model.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

public class UsuarioDAO {

    // Método para criar a tabela Usuario
    public static void criarTabela() {
        EntityManager em = FabricaJPA.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            String createTableSQL = "CREATE TABLE Usuario (id INT NOT NULL GENERATED ALWAYS AS IDENTITY PRIMARY KEY, nome VARCHAR(100) NOT NULL, email VARCHAR(100) NOT NULL, celular VARCHAR(15) NOT NULL, senha VARCHAR(64) NOT NULL)";
            em.createNativeQuery(createTableSQL).executeUpdate();
            tx.commit();
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            if (em != null && em.isOpen()) {
                FabricaJPA.closeEtityManager();
            }
        }
    }

    public static boolean tabelaUsuarioExiste() {
    EntityManager em = FabricaJPA.getEntityManager();
    try {
        List<?> result = em.createNativeQuery("SELECT 1 FROM Usuario").getResultList();
        return !result.isEmpty();
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    } finally {
        if (em != null && em.isOpen()) {
            FabricaJPA.closeEtityManager();
        }
    }
}

public static boolean tabelaUsuarioPossuiRegistros() {
    if (tabelaUsuarioExiste()) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            Long count = em.createQuery("SELECT COUNT(u) FROM Usuario u", Long.class).getSingleResult();
            return count > 0;
        } finally {
            if (em != null && em.isOpen()) {
                FabricaJPA.closeEtityManager();
            }
        }
    }
    return false; // Retorna false se a tabela não existir.
}


    public void cadastrar(Usuario a) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(a);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.getStackTrace();
            em.getTransaction().rollback();
            throw e;
        } finally {
            FabricaJPA.closeEtityManager();
        }
    }

    public String calculateSHA256(char[] password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(new String(password).getBytes());
            byte[] digest = md.digest();
            BigInteger no = new BigInteger(1, digest);
            String hash = no.toString(16);
            while (hash.length() < 64) {
                hash = "0" + hash;
            }
            return hash;
        } catch (NoSuchAlgorithmException e) {
            // Trate a exceção adequadamente
            System.out.println(e);
        }
        return null;
    }

    public boolean existeUsuariosCadastrados() {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            String jpql = "SELECT COUNT(u) FROM Usuario u";
            TypedQuery<Long> query = em.createQuery(jpql, Long.class);
            Long resultado = query.getSingleResult();
            return resultado > 0;
        } finally {
            FabricaJPA.closeEtityManager();
        }
    }

    //Retornar o nome do usuario   NoResultException 
    public Usuario obterUsuarioUnico() {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            String jpql = "SELECT u FROM Usuario u";
            TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
            return query.getSingleResult();
        } finally {
            FabricaJPA.closeEtityManager();
        }
    }

    public Usuario verificarCredenciais(String nomeUsuario, String senha) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            // Consulta o banco de dados para encontrar um usuário com o nome fornecido
            TypedQuery<Usuario> query = em.createQuery("SELECT u FROM Usuario u WHERE u.nome = :nomeUsuario", Usuario.class);
            query.setParameter("nomeUsuario", nomeUsuario);
            Usuario usuario = query.getSingleResult();

            if (usuario.getNome().equals(nomeUsuario) && senha.equals(usuario.getSenha())) {
                return usuario; // Credenciais válidas, retorna o objeto Usuario
            } else {
                return null; // Senha incorreta ou nome de usuário com diferença de maiúsculas/minúsculas, retorna null
            }
        } catch (NoResultException e) {
            // Usuário não encontrado, retorna null
            return null;
        } finally {
            FabricaJPA.closeEtityManager();
        }
    }

    public boolean alterarSenha(int usuarioId, String novaSenha) {
        EntityManager em = FabricaJPA.getEntityManager();
        EntityTransaction transaction = em.getTransaction();

        try {
            transaction.begin();
            Usuario usuario = em.find(Usuario.class, usuarioId);

            if (usuario != null) {
                // Atualizar a senha do usuário
                usuario.setSenha(novaSenha);
                transaction.commit();
                return true;
            }
        } catch (Exception e) {
            e.getStackTrace();
        } finally {
            FabricaJPA.closeEtityManager();
        }
        return false;
    }

    public boolean alterarUsuario(int usuarioId, String nome, String email, String celular, String senha) {
        EntityManager em = FabricaJPA.getEntityManager();
        EntityTransaction transaction = em.getTransaction();

        try {
            transaction.begin();
            Usuario usuario = em.find(Usuario.class, usuarioId);

            if (usuario != null) {
                // Atualizar os campos do usuário com os novos valores
                usuario.setNome(nome);
                usuario.setEmail(email);
                usuario.setCelular(celular);
                usuario.setSenha(senha);

                transaction.commit();
                return true;
            }
        } catch (Exception e) {
            e.getStackTrace();
        } finally {
            FabricaJPA.closeEtityManager();
        }
        return false;
    }

}
