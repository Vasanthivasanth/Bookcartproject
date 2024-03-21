Feature: Bookcart application project
@tag
  Scenario Outline: Bookcart login page
    Given user clicks login button
    Then user enter the username "<Username>"
    Then user enter the password "<Password>"
    Then user click the login button
    When user search the book "<Book>"
    And add the book into the cart

    Examples: 
      | Username | Password | Book    |
      | vasantha | Vasa1234 | Robbie  |
      | ortoni   | pass1234 | Roomies |
