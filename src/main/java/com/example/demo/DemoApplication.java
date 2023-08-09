package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
   @GetMapping("/")
public class DemoApplication {
     public String home(){
	     return "Hi";
     }
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

