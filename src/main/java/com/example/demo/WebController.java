package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    @GetMapping("/")
    public String home() {
        return "<h1>Welcome to My Simple Java Web App!05</h1>";
    }
}
