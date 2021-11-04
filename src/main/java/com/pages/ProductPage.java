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


	public void setProduct_tab_select(String product) {

		product_tab_select_value =  driver.findElement(By.xpath("//ul[contains(@class,'sf-menu clearfix')]/li/a[contains(text(),'"+product+"')]"));
		
	}

	public WebElement getProduct_tab_select() {
	
		return product_tab_select_value;
	}


	public WebElement getProduct_select() {
		return driver.findElement(Product_select);
	}
}
