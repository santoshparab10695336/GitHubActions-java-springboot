package com.javatechie.azure.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureDemoApplication {

	@GetMapping("/message")
	public String message(){
		return "Hello Santosh Parab. Welcome to LTIMindtree. Good to see you here. Have great future ahead!!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringAzureDemoApplication.class, args);
	}

}
