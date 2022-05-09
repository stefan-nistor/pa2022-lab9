package repo;

import entities.ContinentEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class ContinentRepoImpl implements ContinentRepo {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public ContinentEntity findById(Long id) {
        return (ContinentEntity) entityManager.createQuery("SELECT c from entities.ContinentEntity c where c.id=:id")
                .setParameter("id", id)
                .getSingleResult();
    }

    @Override
    public ContinentEntity findByName(String name) {
        return (ContinentEntity) entityManager.createQuery("SELECT c from ContinentEntity c where c.name=:name")
                .setParameter("name", name)
                .getSingleResult();
    }
}
