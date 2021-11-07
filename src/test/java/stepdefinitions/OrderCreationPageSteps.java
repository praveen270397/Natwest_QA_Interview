package stepdefinitions;

import com.pages.OrderCreationPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.When;

public class OrderCreationPageSteps {

	OrderCreationPage orderCreationPage  = new OrderCreationPage(DriverFactory.getDriver());


@When("the order reference id and amount to be paid is created")
public void the_order_reference_id_and_amount_to_be_paid_is_created() {
    
	orderCreationPage.orderCreation();
	
     orderCreationPage.backToOrders();
}



}
