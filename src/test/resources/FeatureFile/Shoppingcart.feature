Feature: Test for Shopping Cart

  Scenario: Add product to the shopping cart
    Given Open the product page
    When I click on the add to cart button
    Then Product shoud be added to cart page
