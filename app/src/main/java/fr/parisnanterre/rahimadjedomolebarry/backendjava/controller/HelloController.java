package fr.parisnanterre.rahimadjedomolebarry.backendjava.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController; // les imports

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;


@RestController
@Tag(name = "Hello Controller")
public class HelloController {

    @GetMapping("/Hello")

    @Operation(
            summary = "Returns a welcome message",
            description = "This endpoint returns a simple message saying 'Hello from API'"
    )
    
    public String getHello(){
        return "Hello from API";

    }
}

