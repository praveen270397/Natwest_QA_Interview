package stepdefinitions;


import static org.junit.Assert.assertEquals;

import com.pages.OrderCreationPage;
import com.pages.OrderHistoryPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Then;

public class OrderHistoryPageSteps {
	
	OrderHistoryPage orderHistoryPage = new OrderHistoryPage(DriverFactory.getDriver());
	
	@Then("the order reference id and amount should be validated in orderhistory page")
	public void the_order_reference_id_and_amount_should_be_validated_in_orderhistory_page() 
	{
		 
		 assertEquals(OrderCreationPage.Expected_order_id, orderHistoryPage.orderId());
	      assertEquals(OrderCreationPage.Expected_amount_withspace.trim(), orderHistoryPage.amount().trim());
		
	}
}
