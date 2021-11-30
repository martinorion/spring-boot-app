package com.appslab.springbootapp;

import com.appslab.springbootapp.Model.Employee;
import com.appslab.springbootapp.Model.Programmer;
import com.appslab.springbootapp.Model.Teacher;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DependencyInjectionDemo {
    EmployeeService employeeService;
    List<Employee> employees = Arrays.asList(new Programmer(100, 1100), new Teacher(150, 2560));
    EmployeeServiceImpl employeeServiceImpl;

   public double getSum(List<Employee> employees){
     return employeeService.totalBonus(employees) + employeeService.totalSalary(employees);

    }

    public DependencyInjectionDemo(EmployeeService employeeService, EmployeeServiceImpl employeeServiceImpl){
       this.employeeService = employeeService;
        System.out.println(getSum(employees));
        this.employeeServiceImpl = employeeServiceImpl;
        employeeServiceImpl.writeNum();

    }

}
