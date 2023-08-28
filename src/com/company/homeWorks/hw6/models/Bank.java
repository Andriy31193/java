package com.company.homeWorks.hw6.models;

import com.company.homeWorks.hw6.models.exceptions.InvalidDenominationException;

public class Bank {
    public ATM[] atms;

    public Bank(int numATMs) {
        atms = new ATM[numATMs];
        for (int i = 0; i < numATMs; i++) {
            atms[i] = new ATM(10, 50);
        }
    }

    public void loadMoney(int atmIndex, int denomination, int count) throws InvalidDenominationException {
        if (atmIndex >= 0 && atmIndex < atms.length) {
            atms[atmIndex].loadMoney(denomination, count);
        }
    }

    public int getTotalBankMoney() {
        int total = 0;
        for (ATM atm : atms) {
            total += atm.getTotalMoney();
        }
        return total;
    }
}
