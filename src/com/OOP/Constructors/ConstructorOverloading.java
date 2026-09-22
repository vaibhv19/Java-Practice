package com.OOP.Constructors;

/**
 * ConstructorOverloading demonstrates multiple constructors with different parameter signatures.
 */

class Product {
    private String name;
    private double price;
    private String category;

    // Overload 1: Name only
    public Product(String name) {
        this.name = name;
        this.price = 0.0;
        this.category = "General";
    }

    // Overload 2: Name and price
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.category = "General";
    }

    // Overload 3: All fields
    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public void showDetails() {
        System.out.println("Product: " + name + " | Price: $" + price + " | Category: " + category);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Product p1 = new Product("Notebook");
        Product p2 = new Product("Mouse", 25.50);
        Product p3 = new Product("Laptop", 1200.00, "Electronics");

        p1.showDetails();
        p2.showDetails();
        p3.showDetails();
    }
}
