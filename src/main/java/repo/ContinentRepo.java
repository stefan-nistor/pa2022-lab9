package repo;

import entities.ContinentEntity;

import java.util.Optional;

public interface ContinentRepo {
    Optional<ContinentEntity> findById(Long id);

    Optional<ContinentEntity> findByName(String name);
}
