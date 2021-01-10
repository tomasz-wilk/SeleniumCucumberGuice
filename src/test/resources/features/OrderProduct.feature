Feature: Order product

  Scenario: Verify adding product to cart
    Given I am on main page
    When I select first product from Search dropdown
    And I add product to the cart
    Then product is successfully added to the cart

  Scenario: Verify checkout of the product
    Given I am on main page
    And I am logged in to store
    When I select first product from Search dropdown
    And I add product to the cart
    And I checkout the product
    Then I am navigated to payment page
