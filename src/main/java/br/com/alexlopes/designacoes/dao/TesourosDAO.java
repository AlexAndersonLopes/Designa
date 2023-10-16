package br.com.alexlopes.designacoes.dao;

import br.com.alexlopes.designacoes.fabrica.FabricaJPA;
import br.com.alexlopes.designacoes.model.Tesouros;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;
import java.time.LocalDate;
import java.util.List;
import java.util.Random;

public class TesourosDAO {

    // Método para criar a tabela tesouros
    public static void criarTabela() {
        EntityManager em = FabricaJPA.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            String createTableSQL = "CREATE TABLE Tesouros (id INT NOT NULL GENERATED ALWAYS AS IDENTITY PRIMARY KEY, pessoa INT NOT NULL, data DATE, FOREIGN KEY (pessoa) REFERENCES pessoa(id) ON DELETE CASCADE)";
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

    //Cadastrar os designados para os Tesouros da reunião de meio de semana
    public void cadastrar(Tesouros a) {
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

    // Verificar se existe um registro de tesouros com base no ID da pessoa
    public boolean verificarExistenciaTesouroPorPessoaId(int pessoaId) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            String jpql = "SELECT COUNT(t) FROM Tesouros t WHERE t.pessoa.id = :pessoaId";
            TypedQuery<Long> query = em.createQuery(jpql, Long.class);
            query.setParameter("pessoaId", pessoaId);
            Long resultado = query.getSingleResult();

            return resultado > 0;
        } catch (Exception e) {
        } finally {
            FabricaJPA.closeEtityManager();
        }
        return false;
    }

    // Excluir registro de Tesouros com base no ID da pessoa
    public void excluirTesouroPorPessoaId(int pessoaId) {
        EntityManager em = FabricaJPA.getEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();

            // Primeiro, verifique se o tesouro existe
            Tesouros tesouro = em.createQuery("SELECT t FROM Tesouros t WHERE t.pessoa.id = :pessoaId", Tesouros.class)
                    .setParameter("pessoaId", pessoaId)
                    .getSingleResult();

            if (tesouro != null) {
                em.remove(tesouro); // Exclua o tesouro encontrado
                tx.commit();
            } else {
                tx.rollback();
            }
        } catch (NoResultException e) {
            // Trate o caso em que nenhum tesouro com o ID de pessoa especificado foi encontrado
            tx.rollback();
            System.out.println("Tesouro não encontrado com o ID de pessoa: " + pessoaId);
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

    // Método para buscar um Tesouro com data nula ou a mais antiga (se não houver data nula), ignorando uma lista de pessoas
    public Tesouros buscarTesouroSemDataMaisAntigaParaPessoas(List<Integer> idsPessoasIgnorar) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            String queryString = "SELECT t FROM Tesouros t WHERE t.pessoa.id NOT IN (:idsPessoasIgnorar) ORDER BY t.data ASC NULLS FIRST";
            TypedQuery<Tesouros> query = em.createQuery(queryString, Tesouros.class)
                    .setParameter("idsPessoasIgnorar", idsPessoasIgnorar)
                    .setMaxResults(1);
            List<Tesouros> tesouros = query.getResultList();
            if (!tesouros.isEmpty()) {
                return tesouros.get(0);
            }
        } catch (Exception e) {
            return buscarTesouroSemDataMaisAntigaParaPessoas2();
        } finally {
            FabricaJPA.closeEtityManager();
        }
        return null;
    }

    public Tesouros buscarTesouroSemDataMaisAntigaParaPessoas2() {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            String queryString = "SELECT t FROM Tesouros t ORDER BY t.data ASC NULLS FIRST";
            TypedQuery<Tesouros> query = em.createQuery(queryString, Tesouros.class);

            List<Tesouros> tesouros = query.getResultList();
            if (!tesouros.isEmpty()) {
                // Gerar um índice aleatório dentro do intervalo da lista
                Random random = new Random();
                int indiceAleatorio = random.nextInt(tesouros.size());
                return tesouros.get(indiceAleatorio);
            }
        } catch (Exception e) {
            // Se ocorrer uma exceção, você pode implementar um tratamento específico aqui
            // No exemplo anterior, você chamou buscarTesouroSemDataMaisAntigaParaPessoas2() em caso de exceção.
            // Certifique-se de implementar a lógica correta de tratamento de exceção.
        } finally {
            FabricaJPA.closeEtityManager();
        }
        return null;
    }

    // Método para alterar a data de um tesouro
    public void alterarDataTesouro(int tesouroId, LocalDate novaData) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            em.getTransaction().begin();
            Tesouros tesouro = em.find(Tesouros.class, tesouroId);
            if (tesouro != null) {
                tesouro.setData(novaData);
                em.merge(tesouro);
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

    //BUSCAR TODOS OS TESOUROS ORDENADO POR DATA
    public List<Object[]> buscarNomesTesourosOrdenadosPorDataMaisAntiga() {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            String jpql = "SELECT CONCAT(p.pessoa.nome, ' ', p.pessoa.sobrenome), p.data FROM Tesouros p ORDER BY p.data";
            TypedQuery<Object[]> query = em.createQuery(jpql, Object[].class);
            return query.getResultList();
        } catch (Exception e) {
        } finally {
            FabricaJPA.closeEtityManager();
        }
        return null;
    }

    //Buscar pessoa por id
    public Tesouros buscarPorIdPessoa(int idPessoa) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            String jpql = "SELECT p FROM Tesouros p WHERE p.pessoa.id = :idPessoa";
            TypedQuery<Tesouros> query = em.createQuery(jpql, Tesouros.class);
            query.setParameter("idPessoa", idPessoa);
            List<Tesouros> resultados = query.getResultList();
            if (!resultados.isEmpty()) {
                return resultados.get(0);
            }
            return null; // Retorna nulo se não encontrar um presidente com o ID da pessoa
        } finally {
            FabricaJPA.closeEtityManager();
        }
    }

}
