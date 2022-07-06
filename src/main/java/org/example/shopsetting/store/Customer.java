package org.example.shopsetting.store;


import org.example.shopsetting.interfaces.CustomerDuty;

public class Customer implements CustomerDuty {
    private float wallet;

    public Customer(float wallet) {
        this.wallet = wallet;
    }

    @Override
    public void iCanBuy(Product product) {
        if (product.getQuantity() < product.getUnitPrice()) {
            System.out.println("I can't afford it");
        }

    }
}