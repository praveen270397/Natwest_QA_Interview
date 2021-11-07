package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderHistoryPage {
	WebDriver driver;

	public OrderHistoryPage(WebDriver driver) {
		this.driver = driver;
	}

	public String orderId() {

		String order_id = driver.findElement(By.xpath("//table[@id = 'order-list']/tbody/tr/td[1]/a")).getText();
		return order_id;

	}

	public String amount() {

		String Amount = driver.findElement(By.xpath("//table[@id = 'order-list']/tbody/tr/td[3]/span")).getText();

		return Amount;

	}
}
