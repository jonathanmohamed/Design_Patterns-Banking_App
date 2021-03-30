package com.isaac.jonathan.vu.account;

import com.BankingApp.Exceptions.InsufficientFundsException;
import com.BankingApp.message.Message;
import com.BankingApp.payments.CardPayment;

import java.util.ArrayList;

public interface Account {

    String getAccountDetails();

    double getAccountBalance();

    ArrayList<Message> getMessages();

    void setMessages(Message message);

    void setAccountBalance(double money);

    ArrayList<String> getTransactionHistory();

    int getAccountNumber();

    void setAccountNumber(int accountNumber);

    void makePayment(CardPayment cardPayments, double cost) throws InsufficientFundsException;

    void depositMoney(double amountToDeposit);

}
