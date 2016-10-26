package com.tourfirm.service;

import com.tourfirm.domain.City;

import java.util.List;


public interface CityService {

    public abstract Integer save(City city);

    public abstract City findById(Integer id);

    public abstract City update(City city);

    public abstract void delete(City city);

    public abstract List<City> listCities();

    public abstract List<City> listCitiesC(String country);

}
