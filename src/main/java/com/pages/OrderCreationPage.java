package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class OrderCreationPage {

	WebDriver driver;
 public static String Expected_order_id;
 public static String Expected_amount_withspace;
	private By order_creation =  By.xpath("//div[@class='box']");
	private By back_to_orders =  By.xpath("//p[@class='cart_navigation exclusive']/a");

	public OrderCreationPage(WebDriver driver) {
		this.driver = driver;
	}

	public void orderCreation() {
			
		String order_id = 	driver.findElement(order_creation).getText();
			String[] order_para = order_id.split("-");
		    String[] order_id_sentence = order_para[5].split(" ");
		     Expected_order_id = order_id_sentence[9];  
		     String[] Amount_sentence = order_para[1].split(" ");
		     Expected_amount_withspace = Amount_sentence[2];
		
        
	}

	public void backToOrders() {
		 driver.findElement(back_to_orders).click();
	}
	
		
		
}
