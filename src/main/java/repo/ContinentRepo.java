package repo;

import entities.ContinentEntity;

import java.util.Optional;

public interface ContinentRepo {
    ContinentEntity findById(Long id);

    ContinentEntity findByName(String name);
}
