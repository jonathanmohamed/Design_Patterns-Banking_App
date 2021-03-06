package BankingApp.person;

import BankingApp.accounts.Account;
import BankingApp.bank.Bank;
import BankingApp.message.Message;

import java.util.ArrayList;

public class User {
    private final String name;
    private ArrayList<Account> accounts;
    private ArrayList<Message> messages;

    public User(String name) {
        this.name = name;
    }

    public ArrayList<Message> getMessages() {
        return this.messages;
    }

    public void openAllMessages() {
        for (Message message : this.messages) {
            message.openMessage();
        }
    }

    public void printAccountDetails() {
        for (Account account : this.accounts) {
            System.out.println(account.getAccountDetails());
        }
    }

    public void createAccount(String accountType, Bank bank) {
        bank.createAccount(accountType, this);
    }

    public String getName() {
        return this.name;
    }
}
