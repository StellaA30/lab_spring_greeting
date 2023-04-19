package com.example.lab_spring_greeting.controllers;

import com.example.lab_spring_greeting.models.Celebration;
import com.example.lab_spring_greeting.models.Greeting;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/greeting")
public class GreetingController {

//    Q1: create a method which accepts a GET request and returns a string saying "Good afternoon Colin!"
//    @GetMapping
//    public String greeting(){
//        return "Good afternoon Colin!";
//    }

//  Q2: Refactor your controller to use your POJO instead of a string

    //METHOD 1
//    @GetMapping
//    public Greeting greet(){
//        return new Greeting("Colin", "afternoon");
//    }
    //METHOD 2 using ResponseEntity
//    @GetMapping
//    public ResponseEntity<Greeting> greetings(){
//        Greeting greeting = new Greeting("Stella", "evening");
//        return new ResponseEntity<>(greeting, HttpStatus.OK);
//    }


    // Extension Q1: Use a @RequestParam to get the value for timeOfDay from the url

    @GetMapping
    public Greeting greet(@RequestParam String timeOfDay){
        return new Greeting("Colin", timeOfDay);
    }

    //Extension Q2:Add a second method to the controller to accept a GET request to http://localhost:8080/greeting/summer. HINT: research adding a value argument to the @GetMapping annotation
    //Have the route return a Celebration object with the message "Happy summer solstice!"
    @GetMapping(value = "/summer")
    public Celebration celebrate(){
        return new Celebration("Happy summer solstice!");
    }







}
