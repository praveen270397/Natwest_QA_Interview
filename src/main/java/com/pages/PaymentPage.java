package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PaymentPage {
WebDriver driver;
WebElement pay_option_mode;
private By Order_confirmation = By.xpath("//button[@type='submit']/span[contains(text(),'I confirm my order')]");

	public PaymentPage(WebDriver driver)
	{
		this.driver =driver;
	}


	public void orderConfirmation() {
		 driver.findElement(Order_confirmation).click();
	}

	public void payOption(String pay_mode) {
		
	 driver.findElement(By.xpath("//p[@class='payment_module']/a[@title='"+pay_mode+"']")).click();
	}
	

	
}
