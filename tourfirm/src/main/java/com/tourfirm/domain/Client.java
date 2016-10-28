package com.tourfirm.domain;

import javax.persistence.*;

@Entity
@Table(name = "clients")
public class Client {

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "firstname")
    private String firstname;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    public Integer getId(){
        return this.id;
    }

    public void setLastname(String toSet)
    {
        this.lastname = toSet;
    }

    public String getLastname(){
        return this.lastname;
    }

    public void setId(Integer toSet){
        this.id = toSet;
    }

    public void setFirstname(String toSet){
        this.firstname = toSet;
    }

    public String getFirstname(){
        return this.firstname;
    }

    @Override
    public String toString(){
        return this.getFirstname()+", "+this.getLastname();

    }
}