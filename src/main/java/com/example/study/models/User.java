package com.example.study.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    private String password;

    @OneToOne(cascade = CascadeType.MERGE)
    private School school;

    @OneToMany(cascade = CascadeType.MERGE)
    private List<Course> courses;
}
