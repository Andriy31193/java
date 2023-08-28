package com.company.homeWorks.hw6.models;
import java.util.HashMap;
import java.util.Map;
import com.company.homeWorks.hw6.models.exceptions.*;

public class ATM {
    private Map<Integer, Integer> denominations;
    private int minWithdrawal;
    private int maxNotes;

    public ATM(int minWithdrawal, int maxNotes) {
        this.minWithdrawal = minWithdrawal;
        this.maxNotes = maxNotes;
        this.denominations = new HashMap<>();
    }

    public void loadMoney(int denomination, int count) throws InvalidDenominationException {
        if (isValidDenomination(denomination)) {
            denominations.put(denomination, count);
        } else {
            throw new InvalidDenominationException(denomination);
        }
    }

    public void deposit(int denomination, int count) throws InvalidDenominationException {
        if (isValidDenomination(denomination)) {
            denominations.put(denomination, denominations.getOrDefault(denomination, 0) + count);
        } else {
            throw new InvalidDenominationException(denomination);
        }
    }

    public int getTotalMoney() {
        int totalMoney = 0;
        for (Map.Entry<Integer, Integer> entry : denominations.entrySet()) {
            totalMoney += entry.getKey() * entry.getValue();
        }
        return totalMoney;
    }

    public int withdraw(int amount) throws ATMException {
        if (amount < minWithdrawal) {
            throw new ATMException("Withdrawal amount is less than the minimum allowed.");
        }

        int remainingAmount = amount;
        int notesCount = 0;
        for (int denomination : new int[]{500, 200, 100, 50, 20, 10, 5, 2, 1}) {
            if (remainingAmount >= denomination && denominations.containsKey(denomination)) {
                int notesToWithdraw = Math.min(remainingAmount / denomination, denominations.get(denomination));
                remainingAmount -= notesToWithdraw * denomination;
                notesCount += notesToWithdraw;
                denominations.put(denomination, denominations.get(denomination) - notesToWithdraw);
            }
        }

        if (remainingAmount == 0 && notesCount <= maxNotes) {
            return amount;
        } else if (remainingAmount != 0) {
            throw new NotEnoughFundsException();
        } else {
            throw new ATMException("Exceeded maximum number of notes that can be withdrawn.");
        }
    }

    private boolean isValidDenomination(int denomination) {
        return denomination == 1 || denomination == 2 || denomination == 5 ||
                denomination == 10 || denomination == 20 || denomination == 50 ||
                denomination == 100 || denomination == 200 || denomination == 500;
    }
}