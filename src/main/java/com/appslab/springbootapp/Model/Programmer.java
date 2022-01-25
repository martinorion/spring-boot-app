package com.appslab.springbootapp.Model;

import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue(value = "PROGRAMMER")
public class Programmer extends Employee {
 public Programmer(){}
    public Programmer(float salary, int bonus){
        super(EmployeeType.PROGRAMMER, salary,bonus);
    }


}
