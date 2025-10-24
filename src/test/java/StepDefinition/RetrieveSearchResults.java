package StepDefinition;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.DriverFactory;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class RetrieveSearchResults {

    WebDriver driver = DriverFactory.getDriver();

    @When("I search for {string}")
    public void i_search_for(String term) throws InterruptedException {
        driver.findElement(By.cssSelector("[data-testid='search-icon-button']")).click();
        Thread.sleep(2000);
        WebElement searchBox = driver.findElement(By.cssSelector("input[type='search']"));
        searchBox.sendKeys("Sport in 2023");
        searchBox.submit();
        Thread.sleep(5000); // Wait for search results
    }

    @Then("at least {int} relevant results should be displayed")
    public void at_least_relevant_results_should_be_displayed(int minCount) {
        List<WebElement> results = driver.findElements(By.cssSelector("[data-testid='search-results'] article"));
        System.out.println("Number of results found: " + results.size());
        assertThat(results.size()).isGreaterThanOrEqualTo(minCount);
    }
}
