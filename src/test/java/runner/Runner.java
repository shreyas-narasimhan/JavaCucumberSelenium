package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/features",
        glue = {"utility", "stepDefinition"},
        plugin = {
                "pretty",
                "html:target/cucumber-html-report/cucumber_report.html",
                "json:target/cucumber.json"
        }
)
public class Runner extends AbstractTestNGCucumberTests {
}
