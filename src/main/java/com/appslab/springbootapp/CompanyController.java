package com.appslab.springbootapp;
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


    CompanyService companyService;

   @GetMapping("/company")
    public void saveCompany(){
       Company company = new Company();
       companyService.saveCompany(company);

    }
}

    /*
    @Autowired
    private CompanyRepository repo;

    @GetMapping("/users")
    public String listAll(Model model) {
        List<JpaRepository> listCompany = repo.findAll();
        model.addAttribute("listUsers", listCompany);
        return "users";
     } */