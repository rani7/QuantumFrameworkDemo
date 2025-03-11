Feature: Demo

@UserSubmitDetails
Scenario Outline: user fills details in the test page
Given "<testCol>" user is on the testing blog site
When user fills the details in the page with data
Then user verifies the page title
Examples:
|testCol|
|scenario1|

