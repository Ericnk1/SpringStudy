package com.example.study.models;

import lombok.Data;

import javax.persistence.*;
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

    @OneToMany(mappedBy = "user", fetch = LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Course> course;

    private boolean isActive;
}
