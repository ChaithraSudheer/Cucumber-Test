@All
Feature: Test for Amazon

  Background: 
    Given Open Amzon application

  @HomePage
  Scenario: Test for Home Page Title
    When user capture the actual home page title
    Then Title should be matched with expected home page Title

  @Bestsellers
  Scenario: Test for Bestsellers title
    When user opens Bestsellers page
    When user captures Best Sellers acutal title
    Then Title should be matched with BestSellers expected Title
  
  @ignore
  #@Mobiles
  Scenario: Test for  Mobile page title
    When user opens mobiles page
    When user captures Mobiles page actual title
    Then Tile should be matched with Mobiles page expected title

  @ignore
  #@Todaysdeal
  Scenario: Test for TodaysDeal page title
    When user opens Todays Deal page
    When user captures todaysdeal page actual title
    Then Title should be matched with Todaysdeal page expected title
