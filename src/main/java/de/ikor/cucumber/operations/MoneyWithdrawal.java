package de.ikor.cucumber.operations;

import lombok.Data;

@Data
public class MoneyWithdrawal {

    private Integer balance;

    public String withdraw(Integer amount) {
        if (amount == 0) {
            return "Please enter amount.";
        } else if (balance > amount) {
            return "Success.";
        } else {
            return "You don't have enough money.";
        }
    }

}
