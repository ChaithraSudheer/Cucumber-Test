Feature: Test for CRM application

  Background: 
    Given Open CRM Home Page

  @Signin
  Scenario: Test for Signin Link
    When User click on Signin
    Then Signin page should be open

  @Login
  Scenario: Test for Login functionality with valid data
    When User enter valid email "test123@gmail.com" and valid password "test123"
    When User click on Submit button
    Then User should able to login and navigate to Customer page
