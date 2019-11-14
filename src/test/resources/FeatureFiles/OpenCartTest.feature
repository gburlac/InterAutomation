Feature:Practice order products on OpenCart

  Scenario: Reserve Products on OpenCart
    Given I am on the OpenCart page
    When Login on OpenCart
    And Add product to cart
    Then Check product is in cart