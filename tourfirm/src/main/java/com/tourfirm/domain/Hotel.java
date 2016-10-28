package com.tourfirm.domain;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;
import java.util.Map;

@Entity
@Table(name = "hotels")
public class Hotel {

    @Column(name = "city")
    private String city;

    @Column(name = "hotel")
    private String hotel;

    @Column(name = "datefrom")
    private Date datefrom;

    @Column(name = "datetill")
    private Date datetill;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public void setDatefrom(Date toSet){
        this.datefrom = toSet;
    }

    public Date getDatefrom() {
        return this.datefrom;
    }

    public void setDatetill(Date toSet){
        this.datetill = toSet;
    }

    public Date getDatetill() {
        return this.datetill;
    }

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
        System.out.println("Hotel" + this.getHotel() + "\n Located in" + this.getCity() + " \nRooms available from" + this.getDatefrom() + " to " + this.getDatetill());
        return "Hotel"+ this.getHotel()+"\nLocated in" + this.getCity()+" \nRooms available from "+this.getDatefrom()+" to "+this.getDatetill();
    }
}