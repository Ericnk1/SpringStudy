package com.example.study.models;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.FetchType.LAZY;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    private String password;

    @ManyToOne(cascade = CascadeType.MERGE)
    private School school;

    @OneToOne(cascade = CascadeType.MERGE)
    private Authority authority;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    //@JoinColumn("user_id")
    private List<Course> courses = new ArrayList<>();

    public void addCourse(Course course) {
        courses.add(course);
        course.setUser(this);
    }

    public void removeCourse(Course course) {
        courses.remove(course);
        course.setUser(null);
    }

    private boolean isActive;
}
