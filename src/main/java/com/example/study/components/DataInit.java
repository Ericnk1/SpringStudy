package com.example.study.components;

import com.example.study.models.Authority;
import com.example.study.models.Course;
import com.example.study.models.School;
import com.example.study.models.User;
import com.example.study.services.AuthorityService;
import com.example.study.services.CourseService;
import com.example.study.services.SchoolService;
import com.example.study.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.example.study.utils.Constants.Security.*;

//@Component
/*public class DataInit {
    @Autowired
    private UserService userService;

    @Autowired
    private SchoolService schoolService;

    @Autowired
    private CourseService courseService;

    @Autowired
    private AuthorityService authorityService;

    @PostConstruct
    public void initData() {
        initSchoolData();
        initCourseData();
        initAuthorityData();
        initUserData();
    }


    // PRIVATE METHODS //
    private void initUserData() {
        Optional<Authority> optionalAuthority = authorityService.findAuthorityByName(AUTHORITY_ADMIN);
        Optional<School> optionalSchool = schoolService.findSchoolByName("Tallinn International school");
        List<Course> courseList = courseService.getAllCourses();

        if (optionalAuthority.isPresent() && optionalSchool.isPresent() && !courseList.isEmpty()) {
            User user = new User();
            user.setUsername("admin@study.com");
            user.setPassword("123456");
            user.setSchool(optionalSchool.get());
            user.setAuthority(optionalAuthority.get());
            user.setCourses(courseList);
            user.setActive(true);

            if (!userService.findUserByUsername(user.getUsername()).isPresent()) {
                userService.createUser(user);
            }
        }
    }

    private void initAuthorityData() {
        Authority authorityAdmin = new Authority();
        authorityAdmin.setName(AUTHORITY_ADMIN);
        createAuthority(authorityAdmin);

        Authority authorityTeacher = new Authority();
        authorityTeacher.setName(AUTHORITY_TEACHER);
        createAuthority(authorityTeacher);

        Authority authorityStudent = new Authority();
        authorityStudent.setName(AUTHORITY_STUDENT);
        createAuthority(authorityStudent);

    }

    private void initSchoolData() {
        School school = new School();
        school.setName("Tallinn International school");
        school.setCity("Tallinn");
        school.setPhone("94856735");
        school.setActive(true);

        if (!schoolService.findSchoolByName(school.getName()).isPresent()) {
            schoolService.createSchool(school);
        }
    }

    private void initCourseData(){
        Course course = new Course();
        course.setName("Angular for beginners");
        course.setDurationHours(06.00);
        course.setActive(true);
        if (!courseService.findCourseByName(course.getName()).isPresent()){
            courseService.createCourse(course);
        }
    }

    private void createAuthority(Authority authority) {
        if (!authorityService.findAuthorityByName(authority.getName()).isPresent()) {
            authorityService.createAuthority(authority);
        }
    }
}*/
