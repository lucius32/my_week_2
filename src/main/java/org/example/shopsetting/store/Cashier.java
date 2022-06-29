package org.example.shopsetting.store;

import org.example.shopsetting.interfaces.CashierDuty;

public class Cashier extends Staff implements CashierDuty {

    public Cashier(String name, String identity, String staffId) {
        super(name, identity, staffId);
    }

    @Override
    public void iCanSellAndGiveReceipts(Product product) {
        if (product.getAmount() > 0) {
            System.out.println("ProductName: " + product.getName() + " Quantity: " + product.getQuantity() + " totalPrice: " + product.getAmount()* product.getQuantity());
            System.out.println("Thanks for your patronage");
        }else {
            System.out.println("Sorry, you don't have enough balance");
        }
    }


}
