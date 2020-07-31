package com.learning.kafka.producer.resource;

import com.learning.kafka.producer.model.Topic;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("v2")
public class TopicController {

    @GetMapping("/topics")
    public List<Topic> getAllTopics() {

        return Arrays.asList(
                new Topic(1, "ABC", "ABC description"),
                new Topic(2, "XYZ", "XYZ description"),
                new Topic(3, "BBB", "BBB description")
        );

    }
}
