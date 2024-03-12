package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.CartPage;
import pageObjects.LoginPage;
import pageObjects.ProductPageFiltersAZ;
import pageObjects.ProductPageFiltersZA;

import java.util.Arrays;

public class ProductFilteringStepDefinition {
    public WebDriver driver;
    public LoginPage lp;
    public ProductPageFiltersAZ az;
    public ProductPageFiltersZA za;
    public CartPage cp;

    @Given ("the user is on the Product list page ")
    public void navigateToThePLP(String URL) {driver.get(URL);
    }

    @When ("the user selects specific filter from the filter options")
        public void userSelectsSpecificFilter() {
        WebElement filterAtoZ =
                driver. findElement(By.xpath("//*[@id='header_container']/div[2]/div/span/select")); }


    @Then("the user should see the filtered products")
        public void userSeeFilteredProducts() {
            driver.findElement(By.xpath("//*[@id='header_container']/div[2]/div/span/select")).isEnabled();
    }
}





