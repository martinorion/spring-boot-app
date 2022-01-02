package com.appslab.springbootapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ACompanyServiceImpl implements ACompanyService{

    @Autowired
    ACompanyRepository aCompanyRepository;

    @Override
    public void saveACompany(ACompany aCompany) {
       aCompanyRepository.save(aCompany);
    }
}
