package com.task.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/java/hello-world")
public class HelloWorldController {

	@GetMapping
	public String helloWorld() {
		return "Hello World";
	}
}
