package com.example.study.services;

import com.example.study.models.School;

public interface SchoolService {

    void createSchool(School school);

    boolean findSchoolByName(String name);
}
