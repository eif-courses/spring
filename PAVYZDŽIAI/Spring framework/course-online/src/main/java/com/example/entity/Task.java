package com.example.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Marius on 2/16/2017.
 */
@Data
@Entity
public class Task {
    private @Id @GeneratedValue Integer id;
    private String description;
    protected Task() {}
    public Task(String description) {
        this.description = description;
    }
}
