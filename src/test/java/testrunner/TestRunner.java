package testrunner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/com/features",
		glue = {"stepdefinitions","Hooks"},
		tags= "@firstNameUpdate or @purchaseTshirt",
		dryRun = false,
		monochrome = false,
		plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
			
		)
public class TestRunner {

}
