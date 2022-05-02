package repo;

import entities.CountryEntity;

public interface CountryRepo {
    CountryEntity findById(Long id);

    CountryEntity findByName(String name);
}
