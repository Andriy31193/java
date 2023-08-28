package com.company.homeWorks.hw6;

import com.company.homeWorks.interfaces.IHW;
import com.company.homeWorks.hw6.models.*;
import com.company.homeWorks.hw6.models.exceptions.*;

public class HomeWork6 implements IHW {

    @Override
    public void solve() {
        setup();
    }

    public void setup()
    {
        Bank bank = new Bank(2);

        try {
            bank.loadMoney(0, 100, 10);
            bank.loadMoney(0, 50, 20);
            bank.loadMoney(1, 20, 15);
            bank.loadMoney(1, 10, 30);
        } catch (InvalidDenominationException e) {
            System.out.println("Invalid denomination: " + e.getMessage());
        }

        System.out.println("Total money in the bank: $" + bank.getTotalBankMoney());

        try {
            int withdrawnAmount = bank.atms[0].withdraw(100);
            System.out.println("Withdrawn amount: $" + withdrawnAmount);
            System.out.println("Remaining money in ATM 1: $" + bank.atms[0].getTotalMoney());
        } catch (ATMException e) {
            System.out.println("ATM Error: " + e.getMessage());
        }
    }
}