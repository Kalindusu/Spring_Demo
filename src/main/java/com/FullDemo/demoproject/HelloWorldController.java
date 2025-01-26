package com.FullDemo.demoproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping(path = "/hello")
    public String HelloWorld(){
        return "Hello World first proggaraming";
    }
}
