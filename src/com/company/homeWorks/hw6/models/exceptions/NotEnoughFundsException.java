package com.company.homeWorks.hw6.models.exceptions;

public class NotEnoughFundsException extends ATMException {
    public NotEnoughFundsException() {
        super("Not enough funds in the ATM.");
    }
}
