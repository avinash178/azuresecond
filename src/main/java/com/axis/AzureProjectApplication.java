package com.axis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzureProjectApplication.class, args);
	}
	
	@GetMapping("/hi")
	public String get() {
		return "it is working fine";
	}
	
	

}
