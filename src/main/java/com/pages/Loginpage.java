package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.qa.util.ConfigReader;

public class Loginpage {
	WebDriver driver;
	ConfigReader configs = new ConfigReader();
	private By Sign_in =  By.xpath("//a[@title='Log in to your customer account']");
	private By Email_id = By.id("email");
	private By Password= By.id("passwd");
	private By submit= By.id("SubmitLogin");

	public Loginpage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void launchAppUrl()
	{
		
		driver.get(configs.initProp().getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void emailId() {
			System.out.println(System.getProperty("username"));
		 driver.findElement(Email_id).sendKeys(System.getProperty("username"));
	}
	public void Password() {
		driver.findElement(Password).sendKeys(System.getProperty("password"));
	}
	public void submit() {
		driver.findElement(submit).click();
	}
	public void signIn() {
		driver.findElement(Sign_in).click();
	}
	public String title() {
		return driver.getTitle();
	}




}
