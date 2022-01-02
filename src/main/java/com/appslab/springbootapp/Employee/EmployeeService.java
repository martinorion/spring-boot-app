package com.appslab.springbootapp.Employee;

import com.appslab.springbootapp.Model.Employee;

import java.util.List;

public interface EmployeeService {
    double totalSalary(List<Employee> employees);

    int  totalBonus(List<Employee> employees);

    void writeNumber();

    double totalDistance(double heightStair, double lengthStair, double total);
}
