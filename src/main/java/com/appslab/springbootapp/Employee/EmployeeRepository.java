package com.appslab.springbootapp.Employee;

import com.appslab.springbootapp.ACompany.ACompany;
import com.appslab.springbootapp.Model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
}
