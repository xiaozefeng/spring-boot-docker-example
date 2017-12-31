package com.gz.springbootdockerexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaozefeng
 */
@SpringBootApplication
@RestController
public class SpringBootDockerExampleApplication {

    @GetMapping("/")
    public String sayHello() {
        return "Hello Docker!";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDockerExampleApplication.class, args);
    }
}
