package com.appslab.springbootapp;

import org.springframework.stereotype.Component;

@Component
public class ClassNumberTwo {
    EmployeeService employeeService;
    EmployeeServiceImpl employeeServiceImpl;

    public ClassNumberTwo(EmployeeService employeeService, EmployeeServiceImpl employeeServiceImpl){

        this.employeeServiceImpl = employeeServiceImpl;
        employeeServiceImpl.writeNum();

    }
}
