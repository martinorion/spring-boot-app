package com.appslab.springbootapp.Model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "TEACHER")
public class Teacher extends Employee {

    public  Teacher(){}
    public Teacher(float salary, int bonus){
super(EmployeeType.TEACHER, salary,bonus);
    }
    }

