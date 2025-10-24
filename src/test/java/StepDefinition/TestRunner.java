package StepDefinition;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.java.en.Given;
import cucumber.api.java.en.Given;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features",
        glue = {"stepdefinition", "utils"},
        plugin = {"pretty", "html:reports/cucumber-report.html"},
        monochrome = true
)
public class TestRunner {
}
