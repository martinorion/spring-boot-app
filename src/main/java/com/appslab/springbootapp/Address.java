package com.appslab.springbootapp;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Address {
    int id;
    String street;
    int zipCode;
    String city;
    String state;


}
