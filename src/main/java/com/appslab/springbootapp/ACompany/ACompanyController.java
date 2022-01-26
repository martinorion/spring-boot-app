package com.appslab.springbootapp.ACompany;

import com.appslab.springbootapp.Address.Address;
import com.appslab.springbootapp.Address.AddressService;
import com.appslab.springbootapp.Model.Employee;
import com.appslab.springbootapp.Model.EmployeeType;
import com.appslab.springbootapp.Model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ACompanyController {
    @Autowired
    private ACompanyService aCompanyService;

    @Autowired
    private AddressService addressService;

    @Autowired
    private ACompanyRepository aCompanyRepository;

    @GetMapping("/company")
    public String returnCompany(){
        ACompany aCompany = new ACompany();
        aCompany.setName("Michal");
        Address address = new Address();
        address.setStreet("BBBB");
        address.setZipCode(5);
        address.setCity("CCCC");
        address.setState("DDDD");
        Employee employee = new Teacher(1500, 50);
        Employee employee2 = new Teacher(2000, 300);
        List<Employee> employees = Arrays.asList(employee, employee2);
        ACompany aCompany1 = new ACompany("Martin",address,employees);

        aCompany.setAddress(address);
        addressService.saveAddress(address);
        aCompanyService.saveACompany(aCompany);


        //aCompanyService.saveACompany(aCompany1);
        return aCompany.getName();
    }

    @PostMapping("/company")
    ACompany newCompany(@RequestBody ACompany newCompany) {
        addressService.saveAddress(newCompany.getAddress());
        return aCompanyRepository.save(newCompany);
    }
}
