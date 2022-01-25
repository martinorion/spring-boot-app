package com.appslab.springbootapp.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_EMPLOYEE",
        discriminatorType = DiscriminatorType.STRING)
public class Employee {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;



    @Enumerated(value = EnumType.STRING)
    private  EmployeeType employeeType;


    public Employee(){}
  /*  public Employee(EmployeeType employeeType){
        this.employeeType = employeeType;
    }*/


    float salary;
    int bonus;


    public Employee(EmployeeType employeeType, float salary, int bonus){
        this.employeeType = employeeType;
        this.salary = salary;
        this.bonus = bonus;
    }

    /*
    public void getInfo(){
        System.out.println(employeeType.name + "’s salary is " + salary + " and bonus is " + bonus);
    }
*/

}

