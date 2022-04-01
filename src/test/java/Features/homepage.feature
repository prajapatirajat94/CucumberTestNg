Feature: Verifying homepage
@Homepage
Scenario: verifying login page of walmart

Given user is on loginpage by using url "https://www.walmart.ca/en"
When checking title of page
Then title is correct
