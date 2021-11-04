package stepdefinitions;

import com.pages.AddToCartPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.When;

public class AddToCartPageSteps {

	AddToCartPage addToCartPage = new AddToCartPage(DriverFactory.getdriver());

	
	@When("add the product to Add to cart")
	public void add_the_product_to_Add_to_cart() {
		addToCartPage.getAdd_to_cart().click();
	}

}
