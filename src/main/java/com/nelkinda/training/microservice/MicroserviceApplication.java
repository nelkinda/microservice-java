package com.nelkinda.training.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SuppressWarnings("PMD.UseUtilityClass")
@SpringBootApplication
public class MicroserviceApplication {
    public static void main(final String... args) {
        SpringApplication.run(MicroserviceApplication.class, args);
    }
}
