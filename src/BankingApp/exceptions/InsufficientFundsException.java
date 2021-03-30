package com.BankingApp.Exceptions;

/**
 * InsufficientFundsException
 */
public class InsufficientFundsException extends Exception {
    public InsufficientFundsException() {
        super("Sorry. Insufficient Balance.");
    }
}
