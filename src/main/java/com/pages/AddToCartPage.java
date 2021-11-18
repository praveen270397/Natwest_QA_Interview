package com.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class AddToCartPage {
	WebDriver driver;
	
	public AddToCartPage(WebDriver driver)
	{
		this.driver =driver;
	}

	
	private By Add_to_cart =  By.xpath("//button[@name = 'Submit']/span[contains(text(),'Add to cart')]");
	


	Hey i am seond person
	hfhh
dfhdf
dfjdfj

>>>>>>> master
	public void addToCart() {

		 driver.findElement(Add_to_cart).click();
	}public void addToCart() {
		 driver.findElement(Add_to_cart).click();
	}




}
