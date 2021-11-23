package com.appslab.springbootapp;

import com.appslab.springbootapp.Model.Employee;

import java.util.List;

public interface EmployeeService {
    double totalSalary(List<Employee> employees);

    int  totalBonus(List<Employee> employees);
}
