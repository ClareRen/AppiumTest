Feature: Login
  Login system should work fine

  Scenario: Login with right username and right password
    Given I open the login page
    When I set username with a right username
    And I set password with a right password
    And I click the login button
    Then I see login success