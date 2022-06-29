package org.example.shopsetting;

import org.example.shopsetting.store.Cashier;
import org.example.shopsetting.store.Customer;
import org.example.shopsetting.store.Manager;
import org.example.shopsetting.store.Product;

public class Main {

    public static void main(String[] args) {

        //Applicant applicant = new Applicant();
        Cashier cashier = new Cashier("John", "applicant", "001");
        Manager manager = new Manager("Michael", "MR1", "001");
        Customer customer = new Customer(50000);
        Product product = new Product("Clothes", 1500,10 );

//        manager.iCanHire(cashier);
//        customer.iCanBuy(product);
        cashier.iCanSellAndGiveReceipts(product);

    }
}