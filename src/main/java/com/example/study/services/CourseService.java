package com.example.study.services;

import com.example.study.models.Course;

public interface CourseService {

    void createCourse(Course course);

    boolean findCourseByName(String name);
}
