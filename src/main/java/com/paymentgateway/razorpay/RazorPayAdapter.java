package com.paymentgateway.razorpay;

import com.paymentgateway.BankAPI;

public class RazorPayAdapter implements BankAPI {
    private RazorPay razorPay;

    public RazorPayAdapter(RazorPay razorPay) {
        this.razorPay = razorPay;
    }

    @Override
    public double checkBalance(String accountDetails) {

        return razorPay.getBalance(accountDetails);
    }

    @Override
    public boolean transferFunds(String fromAccount, String toAccount, double amount) {
        String status = razorPay.doPayment(fromAccount, toAccount, amount);
        return status.equals("TXN_SUCCESS");
    }
}
