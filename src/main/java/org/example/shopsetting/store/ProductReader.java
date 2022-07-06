package org.example.shopsetting.store;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Set;
import java.util.TreeSet;

public class ProductReader {

        BufferedReader br = new BufferedReader(new FileReader("samplefoodsales.csv"));

        public ProductReader() throws FileNotFoundException {
        }
}