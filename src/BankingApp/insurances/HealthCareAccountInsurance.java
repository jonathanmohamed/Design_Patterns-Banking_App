package com.BankingApp.insurances;

import com.BankingApp.accounts.Account;

public class HealthCareAccountInsurance extends AccountInsuranceDecorator {

    private final static double insuranceCost = 109.99;
    private final static int duration = 5;

    public HealthCareAccountInsurance(Account account){
        super(account);
    }

    public static int getDuration() {
        return duration;
    }

    public double getAccountBalance() {
        return super.getAccountBalance() - insuranceCost;
    }



}
