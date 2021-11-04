package stepdefinitions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.pages.OrderHistoryPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Then;

public class OrderHistoryPageSteps {
	
	OrderHistoryPage orderHistoryPage = new OrderHistoryPage(DriverFactory.getdriver());
	
	@Then("the order reference id and amount should be validated in orderhistory page")
	public void the_order_reference_id_and_amount_should_be_validated_in_orderhistory_page() {
		List<WebElement> order_id_column = orderHistoryPage.getorderIds();
		boolean order_id_presence = false;
	      for(int i=0;i<order_id_column.size();i++) {
	    	  
	    	  String order_id = order_id_column.get(i).getText();
	    	  if(order_id.equalsIgnoreCase(OrderCreationPageSteps.Expected_order_id))
	    	  {
	    		  Assert.assertEquals(OrderCreationPageSteps.Expected_order_id, order_id);
	    		  order_id_presence = true;
	    	  
	    	  }
	    	  
	    	  if(order_id_presence==false) {
	    		  
	    	     Assert.fail("Order id is not present in order history table");
	    	    
	 
	    	  }
	      }
	      List<WebElement> Amount_column = orderHistoryPage.getAmountList();
			boolean Amount_presence = false;
		      for(int i=0;i<Amount_column.size();i++) {
		    	  
		    	  String Amount_tailingSpace = Amount_column.get(i).getText();
		    	  String Amount= Amount_tailingSpace.trim();
		    	String Expected_amount=  OrderCreationPageSteps.Expected_amount.trim();
		    	  if(Amount.equals(Expected_amount))
		    	  {
		    		  Assert.assertEquals(Expected_amount, Amount);
		    		  Amount_presence = true;
		    	 
		    	  }
		    	  
		    	  if(Amount_presence==false) {
		  
		    	     Assert.fail("Amount is not present in order history table");
		    	    
		
		    	  }
		      }

		
	}
}
