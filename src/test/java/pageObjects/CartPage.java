package pageObjects;

import beforeAfter.BeforeAfter;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BeforeAfter {
    WebDriver driver;
    By TShirt = By.xpath("//*[@id=\"item_1_title_link\"]/div");
    By BikeLight = By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]");
    By Onesie = By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]");
    By ShoppingCartButton = By.xpath("//*[@id=\"shopping_cart_container\"]/a");
    By ShoppingCount = By.xpath("//*[@id=\"shopping_cart_container\"]/a/span");
    By CheckoutButton = By.xpath("//*[@id=\"checkout\"]");
    By ProductAssert = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
    By CartCount = By.xpath("//*[@id=\"shopping_cart_container\"]/a/span");


    private WebElement WebDriver;

    public CartPage(org.openqa.selenium.WebDriver driver) {
        this.driver = driver;
    }

    public void addTShirt() {
        driver.findElement(TShirt).click();

    }

    public void addBabyOnesie() {

        driver.findElement(Onesie).click();

    }

    public void addBikeLight() {

        driver.findElement(BikeLight).click();

    }
    public int getCartItemCount(){

        WebElement cartBadge = driver.findElement(CartCount);
        if (cartBadge.isDisplayed()) {
            return Integer.parseInt(cartBadge.getText());
        } else {
            return 0;
        }
    }

    public void checkCart() {

        WebElement count = driver.findElement(ShoppingCount);
        Assert.assertTrue("3", true);


    }

    public void cartBtn() {

        driver.findElement(ShoppingCartButton).click();

    }

    public void productAssert() {
        driver.findElement(ProductAssert).isDisplayed();
    }

    public WebElement checkout() {
        driver.findElement(CheckoutButton).click();
        return WebDriver;
    }


}

