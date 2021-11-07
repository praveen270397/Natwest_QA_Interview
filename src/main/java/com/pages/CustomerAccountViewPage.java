package com.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.util.ConfigReader;


public class CustomerAccountViewPage {
	WebDriver driver;
	ConfigReader configs = new ConfigReader();
	private By view_customer_account = By.xpath("//a[@title='View my customer account']/span[contains(text(),'Muthusamy')]");
	private By Personal_information = By.xpath("//a[@title='Information']/span");
	private By firstname = By.id("firstname");
	private By password = By.id("old_passwd");
	private By save_button = By.xpath("//button[@type='submit']/span[contains(text(),'Save')]");
	private By view_customer_account_postupdate = By.xpath("//a[@title='View my customer account']/span");


	public CustomerAccountViewPage(WebDriver driver) {
		this.driver = driver;
	}

	public void View_customer_account() {
		 driver.findElement(view_customer_account).click();
	}

	public void Personal_information() {
	      driver.findElement(Personal_information).click();
	}

	public void Firstname_clear() {
		 driver.findElement(firstname).clear();
	}
	public void Firstname_update(String firstname_update) {
		 driver.findElement(firstname).sendKeys(firstname_update);
	}

	public void Save_button() {
		 driver.findElement(save_button).click();
	}

	public void Password() {
		 driver.findElement(password).sendKeys(configs.initProp().getProperty("password"));
	}

	public String getView_customer_account_postupdate() {
		String Expected_name = driver.findElement(view_customer_account_postupdate).getText();
		String[] Expected_firstname = Expected_name.split(" ");
		return Expected_firstname[0];
	}

}
