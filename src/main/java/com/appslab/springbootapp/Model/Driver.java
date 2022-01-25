package com.appslab.springbootapp.Model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.lang.reflect.Type;

@Entity
@DiscriminatorValue(value = "DRIVER")
public class Driver extends Employee {
   public Driver(){}
    public Driver(float salary, int bonus){
    super(EmployeeType.DRIVER, salary,bonus);
    }


}
