package pageObjects;

import beforeAfter.BeforeAfter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.Comparator;

public class ProductPageFiltersZA extends BeforeAfter {

    String productName;
    WebDriver driver;
    By filterButton = By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select");

    public ProductPageFiltersZA(String productName) {
        this.productName = productName;
    }

    public static void main(String[] args) {


        ProductPageFiltersZA[] productPages = {
                new ProductPageFiltersZA("Sauce Labs Backpack"),
                new ProductPageFiltersZA("Sauce Labs Bike Light"),
                new ProductPageFiltersZA("Sauce Labs Bold T-shirt"),
                new ProductPageFiltersZA("Sauce Labs Fleece Jacket"),
                new ProductPageFiltersZA("Sauce Labs Onesie"),
                new ProductPageFiltersZA("Test.allTheThings() T-Shirt (Red)")
        };

        Arrays.sort(productPages, Comparator.comparing(ProductPageFiltersZA::getProductName).reversed());

        System.out.println("Products sorted by name Z to A:");
        for (ProductPageFiltersZA productPage : productPages) {
            System.out.println(productPage.productName);
        }

    }

    public String getProductName() {
        return productName;
    }
}
