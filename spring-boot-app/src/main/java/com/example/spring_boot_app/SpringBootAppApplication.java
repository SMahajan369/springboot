package com.example.spring_boot_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootAppApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SpringBootAppApplication.class);
        // Force server port to 9090
        app.setDefaultProperties(Map.of("server.port", "9090"));
        app.run(args);
    }

    @RequestMapping("/")
    public String home() {
        return "Hello Kubernetes!";
    }
}
