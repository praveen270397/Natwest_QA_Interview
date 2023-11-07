Feature: As an Unauthenticated user,I want to able to click through the months of the year,so that I can view all the days of month
 

Background: User Launches the application
Given user launches the tiny SPA app inj browser
Then user should be able to launch the application successfully with Title "React App"


@FutureYear
Scenario: User navigate to the month of future year

Given user navigate to any particular month of year as "November 2021"
Then user should select the appropriate date as "27".
And browser should be closed

@PastYear
Scenario: User navigate to the month of past year

Given user navigate to any particular month of year as "March 2024"
Then user should select the appropriate date as "11".
And browser should be closed

@CurrentYear
Scenario: User navigate to the month of current year

Given user navigate to any particular month of year as "July 2023"
Then user should select the appropriate date as "19".
And browser should be closed




















