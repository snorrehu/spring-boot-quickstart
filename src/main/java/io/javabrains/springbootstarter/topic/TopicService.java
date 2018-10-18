package io.javabrains.springbootstarter.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

//Stereotype annotation @Service
@Service
public class TopicService {

    private List<Topic> topics = Arrays.asList(
                new Topic("spring","Spring Framework","Spring Framework Description"),
                new Topic("java","Java Framework","Java Framework Description"),
                new Topic("javascript","Javascript Framework","Javascript Framework Description")
    );

    public List<Topic> getAlltTopics(){
        return topics;
    }

    public Topic getTopic(String id){
        return topics.stream().filter(t -> t .getId().equals(id)).findFirst().get();
    }
}
