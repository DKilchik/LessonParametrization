@regressionPack
Feature: Store


  Scenario: User buy a phone
    Given application is opened
    When user select "phone" category
    # vAnd user click to first item in the list
    Then device page should be opened
    When user click to Add to Cart button
    And confirm alert notification
    And user navigate to Cart Page
    Then product should be in the cart
    When user click to Place Order button
    And fill form with valid date
    And click to Purchase button