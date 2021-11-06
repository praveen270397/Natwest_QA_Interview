package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {

	
	WebDriver driver;
	WebElement product_tab_select_value;
	
	private By Product_select = By.xpath("//h5[@itemprop='name']/a");
	
	
	public ProductPage(WebDriver driver)
	{
		this.driver = driver;
}


	public void Product_tab_select(String product) {

		 driver.findElement(By.xpath("//ul[contains(@class,'sf-menu clearfix')]/li/a[contains(text(),'"+product+"')]")).click();
		
	}


	public void Product_select() {
		 driver.findElement(Product_select).click();
	}
}
