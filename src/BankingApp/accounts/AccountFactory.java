package BankingApp.accounts;

import BankingApp.person.User;

import java.util.Random;

public class AccountFactory {
    private final static int leftLimit = 9999;
    private final static int rightLimit = 99999;

    public AccountFactory() {
    }

    public Account createAccount(String accountType, User user) {
        Account account;
        int accountNumber = leftLimit + (int) (new Random().nextFloat() * (rightLimit - leftLimit));
        account = switch (accountType) {
            case "premium" -> new Premium(user, accountNumber);
            case "student" -> new Student(user, accountNumber);
            default -> new Standard(user, accountNumber);
        };
        return account;
    }
}
