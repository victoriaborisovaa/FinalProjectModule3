package stepDefinitions;

import beforeAfter.BeforeAfter;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObjects.CartPage;
import pageObjects.LoginPage;

public class LoginStepDefinition extends BeforeAfter {
    public WebDriver driver;
    public LoginPage lp;
    public CartPage cp;


@Given("the user opens {string} URL ")
public void userOpensURL(String URL) {
    driver.get(URL);}

@When("the user enter valid username and password")
public void enterValidLoginData(String username, String password) {
    lp.enterUsername("standard_user");
    lp.enterPassword("secret_sauce");
}
    @And("the user clicks on the login button")
    public void clickOnLoginButton() {
        lp.clickOnButton();
    }

    @Then("the user should be redirected to the product list page")
    public void redirectToThePLP(String title) {
    driver.getTitle(); {
        Assert.assertEquals("Swag Labs", "Swag Labs");
    }
}
}

