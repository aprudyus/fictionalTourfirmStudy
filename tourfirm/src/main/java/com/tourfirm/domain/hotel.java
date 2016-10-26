package com.tourfirm.domain;

import javax.persistence.*;

@Entity
@Table(name = "hotels")
public class Hotel {

    @Column(name = "city")
    private String city;

    @Column(name = "hotel")
    private String hotel;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    public Integer getId(){
        return this.id;
    }

    public void setCity(String toSet)
    {
        this.city = toSet;
    }

    public String getCity(){
        return this.city;
    }

    public void setId(Integer toSet){
        this.id = toSet;
    }

    public void setHotel(String toSet){
        this.hotel = toSet;
    }

    public String getHotel(){
        return this.hotel;
    }

    @Override
    public String toString(){
        return this.getHotel()+", "+this.getCity();

    }
}