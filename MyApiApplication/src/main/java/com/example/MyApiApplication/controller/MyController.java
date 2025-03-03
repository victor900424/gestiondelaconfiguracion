package com.example.MyApiApplication.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class MyController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello, World!";
    }

    @GetMapping("/bye")
    public String sayHello(){
        return "Good Bye!";
    }
}
