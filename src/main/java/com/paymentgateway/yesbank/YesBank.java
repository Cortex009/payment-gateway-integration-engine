package com.paymentgateway.yesbank;

public class YesBank {
    public double fetchBalance(String accountNum) {
        System.out.println("YesBank API: Fetching balance for account " + accountNum);
        return 5000.00;
    }


    public boolean processNEFT(String source, String destination, double amt) {
        System.out.println("YesBank API: Processing NEFT transfer of ₹" + amt + " from " + source + " to " + destination);
        return true; // Simulating a successful transfer
    }
}
