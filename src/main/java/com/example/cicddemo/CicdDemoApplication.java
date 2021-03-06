package com.example.cicddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdDemoApplication {

    @GetMapping
    public String getMessage() {
        return "Hello CICD Integration" ;
    }
    @GetMapping("/hell")
    public String getMessage1() {
        return "Hello CICD Integration" ;
    }

    public static void main(String[] args) {
        SpringApplication.run(CicdDemoApplication.class, args);
    }

}
