package stepdefinitions;

import org.testng.Assert;

import com.pages.Loginpage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginpageSteps {
	
	Loginpage loginpage = new Loginpage(DriverFactory.getdriver());
	
    
@Given("user clicks on sign in  on index page")
public void user_clicks_on_sign_in_on_index_page() {
	loginpage.launchAppUrl();
	loginpage.Sign_in();   
}

@When("enters valid username and password and clicks on sign in")
public void enters_valid_username_and_password_and_clicks_on_sign_in() {
	loginpage.Email_id();
    loginpage.Password();
    loginpage.Submit();

}

@Then("user should be logged in succesfully")
public void user_should_be_logged_in_succesfully() {
	
	String Expected_title = loginpage.title();
	Assert.assertEquals("My account - My Store", Expected_title);
	
}
}
