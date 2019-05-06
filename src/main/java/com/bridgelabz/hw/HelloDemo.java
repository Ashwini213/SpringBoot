package com.bridgelabz.hw;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloDemo {

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello Ashwini!";
	}
}
