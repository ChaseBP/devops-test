package com.example.demo1.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo1.model.Demo1Model;
@RestController
@CrossOrigin
public class Demo1Controller {
    @PostMapping("/login")
    public String login(@RequestBody Demo1Model request) {

        if ("praveen".equals(request.getUsername()) &&
            "12345".equals(request.getPassword())) {
            return "Login successful!";
        } else {
            return "Invalid username or password!";
        }
    }
}
