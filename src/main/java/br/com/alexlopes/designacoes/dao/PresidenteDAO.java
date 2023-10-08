package br.com.alexlopes.designacoes.dao;

import br.com.alexlopes.designacoes.fabrica.FabricaJPA;
import br.com.alexlopes.designacoes.model.Presidente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;
import java.time.LocalDate;
import java.util.List;

public class PresidenteDAO {
    
     // Método para criar a tabela presidente
    public static void criarTabela() {
        EntityManager em = FabricaJPA.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            String createTableSQL = "CREATE TABLE Presidente (id INT NOT NULL GENERATED ALWAYS AS IDENTITY PRIMARY KEY, pessoa INT NOT NULL, sala VARCHAR(10), data DATE, FOREIGN KEY (pessoa) REFERENCES pessoa(id) ON DELETE CASCADE)";
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

    //Cadastrar os presidentes da reunião de meio de semana
    public void cadastrar(Presidente a) {
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

    // Excluir registro de Presidente com base no ID da pessoa
    public void excluirPresidentePorPessoaId(int pessoaId) {
        EntityManager em = FabricaJPA.getEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();

            // Primeiro, verifique se o presidente existe
            Presidente presidente = em.createQuery("SELECT p FROM Presidente p WHERE p.pessoa.id = :pessoaId", Presidente.class)
                    .setParameter("pessoaId", pessoaId)
                    .getSingleResult();

            if (presidente != null) {
                em.remove(presidente); // Exclua o presidente encontrado
                tx.commit();
            } else {
                tx.rollback();
            }
        } catch (NoResultException e) {
            // Trate o caso em que nenhum presidente com o ID de pessoa especificado foi encontrado
            tx.rollback();
            System.out.println("Presidente não encontrado com o ID de pessoa: " + pessoaId);
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

    //Pesquisar ultimo presidente designado sem filtrar por sala
    public Presidente buscarPresidenteComDataMaisRecente() {
        EntityManager em = FabricaJPA.getEntityManager();
        String jpql = "SELECT p FROM Presidente p WHERE p.data = (SELECT MAX(p2.data) FROM Presidente p2)";
        TypedQuery<Presidente> query = em.createQuery(jpql, Presidente.class);

        List<Presidente> resultList = query.getResultList();
        if (resultList.isEmpty()) {
            return null; // Retorna null se a lista estiver vazia
        } else {
            return resultList.get(0); // Retorna o primeiro presidente da lista
        }
    }

    public Presidente buscarPresidenteAntigoFezParteNaSala_A() {
        EntityManager em = FabricaJPA.getEntityManager();

        // Busca o presidente com a data mais antiga na SalaA, se existir
        String jpqlOldest = "SELECT p FROM Presidente p WHERE p.sala = 'SalaA' ORDER BY p.data ASC";
        TypedQuery<Presidente> queryOldest = em.createQuery(jpqlOldest, Presidente.class);
        queryOldest.setMaxResults(1); // Limita o resultado a apenas um presidente
        List<Presidente> resultListOldest = queryOldest.getResultList();

        // Retorna o primeiro presidente da lista (o mais antigo na SalaA) ou null se a lista estiver vazia
        if (!resultListOldest.isEmpty()) {
            return resultListOldest.get(0);
        }

        // Se não encontrou nenhum presidente na SalaA, busca o presidente com data nula em qualquer sala
        String jpqlNull = "SELECT p FROM Presidente p WHERE p.data IS NULL";
        TypedQuery<Presidente> queryNull = em.createQuery(jpqlNull, Presidente.class);
        queryNull.setMaxResults(1); // Limita o resultado a apenas um presidente
        List<Presidente> resultListNull = queryNull.getResultList();

        // Retorna o primeiro presidente da lista (com data nula) ou null se a lista estiver vazia
        if (!resultListNull.isEmpty()) {
            return resultListNull.get(0);
        }

        return null; // Retorna null se não encontrou nenhum presidente em nenhuma sala
    }

    public Presidente buscarPresidenteAntigoFezParteNaSala_A(int idPresidenteIgnorado) {
        EntityManager em = FabricaJPA.getEntityManager();

        // Primeiro, busca um presidente com data nula, exceto o presidente com o ID especificado
        String jpqlNull = "SELECT p FROM Presidente p WHERE p.data IS NULL AND p.id != :idIgnorado";
        TypedQuery<Presidente> queryNull = em.createQuery(jpqlNull, Presidente.class);
        queryNull.setParameter("idIgnorado", idPresidenteIgnorado);
        List<Presidente> resultListNull = queryNull.getResultList();

        // Se encontrou presidente com data nula, retorna o primeiro encontrado
        if (!resultListNull.isEmpty()) {
            return resultListNull.get(0);
        } else {
            // Caso contrário, busca o presidente com a data mais antiga na SalaA, exceto o presidente com o ID especificado
            String jpqlOldest = "SELECT p FROM Presidente p WHERE p.sala = 'SalaA' AND p.data = (SELECT MIN(p2.data) FROM Presidente p2 WHERE p2.sala = 'SalaA' AND p2.id != :idIgnorado)";
            TypedQuery<Presidente> queryOldest = em.createQuery(jpqlOldest, Presidente.class);
            queryOldest.setParameter("idIgnorado", idPresidenteIgnorado);
            List<Presidente> resultListOldest = queryOldest.getResultList();

            if (resultListOldest.isEmpty()) {
                return null;
            } else {
                return resultListOldest.get(0);
            }
        }
    }

    

    public Presidente buscarPresidenteAntigoFezParteNaSala_B() {
    EntityManager em = FabricaJPA.getEntityManager();

    // Busca presidentes ordenados por COALESCE(pessoa.dataUltima, '9999-12-31') em ordem crescente
    String jpql = "SELECT p FROM Presidente p " +
                  "LEFT JOIN p.pessoa pessoa " +
                  "WHERE p.sala IS NULL AND p.data IS NULL " +
                  "OR (p.data IS NULL AND pessoa.dataUltima IS NULL) " +
                  "ORDER BY pessoa.dataUltima ASC";

    TypedQuery<Presidente> query = em.createQuery(jpql, Presidente.class);
    List<Presidente> resultList = query.getResultList();

    // Se encontrou presidentes, retorna o primeiro encontrado
    if (!resultList.isEmpty()) {
        return resultList.get(0);
    }

    // Caso contrário, siga o método normalmente (buscando em todas as salas)
    return buscarPresidenteAntigoFezParteNaSala_B_Normal();
}


    

// Método para buscar presidente mais antigo na SalaB sem verificar data nula
private Presidente buscarPresidenteAntigoFezParteNaSala_B_Normal() {
    EntityManager em = FabricaJPA.getEntityManager();
    // Aqui você continua o código normalmente
    // Busca o presidente com a data mais antiga na SalaB
    String jpqlOldest = "SELECT p FROM Presidente p WHERE p.sala = 'SalaB' ORDER BY p.data ASC";
    TypedQuery<Presidente> queryOldest = em.createQuery(jpqlOldest, Presidente.class);
    queryOldest.setMaxResults(1); // Limita o resultado a apenas um presidente
    List<Presidente> resultListOldest = queryOldest.getResultList();

    // Retorna o primeiro presidente da lista (o mais antigo na SalaB) ou null se a lista estiver vazia
    if (!resultListOldest.isEmpty()) {
        return resultListOldest.get(0);
    }

    return null; // Retorna null se não encontrou nenhum presidente na SalaB
}


    //Buscar determinado presidente procurando pelo id
    public Presidente buscarPresidentePorId(int presidenteId) {
        EntityManager em = FabricaJPA.getEntityManager();
        String jpql = "SELECT p FROM Presidente p WHERE p.id = :presidenteId";
        TypedQuery<Presidente> query = em.createQuery(jpql, Presidente.class);
        query.setParameter("presidenteId", presidenteId);
        try {
            return query.getSingleResult();
        } catch (NoResultException e) {
            // Caso não encontre o presidente pelo ID fornecido, buscar o primeiro cadastrado
            jpql = "SELECT p FROM Presidente p ORDER BY p.id ASC";
            TypedQuery<Presidente> queryPrimeiroCadastrado = em.createQuery(jpql, Presidente.class);
            queryPrimeiroCadastrado.setMaxResults(1);
            return queryPrimeiroCadastrado.getSingleResult();
        }
    }

    // Verificar se existe um presidente com base no ID da pessoa
    public boolean verificarExistenciaPresidentePorPessoaId(int pessoaId) {
        EntityManager em = FabricaJPA.getEntityManager();
        String jpql = "SELECT COUNT(p) FROM Presidente p WHERE p.pessoa.id = :pessoaId";
        TypedQuery<Long> query = em.createQuery(jpql, Long.class);
        query.setParameter("pessoaId", pessoaId);
        Long resultado = query.getSingleResult();

        return resultado > 0;
    }

    //Alterar a ultima sala e a data que o presidente presidiu a reunião
    public void alterarSalaEDataPresidente(int presidenteId, String novaSala, LocalDate novaData) {
        EntityManager em = FabricaJPA.getEntityManager();
        Presidente presidente = em.find(Presidente.class, presidenteId);
        if (presidente != null) {
            EntityTransaction transaction = em.getTransaction();
            transaction.begin();
            presidente.setSala(novaSala);
            presidente.setData(novaData);
            transaction.commit();
        }
        em.close();
    }

    public Presidente buscarPorIdPessoa(int idPessoa) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            String jpql = "SELECT p FROM Presidente p WHERE p.pessoa.id = :idPessoa";
            TypedQuery<Presidente> query = em.createQuery(jpql, Presidente.class);
            query.setParameter("idPessoa", idPessoa);
            List<Presidente> resultados = query.getResultList();
            if (!resultados.isEmpty()) {
                return resultados.get(0);
            }
            return null; // Retorna nulo se não encontrar um presidente com o ID da pessoa
        } finally {
            em.close();
        }
    }

}
