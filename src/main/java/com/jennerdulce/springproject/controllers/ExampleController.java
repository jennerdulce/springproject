package com.jennerdulce.springproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class ExampleController {

    @GetMapping("/")
    public String homePage(){
        return "homepage";
    }

    @GetMapping("/hello-world")
    public String helloWorld(){
        System.out.println("Hello World");
        return "helloWorld/hello-world";
    }
//    @PostMapping
//    @PutMapping
//    @DeleteMapping
}
