package com.appslab.springbootapp.Model;

import com.appslab.springbootapp.ACompany.ACompany;
import com.appslab.springbootapp.Course.Course;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_EMPLOYEE",
        discriminatorType = DiscriminatorType.STRING)
public class Employee {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(name = "TYPE_EMPLOYEE", insertable = false, updatable = false)
    @Enumerated(value = EnumType.STRING)
    private  EmployeeType employeeType;

  public Employee(){}

    float salary;
    int bonus;

   public Employee(EmployeeType employeeType, float salary, int bonus){
        this.employeeType = employeeType;
        this.salary = salary;
        this.bonus = bonus;
    }

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = ACompany.class)
    @JoinColumn(name = "companyId", insertable = false, updatable = false)
    private ACompany aCompany;

    @Column(name = "companyId")
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

