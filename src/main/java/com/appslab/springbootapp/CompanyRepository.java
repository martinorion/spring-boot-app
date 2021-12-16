package com.appslab.springbootapp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


public interface CompanyRepository extends CrudRepository<Company, Integer>
/*public interface CompanyRepository extends JpaRepository<JpaRepository, Integer> */{

}
