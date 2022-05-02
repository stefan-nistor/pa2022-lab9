package repo;

import entities.CityEntity;

public interface CityRepo{

    void save(CityEntity entity);
    CityEntity findById(Long id);

    CityEntity findByName(String name);
}
