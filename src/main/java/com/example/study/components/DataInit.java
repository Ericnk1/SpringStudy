package com.example.study.components;

import com.example.study.models.Course;
import com.example.study.models.School;
import com.example.study.models.User;
import com.example.study.services.CourseService;
import com.example.study.services.SchoolService;
import com.example.study.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class DataInit {
    @Autowired
    private UserService userService;

    @Autowired
    private SchoolService schoolService;

    @Autowired
    private CourseService courseService;

    @PostConstruct
    public void initData() {
        initSchoolData();
        initCourseData();
        initUserData();
    }

    // PRIVATE METHODS //
    private void initUserData() {
        schoolService.findSchoolByName("Tallinn International school").ifPresent(school -> {
            User user = new User();
            user.setUsername("vinodjohn@sda.com");
            user.setPassword("123456");
            user.setSchool(school);

            if (!userService.findUserByUsername(user.getUsername()).isPresent()) {
                userService.createUser(user);
            }
        });
    }

    private void initSchoolData() {
        School school = new School();
        school.setName("Tallinn International school");
        school.setCity("Tallinn");
        school.setPhone("94856735");

        if (!schoolService.findSchoolByName(school.getName()).isPresent()) {
            schoolService.createSchool(school);
        }
    }

    private void initCourseData(){
        Course course = new Course();
        course.setName("Python from scratch");
        course.setDurationHours(06.00);
        if (!courseService.findCourseByName(course.getName()).isPresent()){
            courseService.createCourse(course);
        }
    }
}
