package com.example.study.models;

import com.example.study.utils.validation.ValidSchool;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
//@ValidSchool
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String city;
    private String phone;
    private boolean isActive;

}
