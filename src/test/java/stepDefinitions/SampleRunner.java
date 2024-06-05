package stepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = { "stepDefinitions" }, monochrome = true, plugin = {
		"pretty", "html:target/cucumber-reports/cucumber-html-report.html",
		"json:target/cucumber-reports/cucumber.json", "junit:target/cucumber-reports/cucumber.xml" }	)
public class SampleRunner {

}
