Feature: Demo

@User1SubmitDetails
Scenario Outline: user1 fills details in the test page
Given with "<testData>" user is on the testing blog site
When user fills the details in the page
Then user closes the browser
Examples:
|testData|scenario1|

