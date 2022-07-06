package org.example.shopsetting.store;

import java.util.*;

public class Product {
    private String category;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return category.equals(product.category) && name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, name);
    }

    private String name;

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private int quantity;
    private double unitPrice;

    public Product(String category, String name, int quantity, double unitPrice) {
        this.category = category;
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "Products: " + "\n" +
                "category= " + category + '\n' +
                "product= " + name + "\n" +
                "quantity=" + quantity + "\n" +
                "unitPrice: " + unitPrice + "\n";
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

}
