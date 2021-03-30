package BankingApp.account;

import BankingApp.Exceptions.InsufficientFundsException;
import BankingApp.Person.User;
import BankingApp.message.Message;
import BankingApp.payments.CardPayment;

import java.util.ArrayList;

public class Standard implements Account {

    protected double money;
    protected ArrayList<String> transactionHistory;
    protected int accountNumber;
    protected User user;
    protected ArrayList<Message> messages;
    private final static double interestRate = 1.5;


    public Standard(User user, int accountNumber) {
        this.user = user;
        this.accountNumber = accountNumber;
        this.messages = new ArrayList<>();
    }

    @Override
    public String getAccountDetails() {
        return "Account number: " + this.accountNumber + "My account name: " + this.user.getName();
    }

    @Override
    public double getAccountBalance() {
        return this.money;
    }

    @Override
    public ArrayList<Message> getMessages() {
        return this.messages;
    }

    @Override
    public void setMessages(Message message) {
        this.messages.add(message);
    }

    @Override
    public void setAccountBalance(double money) {
        this.money = money;
    }

    @Override
    public ArrayList<String> getTransactionHistory() {
        return this.transactionHistory;
    }

    @Override
    public int getAccountNumber() {
        return this.accountNumber;
    }

    @Override
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public void makePayment(CardPayment cardPayments, double cost) throws InsufficientFundsException {
        this.money -= cost;
        if (money < cost) {
            throw new InsufficientFundsException();
        }
        cardPayments.makePayment(cost);
    }

    public void depositMoney(double amountToDeposit) {
        double money = amountToDeposit + ((amountToDeposit * interestRate) / 100);
        this.money += money;
    }
}
