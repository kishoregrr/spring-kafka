package com.learning.services;

import com.learning.helpers.CourseConfiguration;
import com.learning.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseConfiguration courseConfiguration;

    @Value("${default.course.name}")
    private String cName;

    @Value("${default.course.chapterCount}")
    private int chaptersCount;

    public List<Course> getCourses() {
        List<Course> list = new ArrayList<Course>();
        list.add(new Course(chaptersCount, cName));
        list.add(new Course(101, "ElasticSearch"));
        return list;
    }

    public HashMap<String, Object> getHierarchicalCourses() {
        HashMap<String, Object> map = new HashMap<String, Object>();

        map.put("name", courseConfiguration.getName());
        map.put("chapterCount", courseConfiguration.getChapterCount());
        map.put("rating", courseConfiguration.getRating());
        map.put("author", courseConfiguration.getAuthor());
        return map;
    }
}
