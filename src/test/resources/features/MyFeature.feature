Feature: Is it Weekend yet?
  Everybody wants to know when it's Weekend

  Scenario Outline: Today is or is not Weekend
    Given today is "<day>"
    When I ask whether it's Weekend yet
    Then I should be told "<answer>"

    Examples:
      | day | answer |
      | Friday | Nope |
      | Sunday | Yeah |
      | anything else! | Nope |




