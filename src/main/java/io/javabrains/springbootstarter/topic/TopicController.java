package io.javabrains.springbootstarter.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

//Restcontroller: Whatever you return will be given as json-format
@RestController
public class TopicController {

    //When spring creates an instance of this class it will look at all its member variables
    //and see if any of them has a dependency to topic service. It will thereafter INJECT these
    //dependencies where they are needed. This dependency is declared by using Aurowired annotation:
    //Take instance of TopicService (created at program start) and inject it were it is needed:
    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){

        //create topic objects "on the fly":
        return topicService.getAlltTopics();
    }

    //The curly braces tells spring that "id" is a variable:
    @RequestMapping("/topics/{id}")
    public Topic getTopic(String id){
        return topicService.getTopic(id);
    }




}
