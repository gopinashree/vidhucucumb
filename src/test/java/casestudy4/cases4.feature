
Feature: Title of your feature
  I want to use this template for my feature file

 


  Scenario Outline: Title of your scenario outline
    Given user enters homepage
    When users enters "<item>"  search bar
    Then user enters find details
    And user tries to add to cart
    Then he will be asked for login details

    Examples:
      | item  |
      | bag   |    
  
