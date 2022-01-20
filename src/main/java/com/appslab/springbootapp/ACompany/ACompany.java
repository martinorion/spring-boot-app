package com.appslab.springbootapp.ACompany;

import com.appslab.springbootapp.Address.Address;

import javax.persistence.*;

@Entity
public class ACompany {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String name;

    @OneToOne()
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
