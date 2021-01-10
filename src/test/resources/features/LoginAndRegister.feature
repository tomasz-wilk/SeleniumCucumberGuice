Feature: Login And Register

  Scenario: Verify successful login to Application
    Given I open Login page
    When I fill credentials and submit
    Then I am logged in

  Scenario: Verify unsuccessful login with invalid credentials
    Given I open Login page
    When I put invalid credentials and submit
    Then I am not logged in
    And I got wrong credentials message

  Scenario: Verify successful registration of new user
    Given I open Login page
    When I open registration view
    And I fill new account credentials and submit
    Then new account is created