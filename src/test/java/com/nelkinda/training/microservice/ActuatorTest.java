package com.nelkinda.training.microservice;

import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.skyscreamer.jsonassert.JSONAssert.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ActuatorTest {
    @LocalServerPort
    private int port;

    private static String read(final URL url) throws IOException {
        try (InputStream inputStream = url.openStream()) {
            return new String(inputStream.readAllBytes(), UTF_8);
        }
    }

    @Test
    void health() throws IOException, JSONException {
        final URL url = new URL("http://localhost:" + port + "/actuator/health");
        final URL expectedUrl = getClass().getResource("ActuatorTest/expectedHealth.json");
        final String actual = read(url);
        final String expected = read(expectedUrl);
        assertEquals(expected, actual, JSONCompareMode.LENIENT);
    }

    @Test
    void info() throws IOException, JSONException {
        final URL url = new URL("http://localhost:" + port + "/actuator/info");
        final URL expectedUrl = getClass().getResource("ActuatorTest/expectedInfo.json");
        final String actual = read(url);
        final String expected = read(expectedUrl);
        assertEquals(expected, actual, JSONCompareMode.LENIENT);
    }
}
