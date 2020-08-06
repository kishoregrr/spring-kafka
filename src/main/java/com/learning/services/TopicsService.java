package com.learning.services;

import com.learning.kafka.producer.model.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicsService {

    private List<Topic> topics = Arrays.asList(
            new Topic(1, "ABC", "ABC description"),
            new Topic(2, "XYZ", "XYZ description"),
            new Topic(3, "BBB", "BBB description")
    );

    private List<Topic> topics2 = new ArrayList<>();

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getSingleTopic(int id) {
        return topics.stream().filter(t -> t.getId() == id).findFirst().get();
    }

    public List<Topic> addTopic(Topic topic){
        topics2.add(topic);
        return topics2;
    }

}
