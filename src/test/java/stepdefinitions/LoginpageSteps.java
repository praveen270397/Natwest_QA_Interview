package stepdefinitions;

import static org.junit.Assert.assertEquals;
import com.pages.Loginpage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginpageSteps {
	
	Loginpage loginpage = new Loginpage(DriverFactory.getDriver());
	
    
@Given("user clicks on sign in  on index page")
public void user_clicks_on_sign_in_on_index_page() {
	loginpage.launchAppUrl();
	loginpage.signIn();   
}

@When("enters valid username and password and clicks on signIn")
public void enters_valid_username_and_password_and_clicks_on_sign_in() {
	loginpage.emailId();
    loginpage.Password();
    loginpage.submit();

}

@Then("user should be logged in successfully")
public void user_should_be_logged_in_succesfully() {
	
	assertEquals("My account - My Store", loginpage.title());
}
}
