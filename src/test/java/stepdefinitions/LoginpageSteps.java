package stepdefinitions;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;

import com.pages.Loginpage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginpageSteps {
	
	Loginpage loginpage = new Loginpage(DriverFactory.getDriver());


@Given("user launches the tiny SPA app inj browser")
public void user_launches_the_tiny_spa_app_inj_browser() {
	loginpage.launchAppUrl();
}
@Then("user should be able to launch the application successfully with Title {string}")
public void user_should_be_able_to_launch_the_application_successfully_with_title(String app_title) {
    
	assertEquals(app_title, loginpage.title());
	System.out.println(loginpage.title());
}

@Given("user navigate to any particular month of year as {string}")
public void user_navigate_to_any_particular_month_of_year_as(String Target_timeline) throws ParseException {
	loginpage.SelectMonth(Target_timeline);
}

@Then("user should select the appropriate date as {string}.")
public void user_should_selected_the_appropriate_date_as(String target_date) {
	loginpage.selectdate(target_date);
}
@When("user select the appropriate date as {string}.")
public void user_select_the_appropriate_date_as(String target_date) {
	loginpage.selectdate(target_date);
	}


@Then("user creates a diary event called {string} with {string} colour.")
public void user_creates_a_diary_event_called_with_colour(String event_name, String default_colour) {
	loginpage.event_addition(event_name,default_colour);
}
@Then("the diary event should get added successfully with appropriate colour.")
public void the_diary_event_should_get_added_successfully_with_appropriate_colour() {
	loginpage.colour_validation();
}


@Then("user creates a diary event as below values with below approriate colour.")
public void user_creates_a_diary_event_as_below_values_with_below_approriate_colour(io.cucumber.datatable.DataTable dataTable) {
	loginpage.multiple_event_addition(dataTable);   
}

@Then("browser should be closed")
public void browser_should_be_closed() {
    loginpage.browserclose();
}

@Given("User wants to delete diary events as below which has already been created on date {string}.")
public void user_wants_to_delete_diary_events_as_below_which_has_already_been_created_on_date(String Delete_date, io.cucumber.datatable.DataTable dataTable) {
	loginpage.deleteEvent(dataTable,Delete_date);
}
@Then("the respective diary events as below should be deleted on date {string}.")
public void the_respective_diary_events_as_below_should_be_deleted_on_date(String Delete_date, io.cucumber.datatable.DataTable dataTable) {
	loginpage.validate_deleteEvent(dataTable,Delete_date);
}
}