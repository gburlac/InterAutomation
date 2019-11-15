Feature:Order products on OpenCart

  Scenario: Reserve Products on OpenCart
    Given User is on the OpenCart page
    When Login on OpenCart
      | testing6@gmail.com | parola123 |
    And Add product to cart
    Then Check product is in cart