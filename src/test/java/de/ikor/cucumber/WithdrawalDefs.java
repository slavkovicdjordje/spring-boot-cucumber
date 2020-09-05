package de.ikor.cucumber;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import de.ikor.cucumber.operations.MoneyWithdrawal;

import static org.junit.Assert.assertEquals;

public class WithdrawalDefs {

    private String result;
    private MoneyWithdrawal moneyWithdrawal;

    @Before
    public void beforeScenario() {
        moneyWithdrawal = new MoneyWithdrawal();
    }

    @Given("^Account balance is (\\d+)$")
    public void accountBalanceIs(Integer balance) {
        moneyWithdrawal.setBalance(balance);
    }

    @When("^I try to withdraw (\\d+)$")
    public void iTryToWithdraw(Integer amount) {
        result = moneyWithdrawal.withdraw(amount);
    }

    @Then("^return '(.*?)'$")
    public void validateResult(String expected) {
        assertEquals(expected, result);
    }

}
