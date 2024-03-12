package testRunner;
import beforeAfter.BeforeAfter;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
        features = {"classpath:features/"},
        tags = {"@Smoke"},
        glue = {"classpath:stepDefinitions/"},
        plugin = {"pretty", "html:target/cucumber-reports"},
        monochrome = true)

public class RunnerClass extends BeforeAfter {
}


