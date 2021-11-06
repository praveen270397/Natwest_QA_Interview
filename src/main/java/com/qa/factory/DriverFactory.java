package com.qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

	public static WebDriver driver;
/**
 * This method is used to set the system properties for the browser to launch it
 * @param browser
 * @return
 */
	public WebDriver init_driver(String browser) {
		String currentDir=System.getProperty("user.dir");
		String chromeDriverLocation=currentDir +"/src/test/resources/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverLocation);
		
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} 
		if (browser.equals("firefox")) {
			
		} 
		if (browser.equals("safari")) {
			
		}
		
		return getdriver();


	}
/**
 * This method returns the driver to WebDriver init_driver method.
 * @return
 */
public static WebDriver getdriver() {
return driver;	
}
}