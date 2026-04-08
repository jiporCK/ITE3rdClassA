package oop.example;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
//        Product[] products = new Product[20];
        // Collection Framework
//        List<Product> products = new ArrayList<>();


       List<Integer> integerList = new ArrayList<>();


        List<String> names = new ArrayList<>();
        names.add("Souheng");
        names.add("Solyta");

        System.out.println(names);

        List<Product> products = new ArrayList<>();
        products.add(new Product(
                1, "Coca Cola", 1.2, 40
        ));
        products.add(new Product(
                2, "Pepsi", 3.1, 50
        ));
        System.out.println(products);

    }

}
