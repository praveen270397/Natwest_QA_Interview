package stepdefinitions;

import org.testng.Assert;

import com.pages.CustomerAccountViewPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CustomerAccountViewPageSteps {

	
	CustomerAccountViewPage customerAccountViewPage = new CustomerAccountViewPage(DriverFactory.getdriver());
	String firstname_update;
	
	@Given("user clicks on the account information")
	public void user_clicks_on_the_account_information() {
		customerAccountViewPage.View_customer_account();
	}

	@When("click on my personal information")
	public void click_on_my_personal_information() {
		customerAccountViewPage.Personal_information();
	}

	
	@When("update firstname as {string} and save")
	public void update_firstname_as_and_save(String firstname) {
		 firstname_update = firstname;
		customerAccountViewPage.Firstname_clear();
		customerAccountViewPage.Firstname_update(firstname_update);
		customerAccountViewPage.Password();
		customerAccountViewPage.Save_button();
	}

	@Then("the firstname should be updated successfully and validated.")
	public void the_firstname_should_be_updated_successfully_and_validated() {
		
		String Expected_name = customerAccountViewPage.getView_customer_account_postupdate();
		
        Assert.assertEquals(Expected_name, firstname_update);
	    
	}
}
