Feature: Hotel booking fuctionality 2

Scenario: user select the hotel
    When user click the checkbox of hotel
    And user click the continue button
    Then user validate the selection of hotel
    
Scenario: user book the hotel
    When user enter the first name
    And user enter the last name
    And user enter the billing address
    And user enter the credit card number
    And user enter the credit card type
    And user enter the credit card expiry month
    And user enter the credit card expiry year
    And user enter the credit card cvv number
    And user click the booknow button
    Then user validate the booking of hotel
    
Scenario: user confirm hotel booking
    When user click myitinerary
    Then user validate the confirmation of hotel booking
   
Scenario: user logout from application
  	When user click the logout button
    Then user validate the logout of application