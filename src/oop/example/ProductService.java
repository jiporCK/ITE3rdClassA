package oop.example;

import java.util.List;

public interface ProductService {

    // CRUD : Create Read Update Delete
    Product create(Product product);
    Product getById(Integer id);
    List<Product> getAll();

    Product updateById(Integer id, Product product);
    boolean deleteById(Integer id);

}
