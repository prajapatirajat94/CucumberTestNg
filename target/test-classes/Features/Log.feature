Feature: checking login feature of application
@Login
Scenario: login in to application by entering url 

Given i am on login page i am good "http://automationpractice.com/index.php?controller=authentication&back=my-account"
When i am taking title 
Then verifying title is good 


Given i am on login page i am good "http://automationpractice.com/index.php?controller=authentication&back=my-account"
When i am taking title 
Then verifying title is good