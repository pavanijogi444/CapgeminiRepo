Feature: Store login
 
This feature deals with the login functionality.
Background:
#Given I navigate to Browser
Scenario Outline: Login with correct username and correct password
 

Given  I navigate "https://demo.guru99.com/test/newtours/index.php"
 
When I insert "<userName>" and "<passWord>"
 
And I clicked the signin button
 
Then Its navigates the UI"<expected result>"
 
 
Examples:
 
| userName | passWord | expected result |
 
| mercury | mercury  | Login Successfully |
 
| mercury | a22332 | Enter your userName and password correct |
 
| mamatha | harini | Enter your userName and password correct |