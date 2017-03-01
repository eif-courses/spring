package com.example.controller;

import com.example.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Marius on 2/15/2017.
 */
@Controller
public class CoursesController {

    private CourseService courseService;

    @Autowired
    public void setCourseService(CourseService courseService) {
        this.courseService = courseService;
    }

    @RequestMapping("/")
    public String list(Model model){
        model.addAttribute("courses", courseService.displayAllCourses());
        return "courses";
    }
    @RequestMapping("course/{id}")
    public String displayCourse(@PathVariable Integer id, Model model){
        model.addAttribute("course", courseService.getCourseById(id));
        return "details";
    }

}
