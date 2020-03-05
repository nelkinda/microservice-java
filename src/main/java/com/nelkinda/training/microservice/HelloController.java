package com.nelkinda.training.microservice;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping(
            value = "/hello",
            produces = MediaType.TEXT_PLAIN_VALUE
    )
    public ResponseEntity<String> hello() {
        return new ResponseEntity<>("Hello, world!", HttpStatus.OK);
    }
}
