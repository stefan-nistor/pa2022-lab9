package repo;

import entities.CountryEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class CountryRepoImpl implements CountryRepo {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public CountryEntity findById(Long id) {
        return (CountryEntity) entityManager.createQuery("SELECT c FROM CountryEntity c WHERE c.id=:id")
                .setParameter("id", id)
                .getSingleResult();
    }

    @Override
    public CountryEntity findByName(String name) {
        return (CountryEntity) entityManager.createQuery("SELECT c FROM CountryEntity c WHERE c.name=:name")
                .setParameter("name", name)
                .getSingleResult();
    }
}
