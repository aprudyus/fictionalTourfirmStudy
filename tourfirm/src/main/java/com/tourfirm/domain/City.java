package com.tourfirm.domain;

import javax.persistence.*;

@Entity
@Table(name = "countries")
public class City {

    @Column(name = "city")
    private String city;

    @Column(name = "country")
    private String country;

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

    public void setCountry(String toSet){
        this.country = toSet;
    }

    public String getCountry(){
        return this.country;
    }

    @Override
    public String toString(){
        return this.getCity()+", "+this.getCountry();

    }
}
