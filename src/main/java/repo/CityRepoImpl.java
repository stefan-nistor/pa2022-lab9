package repo;

import entities.CityEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class CityRepoImpl implements CityRepo{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(CityEntity entity) {

    }

    @Override
    public CityEntity findById(Long id) {
        return (CityEntity) entityManager.createQuery("SELECT c FROM CityEntity c WHERE c.id=:id")
                .setParameter("id", id)
                .getSingleResult();
    }

    @Override
    public CityEntity findByName(String name) {
        return (CityEntity) entityManager.createQuery("SELECT c FROM CityEntity c WHERE c.name=:name")
                .setParameter("name", name)
                .getSingleResult();
    }

    @Override
    public List<CityEntity> findByCountry(String name) {
        return entityManager.createNamedQuery("CityEntity.findByCountry")
                .setParameter("country", name)
                .getResultList();
    }
}
