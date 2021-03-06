package com.example.study.controllers;

import com.example.study.models.School;
import com.example.study.services.SchoolService;
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

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/school")
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    @PostMapping
    public ResponseEntity<String> createSchool(@RequestBody School school) {
            schoolService.createSchool(school);
            return new ResponseEntity<>(HttpStatus.CREATED);
    }


    @GetMapping
    public List<School> showSchoolList(Model model) {
        return schoolService.getAllSchools();
    }

    @GetMapping("/school/{id}")
    public Optional<School> getEmployee(@PathVariable Long id){
        return schoolService.findSchoolById(id);
    }

    @RequestMapping("/active")
    public List<School> activeSchoolsList(Model model) {return schoolService.getActiveSchools();}


    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> updateSchool(@RequestBody School school) {
            schoolService.updateSchool(school);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setDate(new Date().toInstant());
            return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteSchool(@PathVariable Long id) {
        schoolService.deleteSchoolById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> fullDeleteSchool(@PathVariable Long id) {
        schoolService.fullDeleteSchoolById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/restore/{id}")
    public ResponseEntity<String> restoreSchool(@PathVariable Long id) {
        schoolService.restoreSchoolById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


    }

