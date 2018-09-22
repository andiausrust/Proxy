package com.andi;

public class Main {

    public static void main(String[] args) {

        Bank bank = new ProxyBank();

        try {
            bank.withdrawMoney("Andi");
            bank.withdrawMoney("xXcx");


        } catch (Exception e) {
            e.printStackTrace();
        }

        }
}
