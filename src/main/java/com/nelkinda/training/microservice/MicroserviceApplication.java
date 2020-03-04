package com.nelkinda.training.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SuppressWarnings("PMD.UseUtilityClass")
@SpringBootApplication
public class MicroserviceApplication {
    static ApplicationContext appContext;

    public static void main(final String... args) {
        appContext = SpringApplication.run(MicroserviceApplication.class, args);
    }
}
