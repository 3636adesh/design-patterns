package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SagPatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SagPatternsApplication.class, args);
	}

	@GetMapping
	public String home() {
		return "<h2>Welcome to the Sag Patterns Application!<h2>";
	}

}
