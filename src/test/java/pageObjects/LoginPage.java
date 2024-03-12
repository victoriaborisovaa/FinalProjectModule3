package pageObjects;

import beforeAfter.BeforeAfter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;

public class LoginPage extends BeforeAfter {
   WebDriver driver;

   By usernameLog = By.xpath("//*[@id=\"user-name\"]");
   By passwordLog = By.xpath("//*[@id=\"password\"]");
   By loginButton = By.xpath("//*[@id=\"login-button\"]");

   public LoginPage (WebDriver driver) {
       this.driver = driver;
   }

   public void enterUsername(String username) {
      driver.findElement(usernameLog).sendKeys("standard_user");

   }

   public void enterPassword (String password) {

      driver.findElement(passwordLog).sendKeys("secret_sauce");
   }

   public void clickOnButton() {
      driver.findElement(loginButton).click();
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"contents_wrapper\"]")));


   }
}
