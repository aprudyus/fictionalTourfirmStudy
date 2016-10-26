package com.tourfirm.service;


import com.tourfirm.dao.generic.CityDAO;
import com.tourfirm.dao.generic.HotelDAO;
import com.tourfirm.domain.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService{

    @Autowired
    private HotelDAO hotels;

    public Integer save(Hotel hotel){
        return hotels.save(hotel);
    }

    public Hotel findById(Integer id){
        return hotels.findById(id);
    }

    public Hotel update(Hotel hotel){
        return hotels.update(hotel);
    }

    public void delete(Hotel hotel){
        hotels.delete(hotel);

    }

    public List<Hotel> listHotels(){
        return hotels.getAll();
    }

    public List<Hotel> listHotelsC(String city){
        return hotels.getAllInCity(city);
    }
}
