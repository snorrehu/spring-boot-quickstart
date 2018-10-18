package io.javabrains.springbootstarter.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        return topicService.getAllTopics();
    }

    //Map POST request (GET is default!), must specify!
    //"Map this method on any POST request on URI /topics"
    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    //Tell spring MVC that your request payload is going to contain a json representation of
    //this topic instance. Take that request body and convert it to a topic instance and pass it to the
    // addTopic method:
    public void createTopic(@RequestBody Topic topic){
        //Get post body, convert it to topic instance and add it to the list of topics:
        topicService.addTopic(topic);
    }

    //The curly braces tells spring that "id" is a variable:
    @RequestMapping("/topics/{id}")
    //@Pathvariable tells spring that the variable comes from the path, as denoted above:
    public Topic readTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id){
        topicService.updateTopic(id,topic);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteTopic(@PathVariable String id){
        topicService.deleteTopic(id);
    }


}
