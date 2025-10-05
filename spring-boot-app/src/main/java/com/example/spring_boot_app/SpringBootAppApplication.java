package com.example.spring_boot_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppApplication.class, args);
	}

}

@SpringBootApplication
@RestController
public class SpringBootAppApplication {

   @RequestMapping("/")
   public String home() {
       return "Hello Kubernetes!";
   }

   public static void main(String[] args) {
       SpringApplication.run(SpringBootAppApplication.class, args);
   }

}