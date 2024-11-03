Feature: Test for Open Cart Application

  Scenario: Test for Cart Login with valid data
    Given Open Cart Login page
    When I enter valid credentials for login
      | email             | Password |
      | megha24@gmail.com | test@123 |
    When I click login button
    Then I should able to login to opencart application
