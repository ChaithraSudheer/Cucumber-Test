Feature: Test OpenCart application

  Scenario: Test Register feature with valid data using Data table class
    Given Open Register page of opencart application
    When I enter required field with valid data
      | fname | lastname | email           | tel        | psw      | pswconf  |
      | megha | rani     | megha24@gmail.com | 7788775544 | test@123 | test@123 |
    When I click on Yes radio button
    When I click on privacy policy
    When I click on continue button
    Then I should able to register in opencart
