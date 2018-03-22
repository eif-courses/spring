package com.example.repository;

import com.example.entity.Course;
import com.example.entity.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by Marius on 2/15/2017.
 */

public interface CourseRepository extends CrudRepository<Course, Integer> {

}
