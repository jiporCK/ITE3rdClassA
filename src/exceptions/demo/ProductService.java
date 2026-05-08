package exceptions.demo;

import java.util.List;

public interface ProductService {

    List<Product> getAll() throws ProductException;

    Product createProduct(Product product) throws ProductException;

    void purchase(Long id, Integer stock) throws ProductException;

}
