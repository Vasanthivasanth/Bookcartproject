Feature: Bookcart application demo

  Background: 
    Given user navigate the bookcart appliction
    And User clicks on the login button

  @smoke
  Scenario: 
    Given User enter the username as "vasantha"
    And user enter the password as "Vasa1234"
    When user click the login button
    Then Login should be success

  @reg
  Scenario: 
    Given User enter the username
    And user enter the password
    When user click the login button
    Then login should be fail
