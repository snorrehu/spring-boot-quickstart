package io.javabrains.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Tell app that this is starting point
@SpringBootApplication
public class CourseApiApp {


    public static void main(String[] args){
        SpringApplication.run(CourseApiApp.class, args);
    }

}
