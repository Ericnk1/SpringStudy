package com.example.study.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private Double durationHours;
    private boolean isActive;

    @JsonIgnore
    @ManyToOne
    private User user;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course )) return false;
        return id != null && id.equals(((Course) o).getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

}
