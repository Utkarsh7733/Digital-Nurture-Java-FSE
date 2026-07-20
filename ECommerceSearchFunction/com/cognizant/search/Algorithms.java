package com.cognizant.search;

public class Algorithms {

    public static Product linearSearch(Product[] products, int id) {

        for (Product product : products) {
            if (product.getProductId() == id) {
                return product;
            }
        }

        return null;
    }

    public static Product binarySearch(Product[] products, int id) {

        int low = 0;
        int high = products.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (products[mid].getProductId() == id)
                return products[mid];

            if (products[mid].getProductId() < id)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return null;
    }
}