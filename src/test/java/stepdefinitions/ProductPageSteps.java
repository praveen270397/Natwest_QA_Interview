package stepdefinitions;


import com.pages.ProductPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;


public class ProductPageSteps {

	ProductPage productPage = new ProductPage(DriverFactory.getDriver());
	
	@Given("user select the product {string}")
	public void user_select_the_product(String product) {
		productPage.productTabSelect(product);
		productPage.productSelect();
		
	}

}
