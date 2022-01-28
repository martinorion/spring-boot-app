package com.appslab.springbootapp.Course;

import com.appslab.springbootapp.Model.Employee;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;


@Getter
@Setter
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    private String titlee;
    private String startTime;
     private String endTime;
    //private Date startTime;
   // private Date endTime;


    public Course(){}
    public  Course(String titlee, String startTime, String endTime /*Date startTime, Date endTime*/){
        this.titlee = titlee;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @ManyToMany(mappedBy = "courseList")
    List<Employee> employees;
}
