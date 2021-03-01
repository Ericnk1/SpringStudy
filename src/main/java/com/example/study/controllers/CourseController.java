package com.example.study.controllers;

import com.example.study.models.Course;
import com.example.study.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

//@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping
    public ResponseEntity<String> createCourse(@RequestBody Course course) {
        courseService.createCourse(course);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


    @GetMapping
    public List<Course> showCourseList(Model model) {
        return courseService.getAllCourses();
    }

    @GetMapping("/course/{id}")
    public Optional<Course> getCourseById(@PathVariable Long id){
        return courseService.findCourseById(id);
    }

    @RequestMapping("/active")
    public List<Course> ActiveCourseList(Model model) {return courseService.getActiveCourses();}


    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> updateCourse(@RequestBody Course course) {
        courseService.updateCourse(course);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setDate(new Date().toInstant());
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCourse(@PathVariable(name = "id")  Long id) {
        courseService.deleteCourseById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/full-delete/{id}")
    public ResponseEntity<String> fullDeleteCourse(@PathVariable Long id) {
        courseService.fullDeleteCourseById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/restore/{id}")
    public ResponseEntity<String> restoreCourse(@PathVariable Long id) {
        courseService.restoreCourseById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
