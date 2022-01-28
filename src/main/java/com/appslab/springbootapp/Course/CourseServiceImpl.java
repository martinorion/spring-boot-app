package com.appslab.springbootapp.Course;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
   CourseRepository courseRepository;

    @Override
    public void saveCourse(Course course) {
       courseRepository.save(course);
    }
}
