package io.javabrains.springbootstarter.hello;

import io.javabrains.springbootstarter.topic.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//By using a REST controller annotation you can have methods inside the class that maps to specific url requests
@RestController
public class HelloController {

    //This maps to all http-methods:
    @RequestMapping("/hello")
    public String sayHello(){
        System.out.println("Hello called!");
        return "Hello!";
    }



}
