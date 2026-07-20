package com.cognizant.inventory;

public class Main {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        inventory.addProduct(new Product(101, "Laptop", 10, 50000));
        inventory.addProduct(new Product(102, "Mouse", 20, 800));
        inventory.addProduct(new Product(103, "Keyboard", 15, 1500));

        System.out.println("Products:");

        inventory.displayProducts();

        inventory.updateProduct(102, 30, 900);

        System.out.println("\nAfter Update:");

        inventory.displayProducts();

        inventory.deleteProduct(101);

        System.out.println("\nAfter Delete:");

        inventory.displayProducts();
    }
}