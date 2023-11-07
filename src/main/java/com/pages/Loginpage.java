package com.pages;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;

import com.qa.util.ConfigReader;

import io.cucumber.datatable.DataTable;

public class Loginpage {
	WebDriver driver;
	ConfigReader configs = new ConfigReader();
	ArrayList<String> actual_colour_list = new ArrayList<String>();
	ArrayList<String> actual_event_list = new ArrayList<String>();
	int actual_month;
	int actual_year;
	String mainpage_event_name;
	List<String> user_input;
	String actual_timeline;
	String actual_colour;
	String target_date;
	String[] actual_colour_created;
	List<WebElement> Expected_colour;
	List<WebElement> Expected_colour_Deletelist;
	Calendar calendar;
	private By Left_navigation = By.xpath("(//span[contains(text(),'chevron_left')])[2]");
	private By Right_navigation = By.xpath("(//span[contains(text(),'chevron_right')])[2]");
	private By Date_list = By.xpath("//div[@class='grid grid-cols-7 grid-rows-6']/button/span");
	private By create_button = By.xpath("//span[@class='pl-3 pr-7']");
	private By text_box = By.xpath("//input[@name='title']");
	private By actual_defaultcolour_path = By.xpath("//div[@class='flex gap-x-2']/span/span/parent::span");
	private By actual_colour_path = By.xpath("//div[@class='flex gap-x-2']/span");
	private By submit_path = By.xpath("//button[@type='submit']");

	public Loginpage(WebDriver driver) {
		this.driver = driver;
	}

	public void leftNavigation() {
		driver.findElement(Left_navigation).click();
	}

	public void rightNavigation() {
		driver.findElement(Right_navigation).click();
	}

	public List<WebElement> dateList() {
		return driver.findElements(Date_list);
	}

	public void click_create_button() {
		driver.findElement(create_button).click();
	}

	public void Enter_text(String name) {
		driver.findElement(text_box).sendKeys(name);
	}

	public String actualDefaultColourPath() {

		return driver.findElement(actual_defaultcolour_path).getAttribute("class");
	}

	public List<WebElement> actualColourPath() {

		return driver.findElements(actual_colour_path);
	}

	public void click_submit_button() {
		driver.findElement(submit_path).click();
	}

	public List<WebElement> expectedColourPath(String target_date) {

		return driver.findElements(
				By.xpath("//p[text() = '" + target_date + "']/parent::header/following-sibling::div/div"));
	}

	public void launchAppUrl() {

		driver.get(configs.initProp().getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public String title() {
		return driver.getTitle();
	}

	public void SelectMonth(String target_timeline) throws ParseException {

		calendar = Calendar.getInstance();
		calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(target_timeline));
		int target_month = calendar.get(calendar.MONTH);
		int target_year = calendar.get(calendar.YEAR);
		// int target_date_final = calendar.get(calendar.DAY_OF_MONTH);
		Timeline_select_logic();

		while (target_month < actual_month || target_year < actual_year) {
			leftNavigation();
			Timeline_select_logic();
		}

		while (target_month > actual_month || target_year > actual_year) {
			rightNavigation();
			Timeline_select_logic();

		}

		while (target_month > actual_month && target_year == actual_year) {

			rightNavigation();
			Timeline_select_logic();

		}

		while (target_month < actual_month && target_year == actual_year) {

			leftNavigation();
			Timeline_select_logic();
		}

	}

	public void Timeline_select_logic() throws ParseException {
		actual_timeline = driver.findElement(By.xpath("//header[@class='flex justify-between']/p")).getText();

		calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(actual_timeline));

		actual_month = calendar.get(calendar.MONTH);
		actual_year = calendar.get(calendar.YEAR);

	}

	public void selectdate(String target_date) {
		this.target_date = target_date;
		List<WebElement> date_elements = dateList();

		for (int element = 0; element < date_elements.size(); element++) {
			if (Integer.parseInt(date_elements.get(element).getText()) == Integer.parseInt(target_date)) {
				date_elements.get(element).click();
				break;

			}

		}
	}

	public void event_addition(String event_name, String colour) {

		click_create_button();
		Enter_text(event_name);
		actual_event_list.add(event_name);
		if (colour.equals("Default")) {
			actual_colour = actualDefaultColourPath();
			String[] actual_first_split = actual_colour.split("-");
			actual_colour_created = actual_first_split[1].split("-");
			actual_colour_list.add(actual_colour_created[0]);
			System.out.println(actual_colour_created[0]);
		} else {
			List<WebElement> ele = actualColourPath();

			for (int i = 0; i < ele.size(); i++) {

				actual_colour = ele.get(i).getAttribute("class");
				String[] actual_first_split = actual_colour.split("-");
				actual_colour_created = actual_first_split[1].split("-");

				if (actual_colour_created[0].equals(colour)) {
					actual_colour_list.add(actual_colour_created[0]);
					ele.get(i).click();
					break;
				}
			}

		}

		click_submit_button();

	}

	public void colour_validation() {
		Expected_colour = expectedColourPath(target_date);

		for (int element = 0; element < Expected_colour.size(); element++) {

			if (!(Expected_colour.get(element).getAttribute("class").contains(actual_colour_list.get(element)))) {

				mainpage_event_name = Expected_colour.get(element).getText();

				Assert.assertTrue(false, mainpage_event_name + "event is not created with expected colour");

			}

			if (!(Expected_colour.get(element).getText().equals(actual_event_list.get(element)))) {

				Assert.assertTrue(false, mainpage_event_name + "event is not created as expected");

			}

		}
	}

	public void multiple_event_addition(DataTable dataTable) {

		List<Map<String, String>> user_input = dataTable.asMaps();

		for (int element = 0; element < user_input.size(); element++) {
			event_addition(user_input.get(element).get("Slot Time"), user_input.get(element).get("colour"));

		}

	}

	public void deleteEvent(DataTable dataTable, String delete_date) {

		user_input = dataTable.asList();
		Expected_colour_Deletelist = expectedColourPath(delete_date);
		int element = 0;

		while (element < Expected_colour_Deletelist.size()) {

			if (user_input.contains(Expected_colour_Deletelist.get(element).getText())) {

				Expected_colour_Deletelist.get(element).click();
				driver.findElement(By.xpath("//span[text()='delete']")).click();
				Expected_colour_Deletelist = expectedColourPath(delete_date);
				element = 0;
			}
			element++;

		}

	}

	public void validate_deleteEvent(DataTable dataTable, String delete_date) {
		List<String> list = dataTable.asList();

		List<WebElement> Expected_colour = expectedColourPath(delete_date);
		for (int element = 0; element < Expected_colour.size(); element++) {
			if (list.contains(Expected_colour.get(element).getText())) {
				Assert.assertTrue(false, Expected_colour.get(element).getText() + "event is not deleted");

			}
		}

	}

	public void browserclose() {
		driver.quit();
	}
}
