package com.andi;

import java.util.ArrayList;
import java.util.List;

public class ProxyBank implements Bank {

    private RealBank bank = new RealBank();
    private static List<String> bannnedClients;

    static {
        bannnedClients = new ArrayList<>();
        bannnedClients.add("xXcx");
        bannnedClients.add("me@me");
    }

    @Override
    public void withdrawMoney(String clientName) throws Exception {

        if(bannnedClients.contains(clientName)) {
            throw new Exception("Access Denied! You are not allowed to withdraw");
        }
        bank.withdrawMoney(clientName);
    }
}
