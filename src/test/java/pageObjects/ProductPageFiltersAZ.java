package pageObjects;

import beforeAfter.BeforeAfter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.Comparator;

public class ProductPageFiltersAZ extends BeforeAfter {
    String productName;
    public WebDriver driver;

    By filterButton = By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select");


    public ProductPageFiltersAZ(String productName) {
        this.productName = productName;
    }

    public static void main(String[] args) {

        ProductPageFiltersAZ[] productPages = {
                new ProductPageFiltersAZ("Sauce Labs Backpack"),
                new ProductPageFiltersAZ("Sauce Labs Bike Light"),
                new ProductPageFiltersAZ("Sauce Labs Bold T-shirt"),
                new ProductPageFiltersAZ("Sauce Labs Fleece Jacket"),
                new ProductPageFiltersAZ("Sauce Labs Onesie"),
                new ProductPageFiltersAZ("Test.allTheThings() T-Shirt (Red)")
        };

        ProductPageFiltersAZ[] originalProductPages = productPages.clone();

        Arrays.sort(productPages, Comparator.comparing(productPage -> productPage.productName));

        System.out.println("Products sorted by name A to Z:");
        for (ProductPageFiltersAZ productPage : productPages) {
            System.out.println(productPage.productName);
        }

        if (Arrays.equals(productPages, originalProductPages)) {
            System.out.println("Products are filtered from A to Z.");
        } else {
            System.out.println("Products are not filtered from A to Z.");
        }

    }
}

