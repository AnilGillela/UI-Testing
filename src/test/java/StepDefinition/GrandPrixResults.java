package StepDefinition;


import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.DriverFactory;
import static org.assertj.core.api.Assertions.assertThat;

public class GrandPrixResults {

    WebDriver driver = DriverFactory.getDriver();

    @Given("I am on the BBC Sport homepage")
    public void i_am_on_the_bbc_sport_homepage() {
        driver.get("https://www.bbc.com/sport");
    }

    @When("I navigate to the Formula 1 Las Vegas Grand Prix 2023 results page")
    public void i_navigate_to_the_results_page() {
        driver.get("https://www.bbc.com/sport/formula1/2023/results");
    }
    
    @Then("I should see las Vegas Grand Pix 2023")
    public void i_should_see_in_las_Vegas_Grand_Pix_2023(String driverName) {
        WebElement tab = driver.findElement(By.xpath("//*[@id=\"main-data\"]/div/div/div/section[2]/h2/button/div/span[1]"));
        tab.click();
    }	

    @Then("I should see {string} in first place")
    public void i_should_see_in_first_place(String driverName) {
        WebElement first = driver.findElement(By.xpath("//*[@id=\"main-data\"]/div/div/div/section[2]/div/div/div[1]/div/div/table/tbody/tr[1]/td[2]/div/div/div[1]/span[1]"));
        assertThat(first.getText()).contains(driverName);
    }

    @Then("I should see {string} in second place")
    public void i_should_see_in_second_place(String driverName) {
        WebElement second = driver.findElement(By.xpath("//*[@id=\"main-data\"]/div/div/div/section[2]/div/div/div[1]/div/div/table/tbody/tr[2]/td[2]/div/div/div[1]/span[1]"));
        assertThat(second.getText()).contains(driverName);
    }

    @Then("I should see {string} in third place")
    public void i_should_see_in_third_place(String driverName) {
        WebElement third = driver.findElement(By.xpath("//*[@id=\"main-data\"]/div/div/div/section[2]/div/div/div[1]/div/div/table/tbody/tr[3]/td[2]/div/div/div[1]/span[1]"));
        assertThat(third.getText()).contains(driverName);
    }
}
