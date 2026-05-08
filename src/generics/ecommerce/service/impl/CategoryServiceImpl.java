package generics.ecommerce.service.impl;

import generics.ecommerce.model.Category;
import generics.ecommerce.service.CategoryService;

import java.util.List;

public class CategoryServiceImpl implements CategoryService {

    @Override
    public Category create(Category category) {
        return null;
    }

    @Override
    public void updateById(Long aLong, Category category) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public List<Category> getAll() {
        return List.of();
    }

    @Override
    public Category getById(Long aLong) {
        return null;
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }
}
