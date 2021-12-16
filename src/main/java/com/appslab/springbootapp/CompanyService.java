package com.appslab.springbootapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface CompanyService  {
    void saveCompany(Company company);
}
