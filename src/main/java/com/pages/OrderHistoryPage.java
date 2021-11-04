package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderHistoryPage {
	WebDriver driver;


	public OrderHistoryPage(WebDriver driver) {
		this.driver = driver;
	}

	public List<WebElement> getorderIds() {
		
		return driver.findElements(By.xpath("//table[@id = 'order-list']/tbody/tr/td[1]/a"));
	
}
public List<WebElement> getAmountList() {
		
		return driver.findElements(By.xpath("//table[@id = 'order-list']/tbody/tr/td[3]/span"));
	
}
}
