package com.cognizant.adapter;

public class PayPalGateway {

    public void sendPayment(double amount) {
        System.out.println("Payment of " + amount + " processed using PayPal.");
    }
}