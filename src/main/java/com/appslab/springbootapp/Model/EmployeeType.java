package com.appslab.springbootapp.Model;

public enum EmployeeType {

        TEACHER("Teacher"),
        PROGRAMMER("Programmer"),
        DRIVER("Driver");

        String name;
        EmployeeType(String name){
                this.name = name;
        }
}
