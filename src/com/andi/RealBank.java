package com.andi;

public class RealBank implements Bank {

    @Override
    public void withdrawMoney(String clientName) throws Exception {
        System.out.println("Withdrawing from the ATM ...: " + clientName);
    }
}
