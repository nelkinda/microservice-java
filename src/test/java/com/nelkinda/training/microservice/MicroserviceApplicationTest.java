package com.nelkinda.training.microservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static com.nelkinda.training.microservice.MicroserviceApplication.appContext;
import static com.nelkinda.training.microservice.MicroserviceApplication.main;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.boot.SpringApplication.exit;

@SpringBootTest
class MicroserviceApplicationTest {
    @SuppressWarnings({"PMD.UncommentedEmptyMethodBody", "PMD.JUnitTestsShouldIncludeAssert", "squid:S2699", "java:S1186"})
    @Test
    void contextLoads() {
    }

    @Test
    void mainRuns() {
        main();
        assertEquals(0, exit(appContext));
    }
}
