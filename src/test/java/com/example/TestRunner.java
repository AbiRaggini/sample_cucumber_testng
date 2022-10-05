package com.example;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty",
                "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json"
        },
        features = {"/Users/menakagandhis/eclipse/sample-cucumber-testng/src/test/resources/features/FBSignup.feature"},
        glue = {"com.example.StepDefinitions"},
        tags = "@regression"
)

public class TestRunner extends AbstractTestNGCucumberTests {


}
