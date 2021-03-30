package BankingApp.account;

import com.BankingApp.Exceptions.InsufficientFundsException;
import com.BankingApp.Person.User;
import com.BankingApp.message.Message;
import com.BankingApp.payments.CardPayment;

import java.util.ArrayList;

public class Premium implements Account {

    protected double money;
    protected ArrayList<String> transactionHistory;
    protected int accountNumber;
    protected User user;
    protected ArrayList<Message> messages;

    private final static double interestRate = 2.5;

    public Premium(User user, int accountNumber) {
        this.user = user;
        this.accountNumber = accountNumber;
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
        return null;
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
        double money = amountToDeposit + ((amountToDeposit * interestRate)/100);
        this.money += money;
    }
}

