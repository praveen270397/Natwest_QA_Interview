package stepdefinitions;

import com.pages.OrderCreationPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.When;

public class OrderCreationPageSteps {

	OrderCreationPage orderCreationPage  = new OrderCreationPage(DriverFactory.getdriver());
	static String Expected_order_id;
	static String Expected_amount;

@When("the order reference id and amount to be paid is created")
public void the_order_reference_id_and_amount_to_be_paid_is_created() {
    
	String order_id = 	orderCreationPage.getorder_creation().getText();
	String[] order_para = order_id.split("-");
    String[] order_id_sentence = order_para[5].split(" ");
     Expected_order_id = order_id_sentence[9];
     String[] Amount_sentence = order_para[1].split(" ");
     Expected_amount = Amount_sentence[2];
     orderCreationPage.getBack_to_orders().click();
}



}
