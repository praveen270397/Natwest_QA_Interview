Feature: Customer information update

Scenario: Update Personal Information (First Name) in My Account

Given user logged into the application with valid username and password.
When user clicks on the account information
And click on my personal information
And update firstname as "Pav" and save
Then the firstname should be updated successfully and validated.






