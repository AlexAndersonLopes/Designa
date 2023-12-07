package br.com.alexlopes.designacoes.dao;

import br.com.alexlopes.designacoes.fabrica.FabricaJPA;
import br.com.alexlopes.designacoes.model.Parte;
import br.com.alexlopes.designacoes.model.Pessoa;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;
import java.util.List;

public class ParteDAO {

    // Método para criar a tabela parte
    public static void criarTabela() {
        EntityManager em = FabricaJPA.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            String createTableSQL = "CREATE TABLE Parte (id INT NOT NULL GENERATED ALWAYS AS IDENTITY PRIMARY KEY, descricao VARCHAR(50) NOT NULL, pessoa_id INT NOT NULL, FOREIGN KEY (pessoa_id) REFERENCES pessoa(id) ON DELETE CASCADE)";
            em.createNativeQuery(createTableSQL).executeUpdate();
            tx.commit();
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
        } finally {
            if (em.isOpen()) {
                FabricaJPA.closeEtityManager();
            }
        }
    }

    public void cadastrar(Parte a) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(a);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            FabricaJPA.closeEtityManager();
        }
    }

    public List<Parte> buscarPartesPorIdPessoa(int idPessoa) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            TypedQuery<Parte> query = em.createQuery("SELECT p FROM Parte p WHERE p.pessoa.id = :idPessoa", Parte.class);
            query.setParameter("idPessoa", idPessoa);
            return query.getResultList();
        } finally {
            FabricaJPA.closeEtityManager();
        }
    }

    public void excluirPartesPorIdPessoa(int idPessoa) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            em.getTransaction().begin();
            // Busca as partes associadas à pessoa pelo id
            TypedQuery<Parte> query = em.createQuery("SELECT p FROM Parte p WHERE p.pessoa.id = :idPessoa", Parte.class);
            query.setParameter("idPessoa", idPessoa);
            List<Parte> partes = query.getResultList();
            // Exclui as partes encontradas
            for (Parte parte : partes) {
                em.remove(parte);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
        } finally {
            FabricaJPA.closeEtityManager();
        }
    }
/*
    //excluir pessoa que tenha tal descição
    public void excluirPorDescricaoEPessoa(String descricao, Pessoa pessoa) {
        EntityManager em = FabricaJPA.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            TypedQuery<Parte> query = em.createQuery("SELECT p FROM Parte p WHERE p.descricao = :descricao AND p.pessoa = :pessoa", Parte.class);
            query.setParameter("descricao", descricao);
            query.setParameter("pessoa", pessoa);
            List<Parte> partes = query.getResultList();
            for (Parte parte : partes) {
                em.remove(parte);
            }
            tx.commit();
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            throw e;
        } finally {
            FabricaJPA.closeEtityManager();
        }
    }
    
    //verifica se a pessoa tem tal descrição depois chamar o metodo esxluir
    public boolean pessoaPossuiDescricao(Pessoa pessoa, String descricao) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            TypedQuery<Long> query = em.createQuery(
                "SELECT COUNT(p) FROM Parte p WHERE p.pessoa = :pessoa AND p.descricao = :descricao",
                Long.class
            );
            query.setParameter("pessoa", pessoa);
            query.setParameter("descricao", descricao);

            Long count = query.getSingleResult();

            return count > 0;
        } finally {
            FabricaJPA.closeEtityManager();
        }
    }
*/
}
