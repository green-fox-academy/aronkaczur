package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    int counter = 0;
@RequestMapping(value = "/adadad")
public greeting restController(){
        greeting greeting = new greeting(counter," Hello ,World");
        counter++;
        return greeting;
    }

}
