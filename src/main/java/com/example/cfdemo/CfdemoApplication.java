package com.example.cfdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class CfdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CfdemoApplication.class, args);
	}
	
	@RestController
	public static class CFController{
		
		@GetMapping(value="/greet/{name}")
		public String elements(@PathVariable String name){
			return "Hello "+name+" from CloudFoundry";
		}
	}
}
