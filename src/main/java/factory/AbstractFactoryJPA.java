package factory;

import javax.persistence.EntityManager;

public interface AbstractFactoryJPA<T> {
    void save(EntityManager em, T x);

    T findByName(EntityManager em, String name);

    T findById(EntityManager em, Long id);
}
