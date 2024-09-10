package br.com.alexlopes.designacoes.fabrica;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class FabricaJPA {

    private static final String PERSISTENCE_UNIT = "go";
    private static EntityManagerFactory fabrica;

    public static EntityManager getEntityManager() {
        if (fabrica == null || !fabrica.isOpen()) {
            fabrica = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        }
        return fabrica.createEntityManager();
    }

    public static void closeEntityManager() {
        if (fabrica != null && fabrica.isOpen()) {
            fabrica.close();
        }
    }
}

