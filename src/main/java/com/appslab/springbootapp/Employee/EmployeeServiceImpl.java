package com.appslab.springbootapp.Employee;

import com.appslab.springbootapp.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService  {

    //public int number = 0;

    @Autowired
    private EmployeeRepository employeeRepository;


    public double totalSalary(List<Employee> employees){
        return employees.stream().mapToDouble(Employee::getSalary).sum();
    }

    public int totalBonus(List<Employee> employees){
        return employees.stream().mapToInt(Employee::getBonus).sum();
    }

    @Override
    public void saveAEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAll()
    {
        List<Employee> employees = new ArrayList<>();
        employeeRepository.findAll().forEach(employees::add);

        return employees;
    }

    /*NEDOLEZITE
    @Override
    public void writeNumber() {
        number = number + 1;
        System.out.println(number);
    }

    @Override
    public double totalDistance(double heightStair, double lengthStair, double total) {
        return (total/heightStair)*(lengthStair + heightStair);
    }
*/


  /*  @Override
    public void saveACompany(Employee employee) {
        employeeRepository.save(employee);
    }*/
}
