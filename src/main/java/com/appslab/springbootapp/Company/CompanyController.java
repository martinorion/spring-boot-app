/*package com.appslab.springbootapp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.persistence.Entity;
import java.util.List;


@RestController
public class CompanyController {


    CompanyServiceImpl companyServiceImpl;
    CompanyRepository companyRepository;

    @GetMapping("/company")
    public String saveCompany(){
       Company company = new Company(0, "Martin");
       companyServiceImpl.saveCompany(company);
           return company.getName();
    }
}*/

    /*
    @Autowired
    private CompanyRepository repo;

    @GetMapping("/users")
    public String listAll(Model model) {
        List<JpaRepository> listCompany = repo.findAll();
        model.addAttribute("listUsers", listCompany);
        return "users";
     } */