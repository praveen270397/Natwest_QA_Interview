package stepdefinitions;


import com.pages.ProductPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.When;

public class ProductPageSteps {

	ProductPage productPage = new ProductPage(DriverFactory.getdriver());
	
	@When("user select the product {string}")
	public void user_select_the_product(String product) {
		productPage.setProduct_tab_select(product);
		productPage.getProduct_tab_select().click();
		productPage.getProduct_select().click();
		
	}

}
