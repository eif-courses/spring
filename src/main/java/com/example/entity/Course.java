package com.example.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Marius on 2/15/2017.
 */
@Data
@Entity
public class Course {
    private @Id @GeneratedValue Integer id;
    private String name;

    protected Course() {}

    public Course(String name) {
        this.name = name;
    }
}
