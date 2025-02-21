@mustRun
Feature: login feature
	
	@smoke
	Scenario Outline: Successful login
		Given user opens the application
		When user enter login credentials "<username>" and "<password>"
		And user clicks on the login button
		Then user should be redirected to account home page
		
	Examples:
		| username | password |
		| Pavan 	 | rahulshettyacademy |
		|sruthi     | Pavan |

	@negative_scenario
	Scenario Outline: Unsuccessful login
		Given user opens the application
		When user enter login credentials "<username>" and "<password>"
		And user clicks on the login button
		Then user should be redirected to account home page
		
	Examples:
		| username | password |
		| Pavan 	 | Yadav |
		| Yadav     | Pavan |
	
	