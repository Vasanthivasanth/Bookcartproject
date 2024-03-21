Feature: Shopping for OrangeSRM

  Scenario: Login page should be success
    Given User enter the username as "Admin"
    And User enter the password as "admin123"
    And user clicl the login button
    When Login should be success
    
    
 Scenario: Login page should be Failed
    Given User enter the username  "Adminn"
    And User enter the password  "admin1234"
    And user click the login button
    When Login should be failed
    