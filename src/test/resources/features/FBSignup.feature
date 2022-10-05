@regression
Feature: FB Application feature file

#kkgkgk

Scenario: SignUp
		Given user opens browser
		When user is on login page
		Then user clicks on Create New Account
		Then user routes to SignupPage and enter all required details
		Then user clicks on submit button
	#	Then User routes to OTP page
		Then close the browser