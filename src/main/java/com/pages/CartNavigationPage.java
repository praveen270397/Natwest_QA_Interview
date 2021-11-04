package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartNavigationPage {

	
WebDriver driver;
	
	public CartNavigationPage(WebDriver driver)
	{
		this.driver =driver;
	}

	private By Proceed_to_checkout =  By.xpath("//a[contains(@class,'btn btn-default ')]/span[contains(text(),'Proceed to checkout')]");
	private By Proceed_to_checkout_summary =  By.xpath("//p[@class='cart_navigation clearfix']/a[contains(@class,'btn btn-default')]/span[contains(text(),'Proceed to checkout')]");
	private By Proceed_to_checkout_address =  By.xpath("//button[contains(@name,'processAddress')]/span[contains(text(),'Proceed to checkout')]");
	private By Agree_terms =  By.xpath("//input[@type='checkbox']");
	private By Proceed_to_checkout_shipping =  By.xpath("//button[contains(@name,'processCarrier')]/span[contains(text(),'Proceed to checkout')]");


	public WebElement getProceed_to_checkout() {
		return driver.findElement(Proceed_to_checkout);
	}


	public WebElement getProceed_to_checkout_summary() {
		return driver.findElement(Proceed_to_checkout_summary);
	}


	public WebElement getProceed_to_checkout_address() {
		return driver.findElement(Proceed_to_checkout_address);
	}


	


	public WebElement getProceed_to_checkout_shipping() {
		return driver.findElement(Proceed_to_checkout_shipping);
	}


	public WebElement getAgree_terms() {
		return driver.findElement(Agree_terms);
	}

}
