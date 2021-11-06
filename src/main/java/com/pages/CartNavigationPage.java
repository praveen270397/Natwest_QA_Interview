package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


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


	public void Proceed_to_checkout() {
		driver.findElement(Proceed_to_checkout).click();
	}


	public void Proceed_to_checkout_summary() {
		 driver.findElement(Proceed_to_checkout_summary).click();
	}


	public void Proceed_to_checkout_address() {
		 driver.findElement(Proceed_to_checkout_address).click();
	}


	


	public void Proceed_to_checkout_shipping() {
		driver.findElement(Proceed_to_checkout_shipping).click();
	}


	public void Agree_terms() {
		 driver.findElement(Agree_terms).click();
	}

}
