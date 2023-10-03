package br.com.alexlopes.designacoes.dao;

import br.com.alexlopes.designacoes.fabrica.FabricaJPA;
import br.com.alexlopes.designacoes.model.Semana;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.time.LocalDate;
import java.util.List;

public class SemanaDAO {

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
