package com.nelkinda.training.microservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HelloTest {
    @LocalServerPort
    private int port;

    @Test
    void hello() throws IOException {
        final URL url = new URL("http://localhost:" + port + "/hello");
        try (InputStream inputStream = url.openStream()) {
            final String responseEntity = new String(inputStream.readAllBytes());
            assertEquals("Hello, world!", responseEntity);
        }
    }
}
