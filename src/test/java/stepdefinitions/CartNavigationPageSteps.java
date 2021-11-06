package stepdefinitions;


import com.pages.AddToCartPage;
import com.pages.CartNavigationPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.When;

public class CartNavigationPageSteps {

	AddToCartPage addToCartPage = new AddToCartPage(DriverFactory.getdriver());
	CartNavigationPage cartNavigationPage = new CartNavigationPage(DriverFactory.getdriver());

	
	@When("add the product to Add to cart and perform cart navigation to payment page")
	public void add_the_product_to_add_to_cart_and_perform_cart_navigation_to_payment_page() {
		addToCartPage.Add_to_cart();
		cartNavigationPage.Proceed_to_checkout();
		cartNavigationPage.Proceed_to_checkout_summary();
		cartNavigationPage.Proceed_to_checkout_address();
		cartNavigationPage.Agree_terms();
		cartNavigationPage.Proceed_to_checkout_shipping();
		
		
	}
}
