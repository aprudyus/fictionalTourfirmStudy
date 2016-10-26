package com.tourfirm.service;


import com.tourfirm.dao.generic.CityDAO;
import com.tourfirm.domain.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDAO cities;

    @Override
    public List<City> listCities() {
        return cities.getAll();
    }

    @Override
    public List<City> listCitiesC(String country) {
        return cities.getAllInCountry(country);
    }

    @Override
    public City findById(Integer id) {
        return cities.findById(id);
    }

    @Override
    public Integer save(City city) {
        return cities.save(city);
    }

    @Override
    public City update(City city) {
        return cities.update(city);
    }

    @Override
    public void delete(City city) {
        cities.delete(city);
    }

}
