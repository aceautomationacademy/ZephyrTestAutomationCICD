package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"utility", "stepDefinitions"},
        plugin = {"junit:target/cucumber/result.xml","pretty", "html:target/cucumber-html-report","json:cucumber.json"}
)
public class TestRunner {

}