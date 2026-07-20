package com.cognizant.search;

public class Main {

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Keyboard", "Electronics"),
                new Product(103, "Mouse", "Electronics"),
                new Product(104, "Shoes", "Fashion")
        };

        System.out.println("Linear Search:");

        System.out.println(
                Algorithms.linearSearch(products, 103)
        );

        System.out.println();

        System.out.println("Binary Search:");

        System.out.println(
                Algorithms.binarySearch(products, 103)
        );
    }
}