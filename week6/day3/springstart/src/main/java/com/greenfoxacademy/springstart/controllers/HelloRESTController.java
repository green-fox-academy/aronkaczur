package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {
   AtomicLong counter = new AtomicLong();
    @RequestMapping(value = "/greeting")


        public Object Greeting(@RequestParam String name){
           return new greeting(counter.incrementAndGet(), "Hello, " + name + "!");

        }
}
