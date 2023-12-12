package br.com.alexlopes.designacoes.dao;

import br.com.alexlopes.designacoes.fabrica.FabricaJPA;
import br.com.alexlopes.designacoes.model.Oracao;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;
import java.time.LocalDate;
import java.util.List;
import java.util.Random;

public class OracaoDAO {

    // Método para criar a tabela oracao
    public static void criarTabela() {
        EntityManager em = FabricaJPA.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            String createTableSQL = "CREATE TABLE Oracao (id INT NOT NULL GENERATED ALWAYS AS IDENTITY PRIMARY KEY, pessoa INT NOT NULL, data DATE, FOREIGN KEY (pessoa) REFERENCES pessoa(id) ON DELETE CASCADE)";
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

    //Cadastrar os designados para oração da reunião de meio de semana
    public void cadastrar(Oracao a) {
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

    // Excluir registro de Oracao com base no ID da pessoa
    public void excluirOracaoPorPessoaId(int pessoaId) {
        EntityManager em = FabricaJPA.getEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();

            // Primeiro, verifique se a oração existe
            Oracao oracao = em.createQuery("SELECT o FROM Oracao o WHERE o.pessoa.id = :pessoaId", Oracao.class)
                    .setParameter("pessoaId", pessoaId)
                    .getSingleResult();

            if (oracao != null) {
                em.remove(oracao); // Exclua a oração encontrada
                tx.commit();
            } else {
                tx.rollback();
            }
        } catch (NoResultException e) {
            // Trate o caso em que nenhuma oração com o ID de pessoa especificado foi encontrada
            tx.rollback();
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
            }
        } finally {
            if (em.isOpen()) {
                em.close();
            }
        }
    }

    // Verificar se existe uma oração cadastrada com base no ID da pessoa
    public boolean verificarExistenciaOracaoPorPessoaId(int pessoaId) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            String jpql = "SELECT COUNT(o) FROM Oracao o WHERE o.pessoa.id = :pessoaId";
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

    // Método para buscar uma Oracao com data nula ou a mais antiga (se não houver data nula), ignorando uma lista de pessoas
    public Oracao buscarOracaoSemDataMaisAntigaParaPessoas(List<Integer> idsPessoasIgnorar) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            String queryString = "SELECT o FROM Oracao o WHERE o.pessoa.id NOT IN (:idsPessoasIgnorar) ORDER BY o.data ASC NULLS FIRST";
            TypedQuery<Oracao> query = em.createQuery(queryString, Oracao.class)
                    .setParameter("idsPessoasIgnorar", idsPessoasIgnorar)
                    .setMaxResults(1);
            List<Oracao> oracoes = query.getResultList();
            if (!oracoes.isEmpty()) {
                return oracoes.get(0);
            }
            return null;
        } finally {
            em.close();
        }
    }

    public Oracao buscarOracaoSemDataMaisAntigaParaPessoas2() {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            String queryString = "SELECT o FROM Oracao o ORDER BY o.data ASC NULLS FIRST";
            TypedQuery<Oracao> query = em.createQuery(queryString, Oracao.class);

            List<Oracao> oracoes = query.getResultList();
            if (!oracoes.isEmpty()) {
                // Gerar um índice aleatório dentro do intervalo da lista
                Random random = new Random();
                int indiceAleatorio = random.nextInt(oracoes.size());
                return oracoes.get(indiceAleatorio);
            }
        } catch (Exception e) {
            // Se ocorrer uma exceção, você pode implementar um tratamento específico aqui
            // Certifique-se de implementar a lógica correta de tratamento de exceção.
        } finally {
            em.close();
        }
        return null;
    }

    // Método para alterar a data de uma oração
    public void alterarDataOracao(int oracaoId, LocalDate novaData) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            em.getTransaction().begin();
            Oracao oracao = em.find(Oracao.class, oracaoId);
            if (oracao != null) {
                oracao.setData(novaData);
                em.merge(oracao);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
        } finally {
            em.close();
        }
    }

    //BUSCAR TODAS ORAÇÃO ORDENADO POR DATA E IGNORAR A LISTA DE PESSOAS
    public List<Object[]> buscarNomesOracaoOrdenadosPorDataMaisAntiga(List<Integer> idsIgnorar) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            String jpql = "SELECT p.pessoa.id, CONCAT(p.pessoa.nome, ' ', p.pessoa.sobrenome), p.data FROM Oracao p WHERE p.pessoa.id NOT IN (:idsIgnorar) ORDER BY p.data";
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
    public Oracao buscarPorIdPessoa(int idPessoa) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            String jpql = "SELECT p FROM Oracao p WHERE p.pessoa.id = :idPessoa";
            TypedQuery<Oracao> query = em.createQuery(jpql, Oracao.class);
            query.setParameter("idPessoa", idPessoa);
            List<Oracao> resultados = query.getResultList();
            if (!resultados.isEmpty()) {
                return resultados.get(0);
            }
            return null; // Retorna nulo se não encontrar um presidente com o ID da pessoa
        } finally {
            em.close();
        }
    }

}
