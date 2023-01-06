package com.workshop.Rda.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class GreetingsController {

    //ResponseEntity represents the whole HTTP response: status code,
    // headers, and body. As a result, we can use it to fully configure the HTTP response.

    @GetMapping("/hello")
    public ResponseEntity<String> sayHello(){
     return ResponseEntity.ok("Hello");
    }

    @GetMapping("/bye")
    public ResponseEntity<String> sayGoodBye(){
        return ResponseEntity.ok("byebye");
    }

}
