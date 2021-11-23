package com.appslab.springbootapp;

import com.appslab.springbootapp.Model.Employee;
import com.appslab.springbootapp.Model.Programmer;
import com.appslab.springbootapp.Model.Teacher;

import java.util.Arrays;
import java.util.List;

public class DependencyInjectionDemo {
    EmployeeService employeeService;
    List<Employee> employees = Arrays.asList(new Programmer(100, 1100), new Teacher(150, 2560));

   public double getSum(List<Employee> employees){
     return employeeService.totalBonus(employees) + employeeService.totalSalary(employees);

    }

    public DependencyInjectionDemo(EmployeeServiceImpl employeeService){
       this.employeeService = employeeService;
        System.out.println(getSum(employees));
    }
}
