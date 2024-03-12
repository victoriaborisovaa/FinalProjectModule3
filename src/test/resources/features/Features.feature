Feature: User Login
  As a user
  I want to login in the e-commerce website
  So that I can shop on the website

  Scenario: Registered user logging in with valid username and password
  Given the user is on the login page
  When the user enter valid data
  Then the login will be successful

Feature: Product Filtering
  As a shopper
  I want to filter products on the e-commerce website
  So that I can easily find the items that match my preferences

  Scenario: Filter Products by Name (A to Z)
    Given the user is on the product listing page
    When the user selects a specific filter from the filter options
    Then the user should see the filtered products

  Scenario: Filter Products by Price (low to high)
    Given the user is on the product listing page
    When the user sets a price filter (low to high)
    Then the user should see a list of products ordered from the lowest till the highest price
    And all displayed products should have prices

  Scenario: Clearing Filters
    Given the user has applied filters on the product listing page
    When the user clicks on the selected filter button
    Then the user should see the full list of products
    And no filters should be applied

  Scenario: Persisting Filters on Navigation
    Given the user has applied filters on the product listing page
    When the user navigates to a different page and returns
    Then the applied filters should persist
    And the user should see the filtered list of products

Feature: Adding product to cart and completing order
  As a shopper
  I want to add product to the cart and complete the order
  So that I can purchase the selected item

  Scenario: Add Item to the Cart and Complete the Order
    Given the user is on the Product page
    When the user clicks on the "Add to cart" button
    Then the user should see a confirmation message that the product has been added to the cart
    And the user should see the updated cart icon with the item count

    When the user clicks on the cart icon to view the cart
    Then the user should see the added product in the cart with the correct details
    And the total price should reflect the cost of the added product

    When the user click on the "Checkout" button
    Then the user should be directed to the checkout page
    And the user should see the added product in the order summary

    When the user provides valid shipping information
    And selects a valid payment method
    And clicks the "Place Order" button
    Then the user should see an order confirmation message

