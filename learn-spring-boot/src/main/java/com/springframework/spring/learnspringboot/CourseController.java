package com.springframework.spring.learnspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

// /Course
// Course: id, name, author
@RequestMapping("/courses")
public List<Course> retriveAllCourses(){
    return Arrays.asList(
            new Course(1,"learn AWS","springframework"),
            new Course(2,"learn DevOPS","springframework")
    );
}
}
