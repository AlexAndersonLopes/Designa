package br.com.alexlopes.designacoes.dao;

import br.com.alexlopes.designacoes.fabrica.FabricaJPA;
import br.com.alexlopes.designacoes.model.Pessoa;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;
import java.time.LocalDate;
import java.util.List;
import java.util.Random;

public class PessoaDAO {
    
     // Método para criar a tabela pessoa
    public static void criarTabela() {
        EntityManager em = FabricaJPA.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            String createTableSQL = "CREATE TABLE Pessoa (id INT NOT NULL GENERATED ALWAYS AS IDENTITY PRIMARY KEY, nome VARCHAR(100) NOT NULL, sobrenome VARCHAR(100) NOT NULL, sexo VARCHAR(20) NOT NULL, celular VARCHAR(20) NOT NULL, dataUltima DATE, sala VARCHAR(10), ajudante DATE)";
            em.createNativeQuery(createTableSQL).executeUpdate();
            tx.commit();
            System.out.println("Tabela pessoa criada com sucesso.");
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

    public void cadastrar(Pessoa a) {
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

    public List<Pessoa> buscarTodasPorOrdemAlfabetica() {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            TypedQuery<Pessoa> query = em.createQuery("SELECT p FROM Pessoa p ORDER BY p.nome", Pessoa.class);
            return query.getResultList();
        } finally {
            FabricaJPA.closeEtityManager();
        }
    }

    public List<Pessoa> buscarPorNome(String nome) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            TypedQuery<Pessoa> query = em.createQuery("SELECT p FROM Pessoa p WHERE LOWER(p.nome) LIKE :nome ORDER BY p.nome", Pessoa.class);
            query.setParameter("nome", "%" + nome.toLowerCase() + "%");
            return query.getResultList();
        } finally {
            FabricaJPA.closeEtityManager();
        }
    }

    public Pessoa buscarPessoaPorId(int id) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            return em.find(Pessoa.class, id);
        } finally {
            FabricaJPA.closeEtityManager();
        }
    }

    public void excluirPorId(int id) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            em.getTransaction().begin();
            Pessoa pessoa = em.find(Pessoa.class, id); // Encontra a pessoa pelo ID
            if (pessoa != null) {
                em.remove(pessoa);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            FabricaJPA.closeEtityManager();
        }
    }

    public Pessoa buscarPessoaPorNomeESobrenome(String nome, String sobrenome) {
        EntityManager em = FabricaJPA.getEntityManager();
        String jpql = "SELECT p FROM Pessoa p WHERE p.nome = :nome AND p.sobrenome = :sobrenome";
        TypedQuery<Pessoa> query = em.createQuery(jpql, Pessoa.class);
        query.setParameter("nome", nome);
        query.setParameter("sobrenome", sobrenome);
        return query.getSingleResult();
    }

    public Pessoa buscarPessoaPorNomeESobrenomes(String nomeCompleto) {
        EntityManager em = FabricaJPA.getEntityManager();
        String jpql = "SELECT p FROM Pessoa p WHERE CONCAT(p.nome, ' ', p.sobrenome) = :nomeCompleto";
        TypedQuery<Pessoa> query = em.createQuery(jpql, Pessoa.class);
        query.setParameter("nomeCompleto", nomeCompleto);

        try {
            return query.getSingleResult();
        } catch (NoResultException ex) {
            return null; // Retorna null se nenhuma correspondência for encontrada
        }
    }

    public Pessoa buscarPessoaComCondicoes(String descricaoParte, String sexo, List<Integer> idsPessoasIgnorar) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            String jpql = "SELECT DISTINCT p FROM Pessoa p "
                    + "WHERE p.id NOT IN (:idsPessoasIgnorar) "
                    + "AND (p.sexo IS NULL OR :sexo IS NULL OR p.sexo = :sexo) "
                    + "AND EXISTS (SELECT 1 FROM Parte parte WHERE parte.pessoa = p AND parte.descricao = :descricaoParte) "
                    + "AND p.dataUltima IS NULL AND p.ajudante IS NULL ";  // Adicionando a condição de dataUltima e ajudante nulos

            TypedQuery<Pessoa> query = em.createQuery(jpql, Pessoa.class)
                    .setParameter("idsPessoasIgnorar", idsPessoasIgnorar)
                    .setParameter("descricaoParte", descricaoParte)
                    .setParameter("sexo", sexo);

            List<Pessoa> pessoas = query.getResultList();

            if (!pessoas.isEmpty()) {
                // Sorteie uma pessoa aleatória da lista
                Random random = new Random();
                int indiceSorteado = random.nextInt(pessoas.size());
                return pessoas.get(indiceSorteado);
            }

            return buscarPessoa2(descricaoParte, sexo, idsPessoasIgnorar);
        } finally {
            FabricaJPA.closeEtityManager();
        }
    }

    public Pessoa buscarPessoa2(String descricaoParte, String sexo, List<Integer> idsPessoasIgnorar) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            String jpql = "SELECT DISTINCT p FROM Pessoa p "
                    + "WHERE p.id NOT IN (:idsPessoasIgnorar) "
                    + "AND (p.sexo IS NULL OR :sexo IS NULL OR p.sexo = :sexo) "
                    + "AND EXISTS (SELECT 1 FROM Parte parte WHERE parte.pessoa = p AND parte.descricao = :descricaoParte) "
                    + "AND p.dataUltima IS NULL AND p.ajudante IS NOT NULL " // Condição alterada para dataUltima nula e ajudante não nulo
                    + "ORDER BY p.ajudante ASC";

            TypedQuery<Pessoa> query = em.createQuery(jpql, Pessoa.class)
                    .setParameter("idsPessoasIgnorar", idsPessoasIgnorar)
                    .setParameter("descricaoParte", descricaoParte)
                    .setParameter("sexo", sexo);

            query.setMaxResults(1);

            List<Pessoa> pessoas = query.getResultList();
            if (!pessoas.isEmpty()) {
                return pessoas.get(0);
            }
            return buscarPessoa3(descricaoParte, sexo, idsPessoasIgnorar);
        } finally {
            FabricaJPA.closeEtityManager();
        }
    }

    public Pessoa buscarPessoa3(String descricaoParte, String sexo, List<Integer> idsPessoasIgnorar) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            String jpql = "SELECT DISTINCT p FROM Pessoa p "
                    + "WHERE p.id NOT IN (:idsPessoasIgnorar) "
                    + "AND (p.sexo IS NULL OR :sexo IS NULL OR p.sexo = :sexo) "
                    + "AND EXISTS (SELECT 1 FROM Parte parte WHERE parte.pessoa = p AND parte.descricao = :descricaoParte) "
                    + "ORDER BY p.dataUltima ASC";  // Ordenar por dataUltima em ordem ascendente

            TypedQuery<Pessoa> query = em.createQuery(jpql, Pessoa.class)
                    .setParameter("idsPessoasIgnorar", idsPessoasIgnorar)
                    .setParameter("descricaoParte", descricaoParte)
                    .setParameter("sexo", sexo);

            query.setMaxResults(1);  // Obter apenas a primeira pessoa da lista ordenada

            List<Pessoa> pessoas = query.getResultList();
            if (!pessoas.isEmpty()) {
                return pessoas.get(0);
            }
            return buscarPessoaComCondicoesSemData(descricaoParte, sexo, idsPessoasIgnorar);
        } finally {
            FabricaJPA.closeEtityManager();
        }
    }

    public Pessoa buscarPessoaComCondicoesAjudante(String descricaoParte, String sexo, List<Integer> idsPessoasIgnorar, LocalDate dataIgnorar) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            String jpql = "SELECT DISTINCT p FROM Pessoa p "
                    + "WHERE p.id NOT IN (:idsPessoasIgnorar) "
                    + "AND (p.sexo IS NULL OR :sexo IS NULL OR p.sexo = :sexo) "
                    + "AND EXISTS (SELECT 1 FROM Parte parte WHERE parte.pessoa = p AND parte.descricao = :descricaoParte) "
                    + "AND p.dataUltima IS NULL AND p.ajudante IS NULL ";

            TypedQuery<Pessoa> query = em.createQuery(jpql, Pessoa.class)
                    .setParameter("idsPessoasIgnorar", idsPessoasIgnorar)
                    .setParameter("descricaoParte", descricaoParte)
                    .setParameter("sexo", sexo);

            List<Pessoa> pessoas = query.getResultList();

            if (!pessoas.isEmpty()) {
                // Sorteie uma pessoa aleatória da lista
                Random random = new Random();
                int indiceSorteado = random.nextInt(pessoas.size());
                return pessoas.get(indiceSorteado);
            }

            return buscarPessoaComCondicoesAjudante2(descricaoParte, sexo, idsPessoasIgnorar, dataIgnorar);
        } finally {
            FabricaJPA.closeEtityManager();
        }
    }

    public Pessoa buscarPessoaComCondicoesAjudante2(String descricaoParte, String sexo, List<Integer> idsPessoasIgnorar, LocalDate dataIgnorar) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            String jpql = "SELECT DISTINCT p FROM Pessoa p "
                    + "WHERE p.id NOT IN (:idsPessoasIgnorar) "
                    + "AND (p.sexo IS NULL OR :sexo IS NULL OR p.sexo = :sexo) "
                    + "AND EXISTS (SELECT 1 FROM Parte parte WHERE parte.pessoa = p AND parte.descricao = :descricaoParte) "
                    // + "AND p.dataUltima IS NOT NULL AND p.ajudante IS NULL "
                    + "AND p.dataUltima <> :dataIgnorar AND p.ajudante IS NULL "
                    + "ORDER BY p.dataUltima ASC";

            TypedQuery<Pessoa> query = em.createQuery(jpql, Pessoa.class)
                    .setParameter("idsPessoasIgnorar", idsPessoasIgnorar)
                    .setParameter("descricaoParte", descricaoParte)
                    .setParameter("sexo", sexo)
                    .setParameter("dataIgnorar", dataIgnorar);

            query.setMaxResults(1);

            List<Pessoa> pessoas = query.getResultList();
            if (!pessoas.isEmpty()) {
                return pessoas.get(0);
            }
            return buscarPessoaComCondicoesAjudante3(descricaoParte, sexo, idsPessoasIgnorar, dataIgnorar);
        } finally {
            FabricaJPA.closeEtityManager();
        }
    }

    public Pessoa buscarPessoaComCondicoesAjudante3(String descricaoParte, String sexo, List<Integer> idsPessoasIgnorar, LocalDate dataIgnorar) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            String jpql = "SELECT DISTINCT p FROM Pessoa p "
                    + "WHERE (p.id NOT IN (:idsPessoasIgnorar) OR p.id IS NULL) "
                    + "AND (p.sexo IS NULL OR :sexo IS NULL OR p.sexo = :sexo) "
                    + "AND EXISTS (SELECT 1 FROM Parte parte WHERE parte.pessoa = p AND parte.descricao = :descricaoParte) "
                    + "AND p.ajudante != :dataIgnorar " // Sintaxe corrigida
                    + "ORDER BY p.ajudante ASC";

            TypedQuery<Pessoa> query = em.createQuery(jpql, Pessoa.class)
                    .setParameter("idsPessoasIgnorar", idsPessoasIgnorar)
                    .setParameter("descricaoParte", descricaoParte)
                    .setParameter("sexo", sexo)
                    .setParameter("dataIgnorar", dataIgnorar);

            List<Pessoa> pessoas = query.getResultList();
            if (!pessoas.isEmpty()) {
                return pessoas.get(0);
            }
            return buscarPessoaComCondicoesSemData(descricaoParte, sexo, idsPessoasIgnorar);
        } finally {
            FabricaJPA.closeEtityManager();
        }
    }

    public Pessoa buscarPessoaComCondicoes2(String descricaoParte, String sexo) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            String jpql = "SELECT DISTINCT p FROM Pessoa p "
                    + "WHERE (p.dataUltima IS NULL OR p.dataUltima = (SELECT MIN(p2.dataUltima) FROM Pessoa p2 WHERE p2.dataUltima IS NOT NULL)) "
                    + "AND (p.sexo IS NULL OR :sexo IS NULL OR p.sexo = :sexo) "
                    + "AND EXISTS (SELECT 1 FROM Parte parte WHERE parte.pessoa = p AND parte.descricao = :descricaoParte) "
                    + "ORDER BY p.dataUltima ASC";
            TypedQuery<Pessoa> query = em.createQuery(jpql, Pessoa.class)
                    .setParameter("descricaoParte", descricaoParte)
                    .setParameter("sexo", sexo); // Passando o parâmetro sexo diretamente, considerando que ele pode ser nulo.

            List<Pessoa> pessoas = query.getResultList();
            if (!pessoas.isEmpty()) {
                // Sorteie aleatoriamente uma pessoa
                Random random = new Random();
                int index = random.nextInt(pessoas.size());
                return pessoas.get(index);
            }
        } finally {
            FabricaJPA.closeEtityManager();
        }
        return null;
    }

    public Pessoa buscarPessoaComCondicoesSalaB(String descricaoParte, String sexo, List<Integer> idsPessoasIgnorar, String salaIgnorar) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            String jpql = "SELECT DISTINCT p FROM Pessoa p "
                    + "WHERE p.id NOT IN (:idsPessoasIgnorar) "
                    + "AND (p.sexo IS NULL OR :sexo IS NULL OR p.sexo = :sexo) "
                    + "AND EXISTS (SELECT 1 FROM Parte parte WHERE parte.pessoa = p AND parte.descricao = :descricaoParte) "
                    + "AND p.dataUltima IS NULL AND p.ajudante IS NULL "
                    + "AND (COALESCE(p.sala, '') = '' OR p.sala != :salaIgnorar) ";

            TypedQuery<Pessoa> query = em.createQuery(jpql, Pessoa.class)
                    .setParameter("idsPessoasIgnorar", idsPessoasIgnorar)
                    .setParameter("descricaoParte", descricaoParte)
                    .setParameter("sexo", sexo)
                    .setParameter("salaIgnorar", salaIgnorar);

            List<Pessoa> pessoas = query.getResultList();

            if (!pessoas.isEmpty()) {
                // Sorteie uma pessoa aleatória da lista
                Random random = new Random();
                int indiceSorteado = random.nextInt(pessoas.size());
                return pessoas.get(indiceSorteado);
            }

            return buscarPessoaComCondicoesSalaBB(descricaoParte, sexo, idsPessoasIgnorar, salaIgnorar);
        } finally {
            FabricaJPA.closeEtityManager();
        }
    }

    public Pessoa buscarPessoaComCondicoesSalaBB(String descricaoParte, String sexo, List<Integer> idsPessoasIgnorar, String salaIgnorar) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            String jpql = "SELECT DISTINCT p FROM Pessoa p "
                    + "WHERE p.id NOT IN (:idsPessoasIgnorar) "
                    + "AND (p.sexo IS NULL OR :sexo IS NULL OR p.sexo = :sexo) "
                    + "AND EXISTS (SELECT 1 FROM Parte parte WHERE parte.pessoa = p AND parte.descricao = :descricaoParte) "
                    + "AND p.dataUltima IS NULL AND p.ajudante IS NOT NULL " // Condição alterada para dataUltima nula e ajudante não nulo
                    + "AND (COALESCE(p.sala, '') = '' OR p.sala != :salaIgnorar) "
                    + "ORDER BY p.ajudante ASC";

            TypedQuery<Pessoa> query = em.createQuery(jpql, Pessoa.class)
                    .setParameter("idsPessoasIgnorar", idsPessoasIgnorar)
                    .setParameter("descricaoParte", descricaoParte)
                    .setParameter("sexo", sexo)
                    .setParameter("salaIgnorar", salaIgnorar);

            query.setMaxResults(1);

            List<Pessoa> pessoas = query.getResultList();
            if (!pessoas.isEmpty()) {
                return pessoas.get(0);
            }
            return buscarPessoaComCondicoesSalaBBB(descricaoParte, sexo, idsPessoasIgnorar, salaIgnorar);
        } finally {
            FabricaJPA.closeEtityManager();
        }
    }

    public Pessoa buscarPessoaComCondicoesSalaBBB(String descricaoParte, String sexo, List<Integer> idsPessoasIgnorar, String salaIgnorar) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            String jpql = "SELECT DISTINCT p FROM Pessoa p "
                    + "WHERE p.id NOT IN (:idsPessoasIgnorar) "
                    + "AND (p.sexo IS NULL OR :sexo IS NULL OR p.sexo = :sexo) "
                    + "AND EXISTS (SELECT 1 FROM Parte parte WHERE parte.pessoa = p AND parte.descricao = :descricaoParte) "
                    + "AND (COALESCE(p.sala, '') = '' OR p.sala != :salaIgnorar) " // Adicione a condição de sala
                    + "ORDER BY p.dataUltima ASC";  // Ordenar por dataUltima em ordem ascendente

            TypedQuery<Pessoa> query = em.createQuery(jpql, Pessoa.class)
                    .setParameter("idsPessoasIgnorar", idsPessoasIgnorar)
                    .setParameter("descricaoParte", descricaoParte)
                    .setParameter("sexo", sexo)
                    .setParameter("salaIgnorar", salaIgnorar);

            query.setMaxResults(1);  // Obter apenas a primeira pessoa da lista ordenada

            List<Pessoa> pessoas = query.getResultList();
            if (!pessoas.isEmpty()) {
                return pessoas.get(0);
            }
            return buscarPessoaComCondicoesSemData(descricaoParte, sexo, idsPessoasIgnorar);
        } finally {
            FabricaJPA.closeEtityManager();
        }
    }

    public Pessoa buscarPessoaComCondicoesSalaB2(String descricaoParte, String sexo) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            String jpql = "SELECT p FROM Pessoa p "
                    + "WHERE (p.dataUltima IS NULL OR p.dataUltima = (SELECT MIN(p2.dataUltima) FROM Pessoa p2 WHERE p2.dataUltima IS NOT NULL)) "
                    + "AND (p.sexo IS NULL OR :sexo IS NULL OR p.sexo = :sexo) "
                    + "AND EXISTS (SELECT parte FROM Parte parte WHERE parte.pessoa = p AND parte.descricao = :descricaoParte) "
                    + "ORDER BY p.dataUltima ASC";

            TypedQuery<Pessoa> query = em.createQuery(jpql, Pessoa.class)
                    .setParameter("descricaoParte", descricaoParte)
                    .setParameter("sexo", sexo);

            List<Pessoa> pessoas = query.getResultList();
            if (!pessoas.isEmpty()) {
                // Sorteie aleatoriamente uma pessoa
                Random random = new Random();
                int index = random.nextInt(pessoas.size());
                return pessoas.get(index);
            }
        } finally {
            FabricaJPA.closeEtityManager();
        }
        return null;
    }

    public Pessoa buscarPessoaComCondicoes2(String descricaoParte, String sexo, List<Integer> idsPessoasIgnorar, LocalDate dataIgnorar, String salaIgnorada) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            String jpql = "SELECT DISTINCT p FROM Pessoa p "
                    + "WHERE p.id NOT IN (:idsPessoasIgnorar) "
                    + "AND (p.sexo IS NULL OR :sexo IS NULL OR p.sexo = :sexo) "
                    + "AND EXISTS (SELECT 1 FROM Parte parte WHERE parte.pessoa = p AND parte.descricao = :descricaoParte) "
                    + "AND p.dataUltima IS NULL AND p.ajudante IS NULL "
                    + "AND (COALESCE(p.sala, '') = '' OR p.sala != :salaIgnorada)"; // Adicione a condição de sala;

            TypedQuery<Pessoa> query = em.createQuery(jpql, Pessoa.class)
                    .setParameter("idsPessoasIgnorar", idsPessoasIgnorar)
                    .setParameter("descricaoParte", descricaoParte)
                    .setParameter("sexo", sexo)
                    .setParameter("salaIgnorada", salaIgnorada);

            List<Pessoa> pessoas = query.getResultList();

            if (!pessoas.isEmpty()) {
                Random random = new Random();
                int indiceSorteado = random.nextInt(pessoas.size());
                return pessoas.get(indiceSorteado);
            }

            return buscarPessoaComCondicoes22(descricaoParte, sexo, idsPessoasIgnorar, dataIgnorar, salaIgnorada);
        } finally {
            FabricaJPA.closeEtityManager();
        }
    }

    public Pessoa buscarPessoaComCondicoes22(String descricaoParte, String sexo, List<Integer> idsPessoasIgnorar, LocalDate dataIgnorar, String salaIgnorada) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            String jpql = "SELECT DISTINCT p FROM Pessoa p "
                    + "WHERE p.id NOT IN (:idsPessoasIgnorar) "
                    + "AND (p.sexo IS NULL OR :sexo IS NULL OR p.sexo = :sexo) "
                    + "AND EXISTS (SELECT 1 FROM Parte parte WHERE parte.pessoa = p AND parte.descricao = :descricaoParte) "
                    + "AND p.ajudante IS NULL "
                    + "AND (COALESCE(p.sala, '') = '' OR p.sala != :salaIgnorada)";

            if (dataIgnorar != null) {
                jpql += " AND (COALESCE(p.dataUltima, :dataIgnorar) != :dataIgnorar)";
            }

            jpql += " ORDER BY p.dataUltima ASC";

            TypedQuery<Pessoa> query = em.createQuery(jpql, Pessoa.class)
                    .setParameter("idsPessoasIgnorar", idsPessoasIgnorar)
                    .setParameter("descricaoParte", descricaoParte)
                    .setParameter("sexo", sexo)
                    .setParameter("salaIgnorada", salaIgnorada);

            if (dataIgnorar != null) {
                query.setParameter("dataIgnorar", dataIgnorar);
            }
            query.setMaxResults(1);

            List<Pessoa> pessoas = query.getResultList();
            if (!pessoas.isEmpty()) {
                return pessoas.get(0);
            }
            return buscarPessoaComCondicoes222(descricaoParte, sexo, idsPessoasIgnorar, dataIgnorar, salaIgnorada);
        } finally {
            FabricaJPA.closeEtityManager();
        }
    }

    public Pessoa buscarPessoaComCondicoes222(String descricaoParte, String sexo, List<Integer> idsPessoasIgnorar, LocalDate dataIgnorar, String salaIgnorada) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            String jpql = "SELECT DISTINCT p FROM Pessoa p "
                    + "WHERE (p.id NOT IN (:idsPessoasIgnorar) OR p.id IS NULL) "
                    + "AND (p.sexo IS NULL OR :sexo IS NULL OR p.sexo = :sexo) "
                    + "AND EXISTS (SELECT 1 FROM Parte parte WHERE parte.pessoa = p AND parte.descricao = :descricaoParte) "
                    + "AND p.ajudante < p.dataUltima AND (COALESCE(p.ajudante, :dataIgnorar) != :dataIgnorar) " // Verifica se ajudante não é nulo antes de comparar
                    + "AND (COALESCE(p.sala, '') = '' OR p.sala != :salaIgnorada)"
                    + "ORDER BY p.ajudante ASC";

            TypedQuery<Pessoa> query = em.createQuery(jpql, Pessoa.class)
                    .setParameter("idsPessoasIgnorar", idsPessoasIgnorar)
                    .setParameter("descricaoParte", descricaoParte)
                    .setParameter("sexo", sexo)
                    .setParameter("salaIgnorada", salaIgnorada);
            query.setParameter("dataIgnorar", dataIgnorar);

            List<Pessoa> pessoas = query.getResultList();
            if (!pessoas.isEmpty()) {
                return pessoas.get(0);
            }
            return buscarPessoaComCondicoes2222(descricaoParte, sexo, idsPessoasIgnorar, dataIgnorar, salaIgnorada);
        } finally {
            FabricaJPA.closeEtityManager();
        }
    }

    public Pessoa buscarPessoaComCondicoes2222(String descricaoParte, String sexo, List<Integer> idsPessoasIgnorar, LocalDate dataIgnorar, String salaIgnorada) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            String jpql = "SELECT DISTINCT p FROM Pessoa p "
                    + "WHERE (p.id NOT IN (:idsPessoasIgnorar) OR p.id IS NULL) "
                    + "AND (p.sexo IS NULL OR :sexo IS NULL OR p.sexo = :sexo) "
                    + "AND (p.ajudante IS NULL OR p.ajudante = (SELECT MIN(p2.ajudante) FROM Pessoa p2 WHERE p2.id NOT IN (:idsPessoasIgnorar))) "
                    + "AND EXISTS (SELECT 1 FROM Parte parte WHERE parte.pessoa = p AND parte.descricao = :descricaoParte) "
                    + "ORDER BY p.ajudante ASC";

            TypedQuery<Pessoa> query = em.createQuery(jpql, Pessoa.class)
                    .setParameter("idsPessoasIgnorar", idsPessoasIgnorar)
                    .setParameter("descricaoParte", descricaoParte)
                    .setParameter("sexo", sexo);

            List<Pessoa> pessoas = query.getResultList();
            if (!pessoas.isEmpty()) {
                return pessoas.get(0);
            }
            return null;
        } finally {
            FabricaJPA.closeEtityManager();
        }
    }

    public Pessoa buscarPessoaComCondicoes3(String descricaoParte, String sexo) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            String jpql = "SELECT DISTINCT p FROM Pessoa p "
                    + "WHERE (p.sexo IS NULL OR :sexo IS NULL OR p.sexo = :sexo) "
                    + "AND EXISTS (SELECT 1 FROM Parte parte WHERE parte.pessoa = p AND parte.descricao = :descricaoParte) "
                    + "ORDER BY p.dataUltima ASC";
            TypedQuery<Pessoa> query = em.createQuery(jpql, Pessoa.class)
                    .setParameter("descricaoParte", descricaoParte)
                    .setParameter("sexo", sexo);

            List<Pessoa> pessoas = query.getResultList();
            if (!pessoas.isEmpty()) {
                // Sorteie aleatoriamente uma pessoa
                Random random = new Random();
                int index = random.nextInt(pessoas.size());
                return pessoas.get(index);
            }
        } finally {
            FabricaJPA.closeEtityManager();
        }
        return null;
    }

    public Pessoa buscarPessoaComCondicoesSemData(String descricaoParte, String sexo, List<Integer> idsPessoasIgnorar) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            String jpql = "SELECT DISTINCT p FROM Pessoa p "
                    + "WHERE p.id NOT IN (:idsPessoasIgnorar) "
                    + "AND (p.sexo IS NULL OR :sexo IS NULL OR p.sexo = :sexo) "
                    + "AND EXISTS (SELECT 1 FROM Parte parte WHERE parte.pessoa = p AND parte.descricao = :descricaoParte) "
                    + "ORDER BY p.dataUltima ASC";

            TypedQuery<Pessoa> query = em.createQuery(jpql, Pessoa.class)
                    .setParameter("idsPessoasIgnorar", idsPessoasIgnorar)
                    .setParameter("descricaoParte", descricaoParte)
                    .setParameter("sexo", sexo); // Passando o parâmetro sexo diretamente, considerando que ele pode ser nulo.

            query.setMaxResults(1);

            List<Pessoa> pessoas = query.getResultList();
            if (!pessoas.isEmpty()) {
                return pessoas.get(0);
            }
            return null;
        } finally {
            FabricaJPA.closeEtityManager();
        }
    }

    public void alterarDataUltimaPessoa(int pessoaId, LocalDate novaData, String novaSala) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            em.getTransaction().begin();
            Pessoa pessoa = em.find(Pessoa.class, pessoaId);
            if (pessoa != null) {
                pessoa.setDataUltima(novaData);
                if (novaSala != null) {
                    pessoa.setSala(novaSala); // Adicionando a nova sala
                } else {
                    pessoa.setSala(pessoa.getSala());
                }
                em.merge(pessoa);
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

    public List<Object[]> buscarNomesJoiasOrdenadosPorDataMaisAntiga(String sexo, String descricao, List<Integer> idsIgnorar) {
        EntityManager em = FabricaJPA.getEntityManager();
        String jpql = "SELECT p.pessoa.id, CONCAT(p.pessoa.nome, ' ', p.pessoa.sobrenome), p.pessoa.dataUltima, p.pessoa.ajudante FROM Parte p WHERE p.descricao = :descricao AND p.pessoa.id NOT IN (:idsIgnorar)";
        if (sexo != null) {
            jpql += " AND p.pessoa.sexo = :sexo";
        }
        jpql += " ORDER BY p.pessoa.dataUltima";
        TypedQuery<Object[]> query = em.createQuery(jpql, Object[].class);
        query.setParameter("descricao", descricao);
        query.setParameter("idsIgnorar", idsIgnorar);
        if (sexo != null) {
            query.setParameter("sexo", sexo);
        }
        return query.getResultList();
    }
    
    public List<Object[]> buscarNomesAjudantePorDataMaisAntiga(String sexo, String descricao, List<Integer> idsIgnorar) {
        EntityManager em = FabricaJPA.getEntityManager();
        String jpql = "SELECT p.pessoa.id, CONCAT(p.pessoa.nome, ' ', p.pessoa.sobrenome), p.pessoa.dataUltima, p.pessoa.ajudante FROM Parte p WHERE p.descricao = :descricao AND p.pessoa.id NOT IN (:idsIgnorar)";
        if (sexo != null) {
            jpql += " AND p.pessoa.sexo = :sexo";
        }
        jpql += " ORDER BY p.pessoa.ajudante";
        TypedQuery<Object[]> query = em.createQuery(jpql, Object[].class);
        query.setParameter("descricao", descricao);
        query.setParameter("idsIgnorar", idsIgnorar);
        if (sexo != null) {
            query.setParameter("sexo", sexo);
        }
        return query.getResultList();
    }

    public List<Object[]> buscarDeterminadaPessoa(String descricao, String nomeSobrenome) {
        EntityManager em = FabricaJPA.getEntityManager();
        String jpql = "SELECT p.pessoa.id, CONCAT(p.pessoa.nome, ' ', p.pessoa.sobrenome), p.pessoa.dataUltima, p.pessoa.ajudante FROM Parte p WHERE p.descricao = :descricao AND CONCAT(p.pessoa.nome, ' ', p.pessoa.sobrenome) LIKE :nomeSobrenome ORDER BY p.pessoa.dataUltima";
        TypedQuery<Object[]> query = em.createQuery(jpql, Object[].class);
        query.setParameter("descricao", descricao);
        query.setParameter("nomeSobrenome", "%" + nomeSobrenome + "%");
        return query.getResultList();
    }

    public void atualizarPessoa(int pessoaId, Pessoa novaPessoa) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            em.getTransaction().begin();

            Pessoa pessoa = em.find(Pessoa.class, pessoaId);
            if (pessoa != null) {
                pessoa.setNome(novaPessoa.getNome());
                pessoa.setSobrenome(novaPessoa.getSobrenome());
                pessoa.setSexo(novaPessoa.getSexo());
                pessoa.setCelular(novaPessoa.getCelular());
                pessoa.setDataUltima(novaPessoa.getDataUltima());
                pessoa.setSala(novaPessoa.getSala());

                em.merge(pessoa);
            }

            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            FabricaJPA.closeEtityManager();
        }
    }

    //Buscar pessoa para enviar whatsApp
    public Pessoa buscarPessoaPorNomeESobrenomeZap(String nomeCompleto) {
        EntityManager em = FabricaJPA.getEntityManager();
        String jpql = "SELECT p FROM Pessoa p WHERE CONCAT(p.nome, ' ', p.sobrenome) = :nomeCompleto";
        TypedQuery<Pessoa> query = em.createQuery(jpql, Pessoa.class);
        query.setParameter("nomeCompleto", nomeCompleto);

        try {
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null; // Retorna null se nenhuma pessoa for encontrada
        } finally {
            FabricaJPA.closeEtityManager();
        }
    }

    
    public List<Object[]> buscarNomesParaSubstituicao(String sexo, String descricao) {
        EntityManager em = FabricaJPA.getEntityManager();
        String jpql = "SELECT p.pessoa.id, CONCAT(p.pessoa.nome, ' ', p.pessoa.sobrenome), p.pessoa.dataUltima, p.pessoa.ajudante FROM Parte p WHERE p.descricao = :descricao";
        if (sexo != null) {
            jpql += " AND p.pessoa.sexo = :sexo";
        }
        jpql += " ORDER BY p.pessoa.dataUltima";
        TypedQuery<Object[]> query = em.createQuery(jpql, Object[].class);
        query.setParameter("descricao", descricao);
        if (sexo != null) {
            query.setParameter("sexo", sexo);
        }
        return query.getResultList();
    }
    
    
    public void atualizarAjudante(int pessoaId, LocalDate novoValorAjudante) {
        EntityManager em = FabricaJPA.getEntityManager();
        EntityTransaction transaction = em.getTransaction();

        try {
            transaction.begin();
            Pessoa pessoa = em.find(Pessoa.class, pessoaId); // Encontre a Pessoa pelo ID

            if (pessoa != null) {
                pessoa.setAjudante(novoValorAjudante); // Defina o novo valor para o campo "ajudante"
            } else {
                // Trate o caso em que a Pessoa não foi encontrada
            }

            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            throw e;
        } finally {
            em.close();
        }
    }
}
