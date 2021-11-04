package com.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomerAccountViewPage {
	WebDriver driver;

	private By view_customer_account = By.xpath("//a[@title='View my customer account']/span[contains(text(),'Muthusamy')]");
	private By Personal_information = By.xpath("//a[@title='Information']/span");
	private By firstname = By.id("firstname");
	private By password = By.id("old_passwd");
	private By save_button = By.xpath("//button[@type='submit']/span[contains(text(),'Save')]");
	private By view_customer_account_postupdate = By.xpath("//a[@title='View my customer account']/span");


	public CustomerAccountViewPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getView_customer_account() {
		return driver.findElement(view_customer_account);
	}

	public WebElement getPersonal_information() {
		return driver.findElement(Personal_information);
	}

	public WebElement getFirstname() {
		return driver.findElement(firstname);
	}

	public WebElement getSave_button() {
		return driver.findElement(save_button);
	}

	public WebElement getPassword() {
		return driver.findElement(password);
	}

	public WebElement getView_customer_account_postupdate() {
		return driver.findElement(view_customer_account_postupdate);
	}

}
