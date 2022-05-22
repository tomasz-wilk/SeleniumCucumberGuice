Feature: Search product

  @predefinedCookie
  Scenario: Search for product
    Given I am on main page
    When I search for "watch"
    Then There are 4 available products

  @predefinedCookie
  Scenario: Search for not existing product
    Given I am on main page
    When I search for "not existing product"
    Then there are no found products