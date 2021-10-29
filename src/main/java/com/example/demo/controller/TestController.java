package com.example.demo.controller;


import com.example.demo.client.HelloClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private HelloClient helloClient;

    @GetMapping("/greeting")
    public String greeting() {
        return helloClient.discovery();
    }
}
