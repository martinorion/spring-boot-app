package com.appslab.springbootapp.Model;

import com.appslab.springbootapp.ACompany.ACompany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_EMPLOYEE",
        discriminatorType = DiscriminatorType.STRING)
public class Employee {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
   //@Column(name = "imd_id")
    private Integer id;

    @Enumerated(value = EnumType.STRING)
    private  EmployeeType employeeType;

  public Employee(){}

  /*  public Employee(EmployeeType employeeType){
        this.employeeType = employeeType;
    }*/

    float salary;
    int bonus;

   public Employee(EmployeeType employeeType, float salary, int bonus){
        this.employeeType = employeeType;
        this.salary = salary;
        this.bonus = bonus;
    }

   /* @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_emp_id", referencedColumnName = "emp_id")
    private ACompany aCompany;*/


    @ManyToOne
    private ACompany aCompany;

/* 2funkčné
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = ACompany.class)
    @JoinColumn(name = "companyid")
    private ACompany aCompany;

    @Column(name = "companyidd")
    private Integer companyId;


    /*
    public void getInfo(){
        System.out.println(employeeType.name + "’s salary is " + salary + " and bonus is " + bonus);
    }
*/

}

