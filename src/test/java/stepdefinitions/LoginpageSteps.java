package stepdefinitions;

import com.pages.Loginpage;
import com.qa.factory.DriverFactory;
import com.qa.util.ConfigReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginpageSteps {
	
	Loginpage loginpage = new Loginpage(DriverFactory.getdriver());
	ConfigReader configs = new ConfigReader();
    
@Given("user logged into the application with valid username and password.")
public void user_logged_into_the_application_with_valid_username_and_password() {
    
	loginpage.launchAppUrl();
    loginpage.getSign_in().click();
    loginpage.getEmail_id().sendKeys(configs.init_prop().getProperty("username"));
    loginpage.getPassword().sendKeys(configs.init_prop().getProperty("password"));
    loginpage.getSubmit().click();
}


}
