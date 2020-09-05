package de.ikor.cucumber.operations;

import de.ikor.cucumber.service.LoanCalculatorService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
@RequiredArgsConstructor
public class MoneyLoan {

    private final LoanCalculatorService loanCalculatorService;

    private Boolean haveUnpaidDebts;

    public String loan(Integer paycheck) {
        return loanCalculatorService.isLoanAllowed(paycheck, haveUnpaidDebts);
    }
}
