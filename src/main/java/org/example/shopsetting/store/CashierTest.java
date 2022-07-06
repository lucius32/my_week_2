package org.example.shopsetting.store;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashierTest {
    Product product = new Product("Cookies", "ArrowRoot", 77, 2.18);
    @Test
    void iCanSellAndGiveReceipts() {
        Cashier cashier = new Cashier("Uche", "male", "2");
        cashier.iCanSellAndGiveReceipts(product);
        assertEquals(product.getUnitPrice(), 500);
    }
}