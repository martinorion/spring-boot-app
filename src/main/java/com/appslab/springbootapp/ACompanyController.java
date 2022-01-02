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
        aCompany.setName("Martin");
        aCompany.setName("KODEMASTER");

        aCompanyService.saveACompany(aCompany);
        return aCompany.getName();
    }
}
