package org.example.shopsetting.store;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashierTest {
    Product product = new Product("Bags", 500, 3);
    @Test
    void iCanSellAndGiveReceipts() {
        Cashier cashier = new Cashier("Uche", "male", "2");
        cashier.iCanSellAndGiveReceipts(product);
        assertEquals(product.getAmount(), 500);
    }
}