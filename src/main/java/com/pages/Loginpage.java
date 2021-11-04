package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
	WebDriver driver;
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
		
		driver.get("http://automationpractice.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public WebElement getEmail_id() {
		return driver.findElement(Email_id);
	}
	public WebElement getPassword() {
		return driver.findElement(Password);
	}
	public WebElement getSubmit() {
		return driver.findElement(submit);
	}
	public WebElement getSign_in() {
		return driver.findElement(Sign_in);
	}





}
