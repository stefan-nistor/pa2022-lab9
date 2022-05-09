package entities;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Getter
@Setter
@Slf4j
public class EntityManagerSingleton {
    private static final EntityManagerSingleton instance = new EntityManagerSingleton();
    private final String PERSISTENCE_UNIT_NAME = "lab9";
    private EntityManagerFactory entityManagerFactory;

    private EntityManagerSingleton() {
    }

    public static EntityManagerSingleton getInstance() {
        return instance;
    }

    public void createEntityManagerFactory() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        log.info("Persistence started at: {}", new java.util.Date());
    }

    public void closeEntityManagerFactory() {
        if (entityManagerFactory != null) {
            entityManagerFactory.close();
            entityManagerFactory = null;
            log.info("Persistence finished at: {}", new java.util.Date());
        }
    }

}
