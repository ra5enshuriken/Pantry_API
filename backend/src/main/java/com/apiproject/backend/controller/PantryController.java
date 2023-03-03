package com.apiproject.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PantryController {

    @GetMapping("/")
    public String index(){
        return "Hello";
    }
}
