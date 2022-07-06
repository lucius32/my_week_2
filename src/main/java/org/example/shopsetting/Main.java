package org.example.shopsetting;

import org.example.shopsetting.store.Cashier;
import org.example.shopsetting.store.Customer;
import org.example.shopsetting.store.Manager;
import org.example.shopsetting.store.Product;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Main {


    public static void main(String[] args) {

        List<Product> products = readProductsFromCSV("C:\\Users\\BELLERICARY\\Downloads\\week-1-task-lucius32-main\\week-1-task-lucius32-main\\target\\product.csv");

        for (Product p : products){
            System.out.println(p);
        }

        //Applicant applicant = new Applicant();
        Cashier cashier = new Cashier("John", "applicant", "001");
        Manager manager = new Manager("Michael", "MR1", "001");
        Customer customer = new Customer(50000);
        Product product = new Product("Cookies", "ArrowRoot", 77, 2.18);

        manager.iCanHire(cashier);
//        customer.iCanBuy(product);
        cashier.iCanSellAndGiveReceipts(product);

    }

    private static List<Product> readProductsFromCSV(String s) {

        List<Product> products = new ArrayList<>();
        Path path = Paths.get(s);
        try (BufferedReader br = Files.newBufferedReader(path, StandardCharsets.US_ASCII)){
            String line = br.readLine();


            while (line != null){
                String[] values = line.split(",");

                Product product = createProduct(values);

                if (!(products.contains(product))){
                    products.add(product);
                } else {
                    Product p = products.get(products.indexOf(product));
                    p.setQuantity(p.getQuantity() + product.getQuantity());

                    products.remove(product);
                    products.add(p);
                }


                line = br.readLine();

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return products;
    }

    private static Product createProduct(String[] values) {
        String category = values[0];
        String name = values[1];
        int quantity = Integer.parseInt(values[2]);
        double unitPrice = Double.parseDouble(values[3]);

        return new Product(category, name, quantity, unitPrice);
    }

}