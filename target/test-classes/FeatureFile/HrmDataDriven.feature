Feature: Test Orange HRM Application

  Scenario Outline: Test login functionality for data driven test
    Given Open HRM application
    When User enters username "<Un>" and enters password "<Psw>"
    When User clicks on login button from login pannel
    Then User should able to login and navigate to dashboard page

    Examples: 
      | Un      | Psw      |
      | Admin   | admin123 |
      | Abhinav | test123  |
      | Admin   | admin123 |
      | Kumar   | test566  |
