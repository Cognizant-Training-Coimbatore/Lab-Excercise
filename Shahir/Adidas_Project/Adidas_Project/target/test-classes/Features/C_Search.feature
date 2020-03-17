
@tag
Feature: 3 Search Product From Search BAR 

  @srch01
	Scenario: srch01- Do a valid search with a single keyword
		Given I am on the homepage to do a single keyword search
		Then I do a single keyword search for (...)

	@srch02
	Scenario: srch01 - Do a invalid search with a single keyword
		Given I navigate back to homepage to do a single keyword search
		Then I do an invalid single keyword search for (...)