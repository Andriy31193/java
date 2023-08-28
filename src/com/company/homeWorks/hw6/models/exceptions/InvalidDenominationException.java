package com.company.homeWorks.hw6.models.exceptions;

public class InvalidDenominationException extends ATMException {
    public InvalidDenominationException(int denomination) {
        super("Invalid denomination: " + denomination);
    }
}