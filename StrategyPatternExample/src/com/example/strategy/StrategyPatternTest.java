package com.example.strategy;

public class StrategyPatternTest {

    public static void main(String[] args) {

        PaymentContext context;

        context = new PaymentContext(new CreditCardPayment());
        context.executePayment(500);

        context = new PaymentContext(new PayPalPayment());
        context.executePayment(1000);

    }
}