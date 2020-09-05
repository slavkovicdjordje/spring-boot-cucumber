package de.ikor.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import de.ikor.cucumber.operations.MoneyLoan;
import lombok.RequiredArgsConstructor;

import static org.junit.Assert.assertEquals;

@RequiredArgsConstructor
public class LoanDefs extends SpringBootITTest {

    private String result;
    private final MoneyLoan moneyLoan;

    @Given("^User have (\\d+) unpaid debts.$")
    public void userUnpaidDebtsSetup(Integer unpaidDebts) {
        if (unpaidDebts > 0) {
            moneyLoan.setHaveUnpaidDebts(true);
        } else {
            moneyLoan.setHaveUnpaidDebts(false);
        }
    }

    @When("^I try to get loan with paycheck (\\d+)$")
    public void iTryToGetLoan(Integer paycheck) {
        result = moneyLoan.loan(paycheck);
    }

    @Then("^response should be '(.*?)'$")
    public void responseValidation(String expected) {
        assertEquals(expected, result);
    }

}
