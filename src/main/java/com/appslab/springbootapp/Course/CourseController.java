package com.appslab.springbootapp.Course;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @Autowired
    CourseServiceImpl courseService;

    @GetMapping("/course")
    public void addCourse(){
        Course course = new Course();
        course.setTitlee("Martin");
        course.setStartTime("12.18.2020");
        course.setEndTime("6.15.2022");
        courseService.saveCourse(course);
    }


}
