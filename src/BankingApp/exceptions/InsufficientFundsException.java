package BankingApp.exceptions;

/**
 * InsufficientFundsException
 */
public class InsufficientFundsException extends Exception {
    public InsufficientFundsException() {
        super("Sorry. Insufficient Balance.");
    }
}
