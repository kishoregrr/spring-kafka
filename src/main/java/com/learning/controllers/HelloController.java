package com.learning.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v2")
public class HelloController {

    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable("name") final String name){
        return "hi "+name;
    }

}
