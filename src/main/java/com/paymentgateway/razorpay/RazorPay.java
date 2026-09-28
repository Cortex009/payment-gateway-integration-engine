package com.paymentgateway.razorpay;

public class RazorPay {
    public double getBalance(String token) {
        System.out.println("RazorPay API: Checking balance using token " + token);
        return 10000.00;
    }
    public String doPayment(String payerId, String payeeId, double transactionValue) {
        System.out.println("RazorPay API: Processing payment of ₹" + transactionValue + " from " + payerId + " to " + payeeId);
        return "TXN_SUCCESS";
    }
}
