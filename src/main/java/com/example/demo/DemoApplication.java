package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
public class DemoApplication {

	@RequestMapping("/")
//	@ResponseBody
	String home() {
		return "Hello World!";
	}

	@GetMapping("/h/{name}")
	public String getName(@PathVariable String name) {
		return "Hello " + name ;
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
