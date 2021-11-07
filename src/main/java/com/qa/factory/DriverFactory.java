package com.qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public static WebDriver driver;
/**
 * This method is used to set the system properties for the browser to launch it
 * @param browser
 * @return
 */
	public WebDriver initDriver(String browser) {
		//String currentDir=System.getProperty("user.dir");
		//String chromeDriverLocation=currentDir +"/src/test/resources/chromedriver.exe";
		//System.setProperty("webdriver.chrome.driver", chromeDriverLocation);
		
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} 
		if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} 
		if (browser.equals("safari")) {
			
		}
		
		return getDriver();


	}
/**
 * This method returns the driver to WebDriver init_driver method.
 * @return
 */
public static WebDriver getDriver() {
return driver;	
}
}