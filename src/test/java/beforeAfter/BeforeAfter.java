package beforeAfter;

import browserFactory.BrowserFactory;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class BeforeAfter {

    public WebDriver driver ;

    @Before

    public void setUp() {

        driver = BrowserFactory.getBrowser("Chrome");
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @After

    public void teardown() {

        if (driver != null) {

           driver.quit();
        }
    }
}
