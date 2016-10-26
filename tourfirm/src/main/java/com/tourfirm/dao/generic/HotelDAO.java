package com.tourfirm.dao.generic;

import com.tourfirm.domain.Hotel;

import java.util.List;


public interface HotelDAO extends GenericDAO<Hotel, Integer>{

    public abstract Hotel findById(Integer id);

    public abstract List<Hotel> getAll();

    public abstract List<Hotel> getAllInCity(String city);

    public abstract Integer save(Hotel hotel);

    public abstract Hotel update(Hotel hotel);

    public abstract void delete(Hotel hotel);
}
