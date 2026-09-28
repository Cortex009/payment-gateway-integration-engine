package com.paymentgateway;

import com.paymentgateway.razorpay.RazorPay;
import com.paymentgateway.razorpay.RazorPayAdapter;
import com.paymentgateway.yesbank.YesBank;
import com.paymentgateway.yesbank.YesBankAdapter;

public class Client {
    public static void main(String[] args) {

        System.out.println("===============================");
        System.out.println("      (PhonePe + Yes Bank)     ");
        System.out.println("===============================");
        System.out.println();

        YesBank yesbank = new YesBank();

        BankAPI yesBankAPI = new YesBankAdapter(yesbank);

        PhonePe phonePeWithYesBank = new PhonePe(yesBankAPI);

        phonePeWithYesBank.displayBalance("user123");
        phonePeWithYesBank.performTransfer("user123", "merchant456", 1500.00);

        System.out.println();
        System.out.println("===============================");
        System.out.println("      (PhonePe + Razorpay)     ");
        System.out.println("===============================");
        System.out.println();

        RazorPay razorpay = new RazorPay();

        BankAPI razorpayAPI = new RazorPayAdapter(razorpay);

        PhonePe phonePeWithRazorPay = new PhonePe(razorpayAPI);

        phonePeWithRazorPay.displayBalance("token999");
        phonePeWithRazorPay.performTransfer("token999", "merchant456", 2500.00);
    }
}
