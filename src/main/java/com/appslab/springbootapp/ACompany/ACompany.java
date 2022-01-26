package com.appslab.springbootapp.ACompany;

import com.appslab.springbootapp.Address.Address;
import com.appslab.springbootapp.Model.Employee;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
public class ACompany {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
  //  @Column(name = "emp_id")
    private Integer id;

    private String name;

    @OneToOne()
    private Address address;

    public ACompany() {
    }

    public ACompany(String name) {
        this.name = name;
    }
    public ACompany(String name, Address address, List<Employee> employeeList){
        this.name = name;
        this.address = address;
        this.employeeList = employeeList;
    }

   /* nefunkcne
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_emp_id", referencedColumnName = "emp_id")
    private List<Employee> employeeList;*/


   @OneToMany(mappedBy = "aCompany")
    private List<Employee>employeeList;

    /* 2funkčné   @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn(name = "companyid")
    private List<Employee> employeeList = new ArrayList<>();




    /*
1    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_id", insertable = false, updatable = false)
    private List<Employee> employeeList = new ArrayList<>();
*/
}
