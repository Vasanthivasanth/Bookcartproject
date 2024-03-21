Feature: Bookcart application

  Scenario Outline: Login Book cart
    Given Existing User click the login button
    And user enter the "<username>" and "<password>"
    And Click the login button
    And search the book name "<Book>"
    And Add the book into Add to cart
    When Verify the book added into the cart

    Examples: 
      | username | password | Book |
      | vsantha  | Vasa1234 | HP2  |
      | vasant   | Vasa12   | HP2  |
