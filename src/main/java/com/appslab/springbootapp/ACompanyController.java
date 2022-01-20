package com.appslab.springbootapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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

        // ACompany aCompany1 = new ACompany();
        // aCompany1.setName("Martin");
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
