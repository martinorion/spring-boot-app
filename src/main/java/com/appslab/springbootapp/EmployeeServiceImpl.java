package com.appslab.springbootapp;

import com.appslab.springbootapp.Model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService  {

    public int number = 0;



    public double totalSalary(List<Employee> employees){
        return employees.stream().mapToDouble(Employee::getSalary).sum();
    }

    public int totalBonus(List<Employee> employees){
         return employees.stream().mapToInt(Employee::getBonus).sum();
    }

    @Override
    public void writeNumber() {
        number = number + 1;
        System.out.println(number);
    }
}
