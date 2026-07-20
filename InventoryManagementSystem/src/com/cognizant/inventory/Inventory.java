package com.cognizant.inventory;

import java.util.HashMap;

public class Inventory {

    private HashMap<Integer, Product> products = new HashMap<>();

    public void addProduct(Product product) {
        products.put(product.getProductId(), product);
    }

    public void updateProduct(int id, int quantity, double price) {
        Product product = products.get(id);

        if (product != null) {
            product.setQuantity(quantity);
            product.setPrice(price);
        }
    }

    public void deleteProduct(int id) {
        products.remove(id);
    }

    public void displayProducts() {
        for (Product product : products.values()) {
            System.out.println(product);
        }
    }
}