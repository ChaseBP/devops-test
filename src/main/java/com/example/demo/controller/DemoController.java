package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class DemoController {
	@GetMapping("/")
	public String studentGreeting() {
		return "Hello Students, greetings from controller class";
    }
}
