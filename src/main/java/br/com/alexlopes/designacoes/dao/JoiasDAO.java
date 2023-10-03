package br.com.alexlopes.designacoes.dao;

import br.com.alexlopes.designacoes.fabrica.FabricaJPA;
import br.com.alexlopes.designacoes.model.Joias;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;
import java.time.LocalDate;
import java.util.List;
import java.util.Random;

public class JoiasDAO {

    //Cadastrar os designados para as Joias da reunião de meio de semana
    public void cadastrar(Joias a) {
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

    // Verificar se existe um registro de joias com base no ID da pessoa
    public boolean verificarExistenciaJoiaPorPessoaId(int pessoaId) {
        EntityManager em = FabricaJPA.getEntityManager();
        String jpql = "SELECT COUNT(j) FROM Joias j WHERE j.pessoa.id = :pessoaId";
        TypedQuery<Long> query = em.createQuery(jpql, Long.class);
        query.setParameter("pessoaId", pessoaId);
        Long resultado = query.getSingleResult();

        return resultado > 0;
    }

    // Excluir registro de Joias com base no ID da pessoa
    public void excluirJoiaPorPessoaId(int pessoaId) {
        EntityManager em = FabricaJPA.getEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();

            // Primeiro, verifique se a joia existe
            Joias joia = em.createQuery("SELECT j FROM Joias j WHERE j.pessoa.id = :pessoaId", Joias.class)
                    .setParameter("pessoaId", pessoaId)
                    .getSingleResult();

            if (joia != null) {
                em.remove(joia); // Exclua a joia encontrada
                tx.commit();
            } else {
                tx.rollback();
            }
        } catch (NoResultException e) {
            // Trate o caso em que nenhuma joia com o ID de pessoa especificado foi encontrada
            tx.rollback();
            System.out.println("Joia não encontrada com o ID de pessoa: " + pessoaId);
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            e.printStackTrace(); // Tratar exceções ou fazer o registro de erro adequado aqui
        } finally {
            if (em != null && em.isOpen()) {
                em.close(); // Feche o EntityManager apenas se estiver aberto
            }
        }
    }

    // Método para buscar uma Joias com data nula ou a mais antiga (se não houver data nula), ignorando uma lista de pessoas
    public Joias buscarJoiaSemDataMaisAntigaParaPessoas(List<Integer> idsPessoasIgnorar) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            String queryString = "SELECT j FROM Joias j WHERE j.pessoa.id NOT IN (:idsPessoasIgnorar) ORDER BY j.data ASC NULLS FIRST";
            TypedQuery<Joias> query = em.createQuery(queryString, Joias.class)
                    .setParameter("idsPessoasIgnorar", idsPessoasIgnorar)
                    .setMaxResults(1);
            List<Joias> joias = query.getResultList();
            if (!joias.isEmpty()) {
                return joias.get(0);
            }
        } catch (Exception e) {
            return buscarJoiaSemDataMaisAntigaParaPessoas2();
        } finally {
            FabricaJPA.closeEtityManager();
        }
        return null;
    }

    public Joias buscarJoiaSemDataMaisAntigaParaPessoas2() {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            String queryString = "SELECT j FROM Joias j ORDER BY j.data ASC NULLS FIRST";
            TypedQuery<Joias> query = em.createQuery(queryString, Joias.class);
            List<Joias> joias = query.getResultList();
            if (!joias.isEmpty()) {
                Random random = new Random();
                int indiceAleatorio = random.nextInt(joias.size());
                return joias.get(indiceAleatorio);
            }
        } finally {
            FabricaJPA.closeEtityManager();
        }
        return null;
    }

    // Método para alterar a data de uma joia
    public void alterarDataJoia(int joiaId, LocalDate novaData) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            em.getTransaction().begin();
            Joias joias = em.find(Joias.class, joiaId);
            if (joias != null) {
                joias.setData(novaData);
                em.merge(joias);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
            throw e;
        } finally {
            FabricaJPA.closeEtityManager();
        }
    }

    //BUSCAR TODAS JOIAS ORDENADO POR DATA
    public List<Object[]> buscarNomesJoiasOrdenadosPorDataMaisAntiga() {
        EntityManager em = FabricaJPA.getEntityManager();
        String jpql = "SELECT CONCAT(p.pessoa.nome, ' ', p.pessoa.sobrenome), p.data FROM Joias p ORDER BY p.data";
        TypedQuery<Object[]> query = em.createQuery(jpql, Object[].class);
        return query.getResultList();
    }

    //Buscar pessoa por id
    public Joias buscarPorIdPessoa(int idPessoa) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            String jpql = "SELECT p FROM Joias p WHERE p.pessoa.id = :idPessoa";
            TypedQuery<Joias> query = em.createQuery(jpql, Joias.class);
            query.setParameter("idPessoa", idPessoa);
            List<Joias> resultados = query.getResultList();
            if (!resultados.isEmpty()) {
                return resultados.get(0);
            }
            return null; // Retorna nulo se não encontrar um presidente com o ID da pessoa
        } finally {
            em.close();
        }
    }

}
