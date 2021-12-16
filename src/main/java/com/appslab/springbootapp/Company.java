package com.appslab.springbootapp;

import javax.persistence.Entity;
import javax.persistence.*;


@Entity
@Table(name = "users")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String email;

    private String password;

    // getters and setters...
}
