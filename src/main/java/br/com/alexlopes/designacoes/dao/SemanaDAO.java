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
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
        } finally {
            if (em.isOpen()) {
                em.close();
            }
        }
    }

    public void cadastrar(Semana a) {
        EntityManager em = FabricaJPA.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            // Verifica se a semana já está cadastrada pela data
            Semana semanaExistente = em.createQuery("SELECT s FROM Semana s WHERE s.data = :data", Semana.class)
                    .setParameter("data", a.getData())
                    .getResultList()
                    .stream()
                    .findFirst()
                    .orElse(null);
            if (semanaExistente != null) {
                // Se a semana já existe, atualizar os dados
                semanaExistente.setData(a.getData());
            } else {
                // Se a semana não existe, fazer o cadastro normalmente
                em.persist(a);
            }
            tx.commit();
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            throw e;
        } finally {
            em.close();
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
            em.close();
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
            em.close();
        }
    }

    public void excluirSemana(int id) {
        EntityManager em = FabricaJPA.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            Semana semanaParaExcluir = em.find(Semana.class, id);
            if (semanaParaExcluir != null) {
                em.remove(semanaParaExcluir);
            }
            tx.commit();
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            throw e;
        } finally {
            if (em != null && em.isOpen()) {
                em.close();
            }
        }
    }

    public Semana buscarSemanaPorId(int id) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            return em.find(Semana.class, id);
        } finally {
            if (em != null && em.isOpen()) {
                em.close();
            }
        }
    }

}
