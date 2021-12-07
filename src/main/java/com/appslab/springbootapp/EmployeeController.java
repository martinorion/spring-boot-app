package com.appslab.springbootapp;

import com.appslab.springbootapp.Model.Employee;
import com.appslab.springbootapp.Model.Programmer;
import com.appslab.springbootapp.Model.Teacher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class EmployeeController {
 EmployeeService employeeService;
    List<Employee> employees = Arrays.asList(new Programmer(100, 1100), new Teacher(150, 2560));
   public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/hello")
    public String Hello(){
      return "Hello Spring Boot";
    }

    @GetMapping("/s1")
    public double totalSalary() {

           return employeeService.totalSalary(employees);
    }

    @GetMapping("/s2")
    public int totalBonus() {
        return employeeService.totalBonus(employees);
    }

    double heightStair = 0.2;
    double lengthStair = 0.4;
    double total = 100;

    @GetMapping("/snailGoes")
    @RequestMapping()
    public double totalDistance(){

        return((total / heightStair) *(lengthStair + heightStair ));
    }

}
