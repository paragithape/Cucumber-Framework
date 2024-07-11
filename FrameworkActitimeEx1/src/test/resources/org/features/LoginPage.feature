Feature: Actitime Login Feature

Scenario: ActiTime Login Page title
Given User is on the login page
When User gets the title of the page
Then Title of login page should be "actiTIME - Login"

Scenario: Keep me logged in checkbox
Given User is on the login page
Then Keep me logged in checkbox should be displayed

Scenario: ActiTime Login Test Case
Given User is on the login page
When User enters "USERNAME" and "PASSWORD"
And User clicks on login button
Then Page title should be "actiTIME -  Enter Time-Track123"