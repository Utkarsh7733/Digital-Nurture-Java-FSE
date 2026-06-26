package com.cognizant.adapter;

public class StripeGateway {

    public void makePayment(double amount) {
        System.out.println("Payment of " + amount + " processed using Stripe.");
    }
}