package com.appslab.springbootapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl   {
    CompanyRepository companyRepository;

   public void saveCompany(Company company){
        companyRepository.save(company);
    }
}
