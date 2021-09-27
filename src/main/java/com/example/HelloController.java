package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String greeting() {
		return "Greetings from Spring Boot Demo!";
	}

	@GetMapping("/hello/{name}")
	public HelloBean hello(@PathVariable("name") String name) {
		return new HelloBean("hello " + name);
	}

}
