package com.learning.controllers;

import com.learning.model.Course;
import com.learning.services.CourseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController

public class CourseController {

    final Logger logger = LoggerFactory.getLogger(CourseController.class);

    @Autowired
    CourseService courseService;

    @RequestMapping(method = RequestMethod.GET, value = "/defaultcourse")
    public List<Course> getDefaultCourses() {
        String value = "KISHORE";
        logger.trace("doStuff needed more information - {}", value);
        logger.debug("doStuff needed to debug - {}", value);
        logger.info("doStuff took input - {}", value);
        logger.warn("doStuff needed to warn - {}", value);
        logger.error("doStuff encountered an error with value - {}", value);
        List<Course> courses = courseService.getCourses();
        return courses;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/gethierarchical")
    public HashMap<String, Object> getHierarchical() {
        HashMap<String, Object> courses = courseService.getHierarchicalCourses();
        return courses;
    }


}
