package br.com.alexlopes.designacoes.dao;

import br.com.alexlopes.designacoes.fabrica.FabricaJPA;
import br.com.alexlopes.designacoes.model.TodasPartes;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.List;

public class TodasPartesDAO {

    public void cadastrar(TodasPartes a) {
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

    public TodasPartes buscarPorId(int id) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            TodasPartes todasPartes = em.find(TodasPartes.class, id);
            return todasPartes;
        } finally {
            FabricaJPA.closeEtityManager();
        }
    }

    //ATUALIZAR
    public void atualizar(TodasPartes a) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(a);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
            throw e;
        } finally {
            FabricaJPA.closeEtityManager();
        }
    }

    public List<TodasPartes> buscarPorMesEAno(String mes, String ano) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            String queryString = "SELECT t FROM TodasPartes t WHERE t.mes = :mesParam AND t.ano = :anoParam";
            TypedQuery<TodasPartes> query = em.createQuery(queryString, TodasPartes.class);
            query.setParameter("mesParam", mes);
            query.setParameter("anoParam", ano);

            List<TodasPartes> resultList = query.getResultList();
            return resultList;
        } finally {
            FabricaJPA.closeEtityManager();
        }
    }

    //buscar por semana, classe substituição
    public TodasPartes buscarPorSemana(String semanaUsuario) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            // Use a função SUBSTRING para extrair a parte da data da coluna "semana" (ignorando "Semana: ").
            String queryString = "SELECT t FROM TodasPartes t WHERE SUBSTRING(t.semana, 9) = :semanaParam";
            TypedQuery<TodasPartes> query = em.createQuery(queryString, TodasPartes.class);
            query.setParameter("semanaParam", semanaUsuario);

            // Use getSingleResult para retornar uma única instância.
            TodasPartes resultado = query.getSingleResult();
            return resultado;
        } finally {
            FabricaJPA.closeEtityManager();
        }
    }

}
