package BankingApp.accounts;

import BankingApp.exceptions.InsufficientFundsException;
import BankingApp.message.Message;
import BankingApp.payments.CardPayment;

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
