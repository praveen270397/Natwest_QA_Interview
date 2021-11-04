package stepdefinitions;


import com.pages.CartNavigationPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.When;

public class CartNavigationPageSteps {

	
	CartNavigationPage cartNavigationPage = new CartNavigationPage(DriverFactory.getdriver());

	@When("perform cart navigation to payment page")
	public void perform_cart_navigation_to_payment_page() {
		cartNavigationPage.getProceed_to_checkout().click();
		cartNavigationPage.getProceed_to_checkout_summary().click();
		cartNavigationPage.getProceed_to_checkout_address().click();
		cartNavigationPage.getAgree_terms().click();
		cartNavigationPage.getProceed_to_checkout_shipping().click();
	}

}
