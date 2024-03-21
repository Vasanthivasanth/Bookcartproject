Feature: Bookcart application demo
#@smoke
  Background: 
  Given Launch the browser "chrome"
  When Navigate to the Bookcart application "https://bookcart.azurewebsites.net/"

  Scenario: 
    Given User click the login button
    Then user enter the username "vasantha"
    Then user enter the password "Vasa1234"
    When User click or enter the login button
    Then Login should be successful

  Scenario: 
    Given User click login btn1
    Then user enter the Username1 "ortoni"
    Then user enter the Password1 "pass12"
    When user click the login button1
    Then Login should be failed
