package com.appslab.springbootapp;

import com.appslab.springbootapp.Model.Employee;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService  {

    public double totalSalary(List<Employee> employees){
        return employees.stream().mapToDouble(Employee::getSalary).sum();
    }

    public int totalBonus(List<Employee> employees){
         return employees.stream().mapToInt(Employee::getBonus).sum();
    }
}
