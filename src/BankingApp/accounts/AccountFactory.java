package BankingApp.accounts;

import BankingApp.person.User;
import java.util.Random;

public class AccountFactory {
    private final static int leftLimit = 9999;
    private final static int rightLimit = 99999;

    public AccountFactory(){
    }

    public Account createAccount(String accountType, User user) {
        Account account;
        int accountNumber = leftLimit + (int) (new Random().nextFloat() * (rightLimit - leftLimit));
        switch (accountType) {
            case "premium":
                account = new Premium(user, accountNumber);
                break;
            case "student":
                account = new Student(user, accountNumber);
                break;
            default:
                account = new Standard(user, accountNumber);
        }
        return account;
    }
}
