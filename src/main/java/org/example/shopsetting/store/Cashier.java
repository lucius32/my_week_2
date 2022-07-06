package org.example.shopsetting.store;

import org.example.shopsetting.interfaces.CashierDuty;

import java.util.List;

public class Cashier extends Staff implements CashierDuty {

    public Cashier(String name, String identity, String staffId) {
        super(name, identity, staffId);
    }

    @Override
    public void iCanSellAndGiveReceipts(List<Product> products, String s) {

    }

    @Override
    public void iCanSellAndGiveReceipts(Product product) {

    }
}
