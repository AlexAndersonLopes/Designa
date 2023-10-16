package br.com.alexlopes.designacoes.dao;

import br.com.alexlopes.designacoes.fabrica.FabricaJPA;
import br.com.alexlopes.designacoes.model.NossaVida;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;
import java.time.LocalDate;
import java.util.List;
import java.util.Random;

public class NossaVidaDAO {

    // Método para criar a tabela nossaVida
    public static void criarTabela() {
        EntityManager em = FabricaJPA.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            String createTableSQL = "CREATE TABLE NossaVida (id INT NOT NULL GENERATED ALWAYS AS IDENTITY PRIMARY KEY, pessoa INT NOT NULL, data DATE, FOREIGN KEY (pessoa) REFERENCES pessoa(id) ON DELETE CASCADE)";
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

    //Cadastrar os designados para a Nossa Vida Cristã da reunião de meio de semana
    public void cadastrar(NossaVida a) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(a);
            em.getTransaction().commit();
        } catch (Exception e) {
        } finally {
            FabricaJPA.closeEtityManager();
        }
    }

    // Verificar se existe um registro em nossaVida com base no ID da pessoa
    public boolean verificarExistenciaNossaVidaPorPessoaId(int pessoaId) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            String jpql = "SELECT COUNT(nv) FROM NossaVida nv WHERE nv.pessoa.id = :pessoaId";
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

    // Excluir registro em nossaVida com base no ID da pessoa
    public void excluirNossaVidaPorPessoaId(int pessoaId) {
        EntityManager em = FabricaJPA.getEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();

            // Primeiro, verifique se a nossaVida existe
            NossaVida nossaVida = em.createQuery("SELECT nv FROM NossaVida nv WHERE nv.pessoa.id = :pessoaId", NossaVida.class)
                    .setParameter("pessoaId", pessoaId)
                    .getSingleResult();

            if (nossaVida != null) {
                em.remove(nossaVida); // Exclua nossaVida encontrada
                tx.commit();
            } else {
                tx.rollback();
            }
        } catch (NoResultException e) {
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
            }
        } finally {
            if (em.isOpen()) {
                FabricaJPA.closeEtityManager();
            }
        }
    }

    // Método para buscar uma NossaVida com data nula ou a mais antiga (se não houver data nula), ignorando uma lista de pessoas
    public NossaVida buscarNossaVidaSemDataMaisAntigaParaPessoas(List<Integer> idsPessoasIgnorar) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            String queryString = "SELECT n FROM NossaVida n WHERE n.pessoa.id NOT IN (:idsPessoasIgnorar) ORDER BY n.data ASC NULLS FIRST";
            TypedQuery<NossaVida> query = em.createQuery(queryString, NossaVida.class)
                    .setParameter("idsPessoasIgnorar", idsPessoasIgnorar)
                    .setMaxResults(1);
            List<NossaVida> nossasVidas = query.getResultList();
            if (!nossasVidas.isEmpty()) {
                return nossasVidas.get(0);
            }
            return null;
        } finally {
            FabricaJPA.closeEtityManager();
        }
    }

    public NossaVida buscarNossaVidaSemDataMaisAntigaParaPessoas2() {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            String queryString = "SELECT n FROM NossaVida n WHERE n.data IS NULL OR n.data = (SELECT MIN(nv.data) FROM NossaVida nv WHERE nv.data IS NOT NULL)";
            TypedQuery<NossaVida> query = em.createQuery(queryString, NossaVida.class);

            List<NossaVida> nossasVidas = query.getResultList();
            if (!nossasVidas.isEmpty()) {
                // Gerar um índice aleatório dentro do intervalo da lista
                Random random = new Random();
                int indiceAleatorio = random.nextInt(nossasVidas.size());
                return nossasVidas.get(indiceAleatorio);
            }
            return null;
        } finally {
            FabricaJPA.closeEtityManager();
        }
    }

    // Método para alterar a data de um registro em NossaVida
    public void alterarDataNossaVida(int nossaVidaId, LocalDate novaData) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            em.getTransaction().begin();
            NossaVida nossaVida = em.find(NossaVida.class, nossaVidaId);
            if (nossaVida != null) {
                nossaVida.setData(novaData);
                em.merge(nossaVida);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
        } finally {
            FabricaJPA.closeEtityManager();
        }
    }

    //BUSCAR TODAS Nossa Vida Cristã ORDENADO POR DATA
    public List<Object[]> buscarNomesNossaVidaOrdenadosPorDataMaisAntiga() {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            String jpql = "SELECT CONCAT(p.pessoa.nome, ' ', p.pessoa.sobrenome), p.data FROM NossaVida p ORDER BY p.data";
            TypedQuery<Object[]> query = em.createQuery(jpql, Object[].class);
            return query.getResultList();
        } catch (Exception e) {
        } finally {
            FabricaJPA.closeEtityManager();
        }
        return null;
    }

    //Buscar pessoa por id
    public NossaVida buscarPorIdPessoa(int idPessoa) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            String jpql = "SELECT p FROM NossaVida p WHERE p.pessoa.id = :idPessoa";
            TypedQuery<NossaVida> query = em.createQuery(jpql, NossaVida.class);
            query.setParameter("idPessoa", idPessoa);
            List<NossaVida> resultados = query.getResultList();
            if (!resultados.isEmpty()) {
                return resultados.get(0);
            }
            return null; // Retorna nulo se não encontrar um presidente com o ID da pessoa
        } finally {
            FabricaJPA.closeEtityManager();
        }
    }
}
