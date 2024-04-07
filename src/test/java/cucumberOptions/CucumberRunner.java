package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/featureFiles/second.feature", glue = "stepDefinitions", monochrome = true, tags = "@Smoke", plugin = {
		"pretty", "html:target/cucumber.html", "json:target/cucumber.json" })
public class CucumberRunner extends AbstractTestNGCucumberTests {

}
