Feature: Money withdrawal

  Scenario: Withdraw zero money
    Given Account balance is 100
    When I try to withdraw 0
    Then return 'Please enter amount.'

  Scenario: Successful withdrawal
    Given Account balance is 100
    When I try to withdraw 50
    Then return 'Success.'

  Scenario: Try to withdraw more then available
    Given Account balance is 100
    When I try to withdraw 150
    Then return 'You don't have enough money.'
