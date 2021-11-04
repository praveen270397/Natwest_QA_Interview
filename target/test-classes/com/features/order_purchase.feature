Feature: Order Validation

Scenario: Order T-Shirt and Verify the order in Order History

Given user logged into the application with valid username and password.
When user select the product "T-shirt"
And add the product to Add to cart
And perform cart navigation to payment page
And confirm the order by making payment with payoption as "Pay by bank wire"
And the order reference id and amount to be paid is created
Then the order reference id and amount should be validated in orderhistory page