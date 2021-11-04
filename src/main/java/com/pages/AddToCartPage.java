package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCartPage {
	WebDriver driver;
	
	public AddToCartPage(WebDriver driver)
	{
		this.driver =driver;
	}

	private By Add_to_cart =  By.xpath("//button[@name = 'Submit']/span[contains(text(),'Add to cart')]");

	public WebElement getAdd_to_cart() {
		return driver.findElement(Add_to_cart);
	}




}
