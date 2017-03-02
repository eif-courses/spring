package com.example.realizacija;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Marius on 2/15/2017.
 */
@Service
public class CourseServiceImpl implements CourseService {

    private CourseRepository courseRepository;

    @Autowired
    public void setCourseRepository(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }
    @Override
    public Iterable<Course> displayAllCourses() {
        return courseRepository.findAll();
    }
    @Override
    public Course getCourseById(Integer id) {
        return courseRepository.findOne(id);
    }

}
