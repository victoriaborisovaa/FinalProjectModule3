package stepDefinitions;

import beforeAfter.BeforeAfter;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.*;

public class CompletingOrderStepDefinition extends BeforeAfter {
    public WebDriver driver;
    public LoginPage lp;
    public CartPage cp;
    public ProductPageFiltersAZ az;
    public ProductPageFiltersZA za;
    public CheckoutPage chp;

    @Given("the user is on the product list page")
    public void userOpensURL(String URL) {
        driver.get(URL);}
    @When("user clicks on add to cart button")
    public void clickOnAddToCart () {
        cp.addTShirt();
        cp.addBikeLight();
        cp.addBabyOnesie();
    }
    @And ("the user should see a confirmation message that the product has been added to the cart")
    public void confirmationMessageDisplayed(){}

    @Then("the user should see the updated cart icon with the item count")
        public void userCheckCountInTheCart() {
            cp.checkCart();
        }
        @When("the user clicks on the cart icon to view the cart")
        public void clickCartButton() {
            cp.cartBtn();
            cp.checkout();
        }
        @Then("the user should see the added product in the cart with the correct details")
        public void checkCart() {
        cp.checkCart(); }

    @When("the user click on the Checkout button")
    public void clickOnCheckoutBtn() {
        cp.checkout();
     }
     @Then("the user should be directed to the checkout page")
    public void redirectToCheckoutPage() {
     }
     @And("the user should see the added product in the order summary")
    public void seeSummary() {
        cp.getCartItemCount();
     }
     @When("the user provides valid shipping information")
    public void enterShippingInfo() {
        chp.enterFirstName();
        chp.enterLastName();
        chp.enterPostalCode();
     }
     @And("selects a valid payment method")
    public void selectPaymentMethod() {
     }
     @And("clicks the Place Order button")
    public void clickPlaceOrderBtn () {
        chp.finishButtonClick();
     }
     @Then("the user should see an order confirmation message")

    public void seeConfirmationMessage() {
        chp.completeOrderFinal();
        driver.quit();
     }






}
