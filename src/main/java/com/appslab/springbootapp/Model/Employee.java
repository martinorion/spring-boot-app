package com.appslab.springbootapp.Model;

import com.appslab.springbootapp.ACompany.ACompany;
import com.appslab.springbootapp.Course.Course;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

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

/*
    @ManyToOne
    private ACompany aCompany;
*/

    @ManyToOne(fetch = FetchType.EAGER, targetEntity = ACompany.class)
    @JoinColumn(name = "companyid", insertable = false, updatable = false)
    private ACompany aCompany;

    @Column(name = "companyidd")
    private Integer companyId;


    @ManyToMany
    @JoinTable(
            name = "course_employee_id",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id"))
            List<Course> courseList;
    /*
    public void getInfo(){
        System.out.println(employeeType.name + "’s salary is " + salary + " and bonus is " + bonus);
    }
*/

}

