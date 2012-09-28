@google
Feature: Google Search
  In order to find information on something
  Users should be able to search for it
	
  Scenario: User searches for "Caramel"
    Given a User is at Google home page
	When the User searches for "Caramel"
	Then the User should see first result as a wiki article about "Caramel"