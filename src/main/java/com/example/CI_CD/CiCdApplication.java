package com.example.CI_CD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CiCdApplication {

	@GetMapping("/hello")
	public String getMessage(){
		return "Hello_World";
	}
	public static void main(String[] args) {
		SpringApplication.run(CiCdApplication.class, args);
	}

}
