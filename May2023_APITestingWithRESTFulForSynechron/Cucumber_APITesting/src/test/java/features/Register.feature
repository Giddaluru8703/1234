Feature: Create an account

Scenario: Create an account in timesjobs portal

Given user is in the registerpage
When user enter following details
|Srinivas|Narayan|srinivas.narayan97@gmail.com|9972278770|Bangalore|
And clicks on submit button
Then successfully an account should be created

