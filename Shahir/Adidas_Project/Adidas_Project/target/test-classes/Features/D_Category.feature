@tag
Feature: 4 Selecting various option in category menu
  I want to use this template for my feature file

  @tag1
  Scenario: Adding a product from sports and proceeding to checkout
    Given I want to launch application
    When I want to load Sports menu
    
	@tag2
  Scenario: Adding a product from shop and proceeding to checkout
    Given I want to go to home page
    When I want to load Shop menu
    
  Scenario: Adding a product from shop and proceeding to checkout
    Given I want to go to home page again
    When I want to load Brand menu