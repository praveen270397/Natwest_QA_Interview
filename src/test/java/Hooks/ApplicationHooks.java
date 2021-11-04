package Hooks;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.qa.factory.DriverFactory;
import com.qa.util.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;


public class ApplicationHooks {

	private DriverFactory driverFactory;
	private WebDriver driver;
	private ConfigReader configReader;
	Properties prop;
/**
 * This method is used to fetch the property object from configReader file.
 */
	@Before(order = 0)
	public void getProperty() {
		configReader = new ConfigReader();
		prop = configReader.init_prop();
	}
	
	/**
	 * This method is used to fetch the browser from property file and launch it.
	 */

	@Before(order = 1)
	public void launchBrowser() {
		String browserName = prop.getProperty("browser");
		driverFactory = new DriverFactory();
		driver = driverFactory.init_driver(browserName);
		
	}
/**
 * This method is used to quit the browser 
 */
	@After(order = 0)
	public void quitBrowser() {
		driver.quit();
	}

	}

