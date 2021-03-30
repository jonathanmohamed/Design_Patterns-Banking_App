package com.BankingApp.insurances;

import com.BankingApp.accounts.Account;

public class HousingAccountInsurance extends com.BankingApp.insurances.AccountInsuranceDecorator {

    private final static double insuranceCost = 230.99;
    private final static int duration = 10;
    public HousingAccountInsurance(Account account){
        super(account);
    }

    public static int getDuration() {
        return duration;
    }

    public double getAccountBalance() {
        return super.getAccountBalance() - insuranceCost;
    }


}
