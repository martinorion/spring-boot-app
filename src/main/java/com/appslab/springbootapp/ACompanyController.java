package com.appslab.springbootapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ACompanyController {
    @Autowired
    private ACompanyService aCompanyService;


    @GetMapping("/company")
    public String returnCompany(){
        ACompany aCompany = new ACompany();

        aCompany.setName("Michal");
        ACompany aCompany1 = new ACompany();
        aCompany1.setName("Martin");

        aCompanyService.saveACompany(aCompany);
        aCompanyService.saveACompany(aCompany1);
        return aCompany.getName();
    }
}
