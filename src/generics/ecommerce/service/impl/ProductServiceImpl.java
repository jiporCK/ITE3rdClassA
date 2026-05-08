package generics.ecommerce.service.impl;

import generics.ecommerce.model.Product;
import generics.ecommerce.service.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    @Override
    public Product create(Product product) {
        return null;
    }

    @Override
    public void updateById(Long aLong, Product product) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public List<Product> getAll() {
        return List.of();
    }

    @Override
    public Product getById(Long aLong) {
        return null;
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }
}
