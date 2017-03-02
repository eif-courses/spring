package com.example.realizacija;

/**
 * Created by Marius on 2/15/2017.
 */
public interface CourseService {
    Iterable<Course> displayAllCourses();
    Course getCourseById(Integer id);
}
