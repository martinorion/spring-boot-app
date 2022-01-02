package com.appslab.springbootapp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ACompany {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    private String name;

    public ACompany(){}
    public ACompany(String name){
        super();

        this.name = name;
    }


    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

}
