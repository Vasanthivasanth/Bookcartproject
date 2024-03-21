Feature: Bookcart application shopping

Background: 
  Given Launch the browser "chrome"
  When Navigate to the Bookcart application "https://bookcart.azurewebsites.net/"

  Scenario Outline: 
    Given User click the login btn
    Then User enter the "<Username>"
    Then User enter "<Password>"
    When Click the login button
    Then user search the "<Book>"
    Then user add the book into cart

    Examples: 
      | Username | Password | Book       |
      | vasantha | Vasa1234 | Rot & Ruin |
      | ortoni   | pass123  | Roomies    |
