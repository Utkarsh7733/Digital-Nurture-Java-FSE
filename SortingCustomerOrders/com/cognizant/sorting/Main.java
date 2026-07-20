package com.cognizant.sorting;

public class Main {

    public static void main(String[] args) {

        Order[] orders = {

                new Order(101, "Rahul", 4500),
                new Order(102, "Aman", 1800),
                new Order(103, "Neha", 7200),
                new Order(104, "Priya", 3500)

        };

        System.out.println("Bubble Sort:");

        SortingAlgorithms.bubbleSort(orders);

        for (Order order : orders) {
            System.out.println(order);
        }

        System.out.println();

        Order[] quickOrders = {

                new Order(101, "Rahul", 4500),
                new Order(102, "Aman", 1800),
                new Order(103, "Neha", 7200),
                new Order(104, "Priya", 3500)

        };

        System.out.println("Quick Sort:");

        SortingAlgorithms.quickSort(quickOrders, 0, quickOrders.length - 1);

        for (Order order : quickOrders) {
            System.out.println(order);
        }
    }
}