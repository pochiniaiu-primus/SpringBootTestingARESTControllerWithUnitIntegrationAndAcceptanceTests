package com.serhiihonchar.testingrestcontroller.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcome(String name) {
        return String.format("Welcome %s!", name);
    }
}
