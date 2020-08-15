package com.example.study.services;

import com.example.study.models.Course;
import com.example.study.models.School;

import java.util.List;
import java.util.Optional;

public interface CourseService {

    /**
     * To create a new course
     *
     * @param course course
     */
    void createCourse(Course course);

    /**
     * To get all the course
     *
     * @return list of course
     */
    List<Course> getAllCourses();

    /**
     * To get list of active courses
     *
     * @return list of courses
     */
    List<Course> getActiveCourses();

    /**
     * To find course by name
     *
     * @param name course name
     * @return optional of course
     */
    Optional<Course> findCourseByName(String name);

    /**
     * To find course by id
     *
     * @param id Course id
     * @return optional of course
     */
    Optional<Course> findCourseById(Long id);

    /**
     * To update an existing course
     *
     * @param course course
     */
    void updateCourse(Course course);

    /**
     * To delete course by id
     *
     * @param id course id
     */
    void deleteCourseById(Long id);

    /**
     * To delete course from database completely by id
     *
     * @param id course id
     */
    void fullDeleteCourseById(Long id);

    /**
     * To restore course by id
     *
     * @param id course id
     */
    void restoreCourseById(Long id);
}
