package br.com.alexlopes.designacoes.dao;

import br.com.alexlopes.designacoes.fabrica.FabricaJPA;
import br.com.alexlopes.designacoes.model.EstudoBiblicoCongregacao;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;
import java.time.LocalDate;
import java.util.List;
import java.util.Random;

public class EstudoBiblicoCongregacaoDAO {
    
    // Método para criar a tabela estudoBiblicoCongregacao
    public static void criarTabela() {
        EntityManager em = FabricaJPA.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            String createTableSQL = "CREATE TABLE EstudoBiblicoCongregacao (id INT NOT NULL GENERATED ALWAYS AS IDENTITY PRIMARY KEY, pessoa INT NOT NULL, data DATE, FOREIGN KEY (pessoa) REFERENCES pessoa(id) ON DELETE CASCADE)";
            em.createNativeQuery(createTableSQL).executeUpdate();
            tx.commit();
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

    //Cadastrar os designados para o Estudo Biblico de Congregação da reunião de meio de semana
    public void cadastrar(EstudoBiblicoCongregacao a) {
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

    // Verificar se existe um registro de estudoBiblicoCongregacao com base no ID da pessoa
    public boolean verificarExistenciaEstudoBiblicoPorPessoaId(int pessoaId) {
        EntityManager em = FabricaJPA.getEntityManager();
        String jpql = "SELECT COUNT(e) FROM EstudoBiblicoCongregacao e WHERE e.pessoa.id = :pessoaId";
        TypedQuery<Long> query = em.createQuery(jpql, Long.class);
        query.setParameter("pessoaId", pessoaId);
        Long resultado = query.getSingleResult();

        return resultado > 0;
    }

    // Excluir registro de EstudoBiblicoCongregacao com base no ID da pessoa
    public void excluirEstudoBiblicoPorPessoaId(int pessoaId) {
        EntityManager em = FabricaJPA.getEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();

            // Primeiro, verifique se o estudoBiblico existe
            EstudoBiblicoCongregacao estudoBiblico = em.createQuery("SELECT e FROM EstudoBiblicoCongregacao e WHERE e.pessoa.id = :pessoaId", EstudoBiblicoCongregacao.class)
                    .setParameter("pessoaId", pessoaId)
                    .getSingleResult();

            if (estudoBiblico != null) {
                em.remove(estudoBiblico); // Exclua o estudoBiblico encontrado
                tx.commit();
            } else {
                tx.rollback();
            }
        } catch (NoResultException e) {
            // Trate o caso em que nenhum estudoBiblico com o ID de pessoa especificado foi encontrado
            tx.rollback();
            System.out.println("EstudoBiblicoCongregacao não encontrado com o ID de pessoa: " + pessoaId);
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

    // Método para buscar um EstudoBiblicoCongregacao com data nula ou a mais antiga (se não houver data nula), ignorando uma lista de pessoas
    public EstudoBiblicoCongregacao buscarEstudoBiblicoCongregacaoSemDataMaisAntigaParaPessoas(List<Integer> idsPessoasIgnorar) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            String queryString = "SELECT e FROM EstudoBiblicoCongregacao e WHERE e.pessoa.id NOT IN (:idsPessoasIgnorar) ORDER BY e.data ASC NULLS FIRST";
            TypedQuery<EstudoBiblicoCongregacao> query = em.createQuery(queryString, EstudoBiblicoCongregacao.class)
                    .setParameter("idsPessoasIgnorar", idsPessoasIgnorar)
                    .setMaxResults(1);
            List<EstudoBiblicoCongregacao> estudos = query.getResultList();
            if (!estudos.isEmpty()) {
                return estudos.get(0);
            }
            return null;
        } finally {
            FabricaJPA.closeEtityManager();
        }
    }

    public EstudoBiblicoCongregacao buscarEstudoBiblicoCongregacaoSemDataMaisAntigaParaPessoas2() {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            String queryString = "SELECT e FROM EstudoBiblicoCongregacao e WHERE e.data IS NULL OR e.data = (SELECT MIN(eb.data) FROM EstudoBiblicoCongregacao eb WHERE eb.data IS NOT NULL)";
            TypedQuery<EstudoBiblicoCongregacao> query = em.createQuery(queryString, EstudoBiblicoCongregacao.class);

            List<EstudoBiblicoCongregacao> estudos = query.getResultList();
            if (!estudos.isEmpty()) {
                // Gerar um índice aleatório dentro do intervalo da lista
                Random random = new Random();
                int indiceAleatorio = random.nextInt(estudos.size());
                return estudos.get(indiceAleatorio);
            }
            return null;
        } finally {
            FabricaJPA.closeEtityManager();
        }
    }

    // Método para alterar a data de um registro em EstudoBiblicoCongregacao
    public void alterarDataEstudoBiblicoCongregacao(int estudoId, LocalDate novaData) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            em.getTransaction().begin();
            EstudoBiblicoCongregacao estudo = em.find(EstudoBiblicoCongregacao.class, estudoId);
            if (estudo != null) {
                estudo.setData(novaData);
                em.merge(estudo);
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

    //Buscar pessoa por id
    public EstudoBiblicoCongregacao buscarPorIdPessoa(int idPessoa) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            String jpql = "SELECT p FROM EstudoBiblicoCongregacao p WHERE p.pessoa.id = :idPessoa";
            TypedQuery<EstudoBiblicoCongregacao> query = em.createQuery(jpql, EstudoBiblicoCongregacao.class);
            query.setParameter("idPessoa", idPessoa);
            List<EstudoBiblicoCongregacao> resultados = query.getResultList();
            if (!resultados.isEmpty()) {
                return resultados.get(0);
            }
            return null; // Retorna nulo se não encontrar um presidente com o ID da pessoa
        } finally {
            em.close();
        }
    }

}
