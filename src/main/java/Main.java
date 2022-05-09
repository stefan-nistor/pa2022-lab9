import entities.CityEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void testJPA() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Default");

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        CityEntity cityEntity = CityEntity.builder()
                .country("Romania")
                .isCapital(false)
                .name("Iasi")
                .latitude(33.3)
                .longitude(11.2)
                .build();
        entityManager.persist(cityEntity);
        CityEntity result = (CityEntity) entityManager.createQuery(
                "SELECT c FROM CityEntity c WHERE c.name='Iasi'"
        ).getSingleResult();
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }

    public static void main(String[] args) {
        testJPA();
    }
}
