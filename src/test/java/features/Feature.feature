# This is will have a single flow to run it in same session
Feature: End-to-end scenario covering login, product selection, cart validation, and checkout

  Scenario: Validate that the user is able to Login
    Given the user is able to login
    Then the user is able to verify the account
    And the user navigates to the Books page
    And the user selects a book and adds it to the cart
    And the user searches for a product using the search bar
    Then the user retrieves the product details and adds it to the cart
    And the user navigates to the cart
    Then the user verifies the items in the cart along with the retrieved details
    Then the user navigates to checkout
    And the user verifies the products again on the checkout page
    Then the user proceeds with placing the order