Feature: Loan request

  Scenario: Successful loan request
    Given User have 0 unpaid debts.
    When I try to get loan with paycheck 2000
    Then response should be 'We can borrow you 10000'

  Scenario: Bad debtor - late with payment
    Given User have 2 unpaid debts.
    When I try to get loan with paycheck 2000
    Then response should be 'We can't borrow you money.'

  Scenario: Bad debtor
    Given User have 10 unpaid debts.
    When I try to get loan with paycheck 2000
    Then response should be 'We can't borrow you money.'

  Scenario: Small monthly earnings
    Given User have 0 unpaid debts.
    When I try to get loan with paycheck 500
    Then response should be 'We can't borrow you money.'
