package com.learning.controllers;

import com.learning.kafka.producer.model.Topic;
import com.learning.services.TopicsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("v2")
public class TopicController {

    @Autowired
    TopicsService topicsService;

    @GetMapping("/topics")
    public List<Topic> getAllTopics() {
        return topicsService.getAllTopics();
    }

    @GetMapping("/topics/{id}")
    public Topic getSelectedTopic(@PathVariable int id) {
        return topicsService.getSingleTopic(id);
    }

    @PostMapping(path = "/topics", consumes = "application/json", produces = "application/json")
    public List<Topic> addProduct(@RequestBody Topic topic){
        return topicsService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topicsV2")
    public List<Topic> addProductV2(@RequestBody Topic topic){
        return topicsService.addTopic(topic);
    }
}

