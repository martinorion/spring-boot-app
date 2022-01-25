package com.appslab.springbootapp.Employee;

import com.appslab.springbootapp.ACompany.ACompany;
import com.appslab.springbootapp.ACompany.ACompanyRepository;
import com.appslab.springbootapp.Model.Employee;
import com.appslab.springbootapp.Model.Programmer;
import com.appslab.springbootapp.Model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public String Hello() {
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


@GetMapping("/employee")
public void addEmployee(){
    Employee employee = new Programmer( 2000, 50);
    employeeService.saveAEmployee(employee);
}

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("/employee")
    void newEmployee(@RequestBody Employee newEmployee) {
        employeeService.saveAEmployee(newEmployee);
    }

    /*NEDOLEZITE

    double heightStair = 0.2;
    double lengthStair = 0.4;
    double total = 100;

    @GetMapping(path = "/snailGoes1")

    public double totalDistance(@RequestParam(value = "heightStair", defaultValue= "0,2") double heightStair, @RequestParam(value = "lengthStair", defaultValue= "0,4") double lengthStair, @RequestParam(value = "total", defaultValue= "100") double total){

     return employeeService.totalDistance(heightStair, lengthStair, total);
    }

 */

 }


