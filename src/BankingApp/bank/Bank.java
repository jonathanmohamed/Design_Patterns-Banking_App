package BankingApp.bank;

import BankingApp.accounts.Account;
import BankingApp.accounts.AccountFactory;
import BankingApp.message.Message;
import BankingApp.person.User;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts;
    private AccountFactory accountFactory;

    public Bank() {
        this.accountFactory = new AccountFactory();
        this.accounts = new ArrayList<>();
    }

    public void createAccount(String accountType, User user) {
        accountFactory.createAccount(accountType, user);
    }

    public void sendMessage(String message) {
        for (Account account: this.accounts) {
            account.setMessages(new Message(message));
        }
    }
}
