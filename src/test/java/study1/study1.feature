

Feature: Title of your feature
  I want to use this template for my feature file

 
  Scenario: Title of your scenario
   Given user opens the application
    And user clicks on signup button
    Then user clicks username as "vidhyaravi"
    When user enters firstname as "Vidhya"
    And and user enters lastname  as "ravi"
    And password is "1998" in the password field 
    Then password is "1998" in the confirm password field
    And user clicks gender
    Then user enters "vidhyashreeravi98@gmail.com" in the Email field
    And user enters mobile no as "9940695549"
    Then user passes dob 
    And user enters address as "chennai"
    Then user selects security question as "What is your Birth place?"
    And user enters "chennai" in the Answer field
    When user click on register
    And registration is sucessfull
    