package stepdefinitions;


import org.testng.Assert;

import com.pages.OrderCreationPage;
import com.pages.OrderHistoryPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Then;

public class OrderHistoryPageSteps {
	
	OrderHistoryPage orderHistoryPage = new OrderHistoryPage(DriverFactory.getdriver());
	
	@Then("the order reference id and amount should be validated in orderhistory page")
	public void the_order_reference_id_and_amount_should_be_validated_in_orderhistory_page() 
	{
		 String Actual_order_id = orderHistoryPage.orderId();
		 
		 Assert.assertEquals(OrderCreationPage.Expected_order_id, Actual_order_id);
		 
		 
	      String Actual_Amount_withspace = orderHistoryPage.Amount();
	      String Actual_Amount=Actual_Amount_withspace.trim();
	    String Expected_amount = OrderCreationPage.Expected_amount_withspace.trim();
	      Assert.assertEquals(Expected_amount, Actual_Amount);

		
	}
}
