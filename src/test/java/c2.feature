
Feature: login
  I want to use this template for my feature file


  Scenario Outline: Login
    Given login page is  displayed
    And user gives "<username>" 
    When user gives "<password>" 

    
Examples:
  
    |username | password   |
    |Lalitha  | Password123|