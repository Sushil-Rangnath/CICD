package com.spring.cicd.demoFor.CICD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoForCicdApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoForCicdApplication.class, args);
	}


	@GetMapping("/")
	public String getMessage(){

		return "Welcome to AWS with CI/CD !!";


	}


}
