package br.com.alexlopes.designacoes.dao;

import br.com.alexlopes.designacoes.fabrica.FabricaJPA;
import br.com.alexlopes.designacoes.model.Semana;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;
import java.time.LocalDate;
import java.util.List;

public class SemanaDAO {
    
    // Método para criar a tabela semana
    public static void criarTabela() {
        EntityManager em = FabricaJPA.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            String createTableSQL = "CREATE TABLE Semana (id INT NOT NULL GENERATED ALWAYS AS IDENTITY PRIMARY KEY, data DATE NOT NULL)";
            em.createNativeQuery(createTableSQL).executeUpdate();
            tx.commit();
            System.out.println("Tabela semana criada com sucesso.");
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            if (em != null && em.isOpen()) {
                em.close();
            }
        }
    }

    public void cadastrar(Semana a) {
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

    //Verificar se a data ja esta cadastrada no sistema
    public boolean verificarDataCadastrada(LocalDate data) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            String jpql = "SELECT COUNT(s) FROM Semana s WHERE s.data = :data";
            TypedQuery<Long> query = em.createQuery(jpql, Long.class)
                    .setParameter("data", data);
            Long count = query.getSingleResult();
            return count > 0;
        } finally {
            FabricaJPA.closeEtityManager();
        }
    }
    
    //Mostrar todas as semanas cadastradas, na classe substituição
    public List<Semana> listarSemanasOrdenadasPorDataDesc() {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            String jpql = "SELECT s FROM Semana s ORDER BY s.data DESC";
            TypedQuery<Semana> query = em.createQuery(jpql, Semana.class);
            return query.getResultList();
        } finally {
            FabricaJPA.closeEtityManager();
        }
    }

}
