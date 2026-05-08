package exceptions.demo;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {

    private final List<Product> products;

    public ProductRepo() {
        products = new ArrayList<>();
    }

    public List<Product> getProducts() {
        return products;
    }
}
