package com.paymentgateway;

public interface BankAPI {
    double checkBalance(String accountDetails);

    boolean transferFunds(String fromAccount, String toAccount, double amount);
}
