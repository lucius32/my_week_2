package org.example.shopsetting.store;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {
    Manager manager = new Manager("Joe", "male", "1");



    @Test
    void iCanHire() {
        Cashier cashier = new Cashier("Oge", "applicant", "2");
        manager.iCanHire(cashier);
        assertEquals(cashier.getIdentity(), "applicant");
    }
}