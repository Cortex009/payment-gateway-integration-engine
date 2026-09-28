package com.paymentgateway;

public class PhonePe {
    private BankAPI bankAPI;

    public PhonePe(BankAPI bankAPI) {
        this.bankAPI = bankAPI;
    }

    public void displayBalance(String accountDetails) {
        double balance = bankAPI.checkBalance(accountDetails);
        System.out.println("PhonePe UI: Your current balance is ₹" + balance);
    }

    public void performTransfer(String from, String to, double amount) {
        boolean isSuccess = bankAPI.transferFunds(from, to, amount);
        if (isSuccess) {
            System.out.println("PhonePe UI: Transfer of ₹" + amount + " was successful!");
        } else {
            System.out.println("PhonePe UI: Transfer failed. Please try again.");
        }
    }
}
