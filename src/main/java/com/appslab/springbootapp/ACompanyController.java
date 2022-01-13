package com.appslab.springbootapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ACompanyController {
    @Autowired
    private ACompanyService aCompanyService;


    @GetMapping("/company")
    public String returnCompany(){

        Address address = new Address();
        ACompany aCompany = new ACompany();
        aCompany.setName("Michal");
        address.setStreet("fff");
        address.setZipCode(5);
        address.setCity("addfas");
        address.setState("dsfaf");




        ACompany aCompany1 = new ACompany();
        aCompany1.setName("Martin");

        aCompanyService.saveACompany(aCompany);
        aCompanyService.saveACompany(aCompany1);
        return aCompany.getName();
    }
}
