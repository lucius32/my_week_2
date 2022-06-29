package org.example.shopsetting.store;

import java.util.ArrayList;

public class Product {


    private String name;
    private float amount;
    private int quantity;


    public Product(String name, float amount, int quantity) {
        this.name = name;
        this.amount = amount;
        this.quantity = quantity;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
