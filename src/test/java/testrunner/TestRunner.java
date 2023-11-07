package testrunner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/com/features",
		glue = {"stepdefinitions","Hooks"},
		//tags= " @Add_multiple_diary_event or @Delete_event",
		dryRun = false,
		monochrome = false,
		plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
			
		)
public class TestRunner {
	
}
