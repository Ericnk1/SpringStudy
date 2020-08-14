package com.example.study.repositories;

import com.example.study.models.Course;
import com.example.study.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
