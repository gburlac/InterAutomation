Feature:Order products on OpenCart

  Scenario: Reserve Products on OpenCart
    Given User is on the OpenCart page
    When Login on OpenCart
      | testing6@gmail.com | parola123 |
    And Add product to cart
    Then Check product is in cart
    When Remove from cart
    Then Verify cart is empty
    When Add multiple products to cart
   # And Remove one product from cart
    #Then Verify removed product from cart