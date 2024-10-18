package fr.parisnanterre.rahimadjedomolebarry.backendjava.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController; // les imports

@RestController

public class HelloController {

    @GetMapping("/Hello")
    
    public String getHello(){

        return "Hello from API";

    }
}

// faire localhost:8080/hello  dans chrome par exemple => pour avoir  hello from API