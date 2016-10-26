package com.tourfirm.service;

import com.tourfirm.domain.Hotel;

import java.util.List;


public interface HotelService {

    public abstract Integer save(Hotel city);

    public abstract Hotel findById(Integer id);

    public abstract Hotel update(Hotel city);

    public abstract void delete(Hotel city);

    public abstract List<Hotel> listHotels();

    public abstract List<Hotel> listHotelsC(String city);

}