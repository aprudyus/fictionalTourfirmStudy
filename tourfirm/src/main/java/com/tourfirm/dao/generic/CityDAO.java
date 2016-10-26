package com.tourfirm.dao.generic;

import com.tourfirm.domain.City;

import java.util.List;


public interface CityDAO extends GenericDAO<City, Integer>{

    public abstract City findById(Integer id);

    public abstract List<City> getAll();

    public abstract List<City> getAllInCountry(String country);

    public abstract Integer save(City city);

    public abstract City update(City city);

    public abstract void delete(City city);
}
