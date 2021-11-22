package Hooks;

import java.util.Properties;


import org.openqa.selenium.WebDriver;

import com.qa.factory.DriverFactory;
import com.qa.util.ConfigReader;
import com.qa.util.ScreenShot;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class ApplicationHooks {

	private DriverFactory driverFactory;
	private WebDriver driver;
	private ConfigReader configReader;
	Properties prop;
	ScreenShot failure = new ScreenShot();
/**
 * This method is used to fetch the property object from configReader file.
 */
	@Before(order = 0)
	public void getProperty() {
		configReader = new ConfigReader();
		prop = configReader.initProp();
	}
	
	/**
	 * This method is used to fetch the browser from property file and launch it.
	 */

	@Before(order = 1)
	public void launchBrowser() {
		//String browserName = prop.getProperty("browser");
		driverFactory = new DriverFactory();
		System.out.println(System.getProperty("browser"));
		System.out.println("sdgdsgdgdhfdh");
		driver = driverFactory.initDriver(System.getProperty("browser"));
		
	}
/**
 * This method is used to quit the browser 
 */
	@After(order = 0)
	public void quitBrowser() {
		driver.quit();
	}
	@After(order = 1)
	public void tearDown(Scenario scenario) {
		failure.Screenshot_capture(scenario);
	}
	}

