package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

    WebDriver driver;
    By firstName = By.xpath("//*[@id=\"first-name\"]");
    By lastName = By.xpath("//*[@id=\"last-name\"]");
    By postalCode = By.xpath("//*[@id=\"postal-code\"]");
    By continueButton = By.xpath("//*[@id=\"continue\"]");
    By totalSum = By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]");
    By finishButton = By.xpath("//*[@id=\"finish\"]");
    By completeOrder = By.xpath("//*[@id=\"checkout_complete_container\"]/h2");


    public CheckoutPage (WebDriver driver) {
        this.driver = driver;
    }

    public void enterFirstName() {
        driver.findElement(firstName).sendKeys("Ivan");

    }
    public void enterLastName() {

        driver.findElement(lastName).sendKeys("Georgiev");

    }
    public void enterPostalCode() {

        driver.findElement(postalCode).sendKeys("1000");

    }
    public void pressContinueButton() {
        driver.findElement(continueButton).click();

    }
    public void finishButtonClick() {
        driver.findElement(finishButton).click();

    }

    public void completeOrderText(){
        driver.findElement(completeOrder).isDisplayed();

    }
    public String totalSum(){

        return driver.findElement(totalSum).getText();

    }

    public String completeOrderFinal(){
        driver.findElement(completeOrder).getText();

        return null;
    }
}
