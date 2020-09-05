package de.ikor.cucumber.service;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class LoanCalculatorService {

    public String isLoanAllowed(Integer paycheck, Boolean haveUnpaidDebts) {
        if (paycheck < 1000 || haveUnpaidDebts) {
            return "We can't borrow you money.";
        } else {
            Integer loanAmount = paycheck * 5;
            return "We can borrow you " + loanAmount;
        }
    }
}
