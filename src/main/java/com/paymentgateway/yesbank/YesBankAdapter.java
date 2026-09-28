package com.paymentgateway.yesbank;

import com.paymentgateway.BankAPI;

public class YesBankAdapter implements BankAPI {
    private YesBank yesBank;


    public YesBankAdapter(com.paymentgateway.yesbank.YesBank yesBank) {
        this.yesBank = yesBank;
    }

    @Override
    public double checkBalance(String accountDetails) {

        return yesBank.fetchBalance(accountDetails);
    }

    @Override
    public boolean transferFunds(String fromAccount, String toAccount, double amount) {

        return yesBank.processNEFT(fromAccount, toAccount, amount);
    }
}
