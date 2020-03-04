package com.nelkinda.training.microservice;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(
        features = "src/test/resources/features",
        strict = true
)
@RunWith(Cucumber.class)
public class RunCukesOldTest {
}
