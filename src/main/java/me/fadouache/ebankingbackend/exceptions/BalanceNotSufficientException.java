package me.fadouache.ebankingbackend.exceptions;

public class BalanceNotSufficientException extends Exception {
    public BalanceNotSufficientException(String s) {
        super(s);
    }
}
