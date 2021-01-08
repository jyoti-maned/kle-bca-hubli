package org.example.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.example.shared.webdriver.WebDriverProvider;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "pretty",
        features = "src/test/resources/features/",
        glue = "org.example.steps"
)

public class TestRunner {
    @AfterClass
    public static void tearDown() {
        WebDriverProvider webDriverProvider = WebDriverProvider.getInstance();
       // webDriverProvider.tearDown();
    }
}
