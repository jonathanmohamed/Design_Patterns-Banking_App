package com.BankingApp.insurances;

import com.BankingApp.Exceptions.InsufficientFundsException;
import com.BankingApp.accounts.Account;
import com.BankingApp.message.Message;
import com.BankingApp.payments.CardPayment;

import java.util.ArrayList;

public abstract class AccountInsuranceDecorator implements Account{
    private Account account;

    public AccountInsuranceDecorator(Account account) {
        this.account = account;
    }

    public String getAccountDetails() {
        return this.account.getAccountDetails();
    }

    public double getAccountBalance() {
        return this.account.getAccountBalance();
    }

    @Override
    public ArrayList<Message> getMessages() {
        return this.account.getMessages();
    }

    @Override
    public void setMessages(Message message) {
        this.account.setMessages(message);
    }

    @Override
    public void setAccountBalance(double money) {
        this.account.setAccountBalance(money);
    }

    @Override
    public ArrayList<String> getTransactionHistory() {
        return this.account.getTransactionHistory();
    }

    @Override
    public int getAccountNumber() {
        return this.account.getAccountNumber();
    }

    @Override
    public void setAccountNumber(int accountNumber) {
        this.account.setAccountNumber(accountNumber);
    }

    @Override
    public void makePayment(CardPayment cardPayments, double cost) throws InsufficientFundsException {
        this.account.makePayment(cardPayments, cost);
    }

    @Override
    public void depositMoney(double amountToDeposit) {
        this.account.depositMoney(amountToDeposit);
    }

}
