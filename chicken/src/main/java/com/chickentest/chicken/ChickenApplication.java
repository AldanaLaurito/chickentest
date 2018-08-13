package com.chickentest.chicken;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ChickenApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChickenApplication.class, args);
    }
}
