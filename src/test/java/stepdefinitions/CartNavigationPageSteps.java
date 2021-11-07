package stepdefinitions;


import com.pages.AddToCartPage;
import com.pages.CartNavigationPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.When;

public class CartNavigationPageSteps {

	AddToCartPage addToCartPage = new AddToCartPage(DriverFactory.getDriver());
	CartNavigationPage cartNavigationPage = new CartNavigationPage(DriverFactory.getDriver());

	
	@When("add the product to Add to cart and perform cart navigation to payment page")
	public void add_the_product_to_add_to_cart_and_perform_cart_navigation_to_payment_page() {
		addToCartPage.addToCart();
		cartNavigationPage.proceedToCheckout();
		cartNavigationPage.proceedToCheckoutSummary();
		cartNavigationPage.proceedToCheckoutAddress();
		cartNavigationPage.agreeTerms();
		cartNavigationPage.proceedToCheckoutShipping();
		
		
	}
}
