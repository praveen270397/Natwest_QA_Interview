package stepdefinitions;

import org.testng.Assert;

import com.pages.CustomerAccountViewPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CustomerAccountViewPageSteps {

	String firstname_update;
	CustomerAccountViewPage customerAccountViewPage = new CustomerAccountViewPage(DriverFactory.getdriver());
	
	@When("user clicks on the account information")
	public void user_clicks_on_the_account_information() {
		customerAccountViewPage.getView_customer_account().click();
	}

	@When("click on my personal information")
	public void click_on_my_personal_information() {
		customerAccountViewPage.getPersonal_information().click();
	}

	
	@When("update firstname as {string} and save")
	public void update_firstname_as_and_save(String firstname) {
		firstname_update = firstname;
		customerAccountViewPage.getFirstname().clear();
		customerAccountViewPage.getFirstname().sendKeys(firstname_update);
		customerAccountViewPage.getPassword().sendKeys("Helpallpoor");
		customerAccountViewPage.getSave_button().click();
	}

	@Then("the firstname should be updated successfully and validated.")
	public void the_firstname_should_be_updated_successfully_and_validated() {
		
		String Expected_name = customerAccountViewPage.getView_customer_account_postupdate().getText();
		String[] Expected_firstname = Expected_name.split(" ");
        Assert.assertEquals(Expected_firstname[0], firstname_update);
	    
	}
}
