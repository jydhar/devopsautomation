package com.example.jenkinsdemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@RestController
@RequestMapping("hello/v1/api")
public class HellowWorldController {

    @ResponseStatus(value = HttpStatus.FOUND)
    @GetMapping(value = "/message", produces = MediaType.APPLICATION_JSON_VALUE)
    public String message(){
        return "welcome to javatechie";
    }
}
