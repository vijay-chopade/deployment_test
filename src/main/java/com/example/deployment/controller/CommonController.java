package com.example.deployment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class CommonController {

    public static String greet(String name) {
        return "Hello, " + name;
    }

    @GetMapping
    public String test(){
        return "Test Pass....";
    }
}
