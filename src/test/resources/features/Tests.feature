Feature:

  Scenario: Successful login and completing order
    Given the user is on the login page
    And the user enters valid username and password
    And the user clicks on the login button
    Then the user is redirected to the product list page
    And the user adds T-shirt, BikeLight and Jacket to the cart
    Then the cart count should change
    Then the user clicks on the cart button
    And the user enters valid shipping data
    Then the user clicks on the continue button
    Then the user checks if the total sum is correct
    And the user clicks on the finish button
    And the user should be redirected to the completed order page

