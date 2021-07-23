package com.example.eurekaservice04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Eurekaservice2Application {

    public static void main(String[] args) {
        SpringApplication.run(Eurekaservice2Application.class, args);
    }

}
