package com.test.service6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Service6Application {

    public static void main(String[] args) {
        SpringApplication.run(Service6Application.class, args);
    }

}
