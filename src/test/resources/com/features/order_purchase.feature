Feature: Purchase Product Validation and Account details update

Background: User is logged in
Given user clicks on sign in  on index page
When enters valid username and password and clicks on signIn
Then user should be logged in successfully

@purchaseTshirt
Scenario: Order T-Shirt and Verify the order in Order History
Given user select the product "T-shirt"
And add the product to Add to cart and perform cart navigation to payment page
And confirm the order by making payment with payoption as "Pay by bank wire"
And the order reference id and amount to be paid is created
Then the order reference id and amount should be validated in orderhistory page

@firstNameUpdate
Scenario: Update Personal Information (First Name) in My Account
Given user clicks on the account information
And click on my personal information
And update firstname as "Pav" and save
Then the firstname should be updated successfully and validated.


