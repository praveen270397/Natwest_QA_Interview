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
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.out.println("browser value is: " + browser);

		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			
		} else if (browser.equals("safari")) {
			
		} else {
			System.out.println("Please pass the correct browser value: " + browser);
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