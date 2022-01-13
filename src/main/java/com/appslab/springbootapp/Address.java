package com.appslab.springbootapp;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.*;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String street;
    int zipCode;
    String city;
    String state;

    public Address(){}
    public Address(String street, int zipCode, String city, String state ){
        this.street = street;
        this.zipCode = zipCode;
        this.city = city;
        this.state = state;
    }

    @OneToOne
    @MapsId
    private ACompany aCompany;

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStreet(){
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }


}
