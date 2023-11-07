Feature: As an authenticated user,I want to able to add a diary event to the calendar,so that I can keep track of my appointments
 
 Background: User Launches the application
Given user launches the tiny SPA app inj browser
Then user should be able to launch the application successfully with Title "React App"
 
 
 @Add_diary_event
Scenario: User add a diary event on the day of screening call

Given user navigate to any particular month of year as "November 2021"
When user select the appropriate date as "27".
And user creates a diary event called "PraveenInterview(Done)" with "Default" colour.
Then the diary event should get added successfully with appropriate colour.
And browser should be closed

 @Add_multiple_diary_event
Scenario: User adds multiple diary event on future day for finalinterview slot

Given user navigate to any particular month of year as "November 2024"
When user select the appropriate date as "27".
And user creates a diary event as below values with below approriate colour.
      |Slot Time                         |colour|
      |FinalInterviewSlot[6:30pm][7:30pm]|red   |
      |FinalInterviewSlot[2.00pm][3.00pm]|red   |
      |FinalInterviewSlot[6.00pm][7.00pm]|red   |
Then the diary event should get added successfully with appropriate colour.



 

 