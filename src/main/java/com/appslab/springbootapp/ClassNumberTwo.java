package com.appslab.springbootapp;

import org.springframework.stereotype.Component;

@Component
public class ClassNumberTwo {
    EmployeeService employeeService;


    public ClassNumberTwo(EmployeeService employeeService){

        this.employeeService = employeeService;
        employeeService.writeNumber();

    }
}
