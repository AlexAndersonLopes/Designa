package br.com.alexlopes.designacoes.dao;

import br.com.alexlopes.designacoes.fabrica.FabricaJPA;
import br.com.alexlopes.designacoes.model.Leitor;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;
import java.time.LocalDate;
import java.util.List;
import java.util.Random;

public class LeitorDAO {

    // Método para criar a tabela leitor
    public static void criarTabela() {
        EntityManager em = FabricaJPA.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            String createTableSQL = "CREATE TABLE Leitor (id INT NOT NULL GENERATED ALWAYS AS IDENTITY PRIMARY KEY, pessoa INT NOT NULL, data DATE, FOREIGN KEY (pessoa) REFERENCES pessoa(id) ON DELETE CASCADE)";
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

    //Cadastrar os designados para a Leitura do Estudo Biblico de Congregação da reunião de meio de semana
    public void cadastrar(Leitor a) {
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
            em.close();
        }
    }

    // Verificar se existe um registro de leitor com base no ID da pessoa
    public boolean verificarExistenciaLeitorPorPessoaId(int pessoaId) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            String jpql = "SELECT COUNT(l) FROM Leitor l WHERE l.pessoa.id = :pessoaId";
            TypedQuery<Long> query = em.createQuery(jpql, Long.class);
            query.setParameter("pessoaId", pessoaId);
            Long resultado = query.getSingleResult();

            return resultado > 0;
        } catch (Exception e) {
        } finally {
            if (em.isOpen()) {
                em.close();
            }
        }
        return false;
    }

    // Excluir registro de Leitor com base no ID da pessoa
    public void excluirLeitorPorPessoaId(int pessoaId) {
        EntityManager em = FabricaJPA.getEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();

            // Primeiro, verifique se o leitor existe
            Leitor leitor = em.createQuery("SELECT l FROM Leitor l WHERE l.pessoa.id = :pessoaId", Leitor.class)
                    .setParameter("pessoaId", pessoaId)
                    .getSingleResult();

            if (leitor != null) {
                em.remove(leitor); // Exclua o leitor encontrado
                tx.commit();
            } else {
                tx.rollback();
            }
        } catch (NoResultException e) {
            // Trate o caso em que nenhum leitor com o ID de pessoa especificado foi encontrado
            tx.rollback();
            System.out.println("Leitor não encontrado com o ID de pessoa: " + pessoaId);
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

    // Método para buscar um Leitor com data nula ou a mais antiga (se não houver data nula), ignorando uma lista de pessoas
    public Leitor buscarLeitorSemDataMaisAntigaParaPessoas(List<Integer> idsPessoasIgnorar) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            String queryString = "SELECT l FROM Leitor l WHERE l.pessoa.id NOT IN (:idsPessoasIgnorar) ORDER BY l.data ASC NULLS FIRST";
            TypedQuery<Leitor> query = em.createQuery(queryString, Leitor.class)
                    .setParameter("idsPessoasIgnorar", idsPessoasIgnorar)
                    .setMaxResults(1);
            List<Leitor> leitores = query.getResultList();
            if (!leitores.isEmpty()) {
                return leitores.get(0);
            }
        } finally {
            em.close();
        }
        return null;
    }

    public Leitor buscarLeitorSemDataMaisAntigaParaPessoas2() {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            String queryString = "SELECT l FROM Leitor l ORDER BY l.data ASC NULLS FIRST";
            TypedQuery<Leitor> query = em.createQuery(queryString, Leitor.class);

            List<Leitor> leitores = query.getResultList();
            if (!leitores.isEmpty()) {
                // Gerar um índice aleatório dentro do intervalo da lista
                Random random = new Random();
                int indiceAleatorio = random.nextInt(leitores.size());
                return leitores.get(indiceAleatorio);
            }
        } finally {
            em.close();
        }
        return null;
    }

    // Método para alterar a data de um registro em Leitor
    public void alterarDataLeitor(int leitorId, LocalDate novaData) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            em.getTransaction().begin();
            Leitor leitor = em.find(Leitor.class, leitorId);
            if (leitor != null) {
                leitor.setData(novaData);
                em.merge(leitor);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
        } finally {
            em.close();
        }
    }

    //BUSCAR TODAS Leitor ORDENADO POR DATA
    public List<Object[]> buscarNomesLeitorOrdenadosPorDataMaisAntiga(List<Integer> idsIgnorar) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            String jpql = "SELECT p.pessoa.id, CONCAT(p.pessoa.nome, ' ', p.pessoa.sobrenome), p.data FROM Leitor p WHERE p.pessoa.id NOT IN (:idsIgnorar) ORDER BY p.data";
            TypedQuery<Object[]> query = em.createQuery(jpql, Object[].class);
            query.setParameter("idsIgnorar", idsIgnorar);
            return query.getResultList();
        } catch (Exception e) {
        } finally {
            em.close();
        }
        return null;
    }

    //Buscar pessoa por id
    public Leitor buscarPorIdPessoa(int idPessoa) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            String jpql = "SELECT p FROM Leitor p WHERE p.pessoa.id = :idPessoa";
            TypedQuery<Leitor> query = em.createQuery(jpql, Leitor.class);
            query.setParameter("idPessoa", idPessoa);
            List<Leitor> resultados = query.getResultList();
            if (!resultados.isEmpty()) {
                return resultados.get(0);
            }
            return null; // Retorna nulo se não encontrar um presidente com o ID da pessoa
        } finally {
            em.close();
        }
    }

}
