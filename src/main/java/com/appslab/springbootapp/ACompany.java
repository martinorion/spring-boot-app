package com.appslab.springbootapp;

import javax.persistence.*;

@Entity
public class ACompany {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String name;

   @OneToOne
   @PrimaryKeyJoinColumn
   private Address address;

    public ACompany(){}
    public ACompany(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
