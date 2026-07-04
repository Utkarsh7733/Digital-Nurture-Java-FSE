package com.cognizant.proxy;

public class Main {

    public static void main(String[] args) {

        Image image = new ProxyImage("Nature.jpg");

        image.display();

        System.out.println();

        image.display();
    }
}