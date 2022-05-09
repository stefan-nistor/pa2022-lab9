package repo;

import entities.CityEntity;

import java.util.List;

public interface CityRepo {

    void save(CityEntity entity);

    CityEntity findById(Long id);

    CityEntity findByName(String name);

    List<CityEntity> findByCountry(String name);
}
