Feature: Hotel Booking Functionality


Scenario Outline:user want to login the application
	Given user launch the adactin application
	When user enter the "<username>" valid username
	And user enter the "<password>" valid password
	And user click the login button
	Then user validate the username and password
		
		Examples:
		| username | password |
		| abcd | 1234 |
		| 1234 | abcd |
		| ramkumar23 | 70KKPB |
		


#Scenario: user want to login the application
#	Given user launch the adactin application
#	When user enter the valid username
#	And user enter the valid password
#	And user click the login button
#	Then user validate the username and password
	

Scenario: user search for hotel
	When user select the location
	And user select the hotel
	And user select room type
	And user select number of rooms
	And user enter the checkin date
	And user enter the checkout date
	And user select number of rooms for adult
	And user select number of rooms for child
	And user click the search button
    Then user validate the search of hotel
    



    


