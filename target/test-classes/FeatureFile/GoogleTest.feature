Feature: Test for Google Application

  Background: 
    Given Open Google Application

  Scenario: Test Google page Title
    #Given Open Google Application
    When I capture current page title
    Then Title should match to Google

  Scenario: Test search field with valid keyword
    #Given open Google Application
    When I enter valid keyword in search field
    Then Valid keyword result should dispaly
