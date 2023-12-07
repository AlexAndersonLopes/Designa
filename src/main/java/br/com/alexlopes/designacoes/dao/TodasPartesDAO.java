package br.com.alexlopes.designacoes.dao;

import br.com.alexlopes.designacoes.fabrica.FabricaJPA;
import br.com.alexlopes.designacoes.model.TodasPartes;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;
import java.util.List;

public class TodasPartesDAO {
      
    // Método para criar a tabela TodasPartes
    public static void criarTabela() {
        EntityManager em = FabricaJPA.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            String createTableSQL = "CREATE TABLE TodasPartes (id INT NOT NULL GENERATED ALWAYS AS IDENTITY PRIMARY KEY, dia VARCHAR(3) NOT NULL, mes VARCHAR(15) NOT NULL, ano VARCHAR(15) NOT NULL, semana VARCHAR(100) NOT NULL, presidenteA VARCHAR(100) DEFAULT '_________', presidenteB VARCHAR(100) DEFAULT '_________', oracaoInicial VARCHAR(100) DEFAULT '_________', labelTesouros VARCHAR(100) DEFAULT '_________',tesouros VARCHAR(100) DEFAULT '_________', joias VARCHAR(100) DEFAULT '_________', leituraBibliaA VARCHAR(100) DEFAULT '_________', leituraBibliaB VARCHAR(100) DEFAULT '_________', nomeParte1 VARCHAR(100) DEFAULT '_________', parte1A VARCHAR(100) DEFAULT '_________', ajudante1A VARCHAR(100) DEFAULT '_________', parte1B VARCHAR(100) DEFAULT '_________', ajudante1B VARCHAR(100) DEFAULT '_________', nomeParte2 VARCHAR(100) DEFAULT '_________', parte2A VARCHAR(100) DEFAULT '_________', ajudante2A VARCHAR(100) DEFAULT '_________', parte2B VARCHAR(100) DEFAULT '_________', ajudante2B VARCHAR(100) DEFAULT '_________', nomeparte3 VARCHAR(100) DEFAULT '_________', parte3A VARCHAR(100) DEFAULT '_________', ajudante3A VARCHAR(100) DEFAULT '_________', parte3B VARCHAR(100) DEFAULT '_________', ajudante3B VARCHAR(100) DEFAULT '_________', nomeParte4 VARCHAR(100) DEFAULT'________', parte4A VARCHAR(100) DEFAULT '________', ajudante4A VARCHAR(100) DEFAULT '_______', parte4B VARCHAR(100) DEFAULT '________',ajudante4B VARCHAR(100) DEFAULT '________', labelNossaVida1 VARCHAR(100) DEFAULT '________', nossaVida1 VARCHAR(100) DEFAULT '_________', labelNossaVida2 VARCHAR(100) DEFAULT '________', nossaVida2 VARCHAR(100) DEFAULT '_________', estudoLivro VARCHAR(100) DEFAULT '_________', leitor VARCHAR(100) DEFAULT '_________', oracaoFinal VARCHAR(100) DEFAULT '_________')";
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
