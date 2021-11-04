package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderCreationPage {

	WebDriver driver;

	private By order_creation =  By.xpath("//div[@class='box']");
	private By back_to_orders =  By.xpath("//p[@class='cart_navigation exclusive']/a");

	public OrderCreationPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getorder_creation() {
			
			return driver.findElement(order_creation);
		
        
	}

	public WebElement getBack_to_orders() {
		return driver.findElement(back_to_orders);
	}
	
		
		
}
