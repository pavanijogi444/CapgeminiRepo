Feature: Store login
This feature deals with the login functionality.
Background:
Given I am on the login page	


@TC1
Scenario: Login with correct username and correct password

	Given I am on the login page
	#And I entered username and password
	When I entered "mercury" and "mercury"
	And I click on login button
	Then I navigated to the home page
@TC2	
Scenario: Login with correct username and incorrect password

	Given I am on the login page
	#And I entered username and password
	When I entered "mercury" and "pavani"
	And I click on login button
	Then I navigated to the error page


@TC3
Scenario: using Datatable

	
	#And I entered username and password
	#When I entered "mercury" and "mercury"
	When I entered following details
	| userName | passWord |
	| mercury | mercury |
	| pavani | pavani123 |
	And I click on login button
	Then I navigated to the home page
