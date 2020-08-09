package com.example.study.services.implimentations;

import com.example.study.models.School;
import com.example.study.repositories.SchoolRepository;
import com.example.study.services.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;

public class SchoolServiceImpl implements SchoolService {
    @Autowired
    private SchoolRepository schoolRepository;
    @Override
    public void createSchool(School school) {

    }

    @Override
    public boolean findSchoolByName(String name) {
        return false;
    }
}
