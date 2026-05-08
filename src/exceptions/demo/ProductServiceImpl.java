package exceptions.demo;

import java.util.List;

public class ProductServiceImpl implements ProductService {

    private final ProductRepo productRepo;

    public ProductServiceImpl(ProductRepo repo) {
        this.productRepo =repo;
    }

    @Override
    public List<Product> getAll() throws ProductException {

        if (productRepo.getProducts().isEmpty()) {
            throw new ProductException("There is no products");
        }

        return productRepo.getProducts();
    }

    @Override
    public Product createProduct(Product product) throws ProductException {

        validateProduct(product);

        productRepo.getProducts().add(product);

        return product;
    }

    private void validateProduct(Product product) {
        if (product.getTitle().isBlank()) {
            throw new ProductException("Name cannot be blank");
        }
        if (product.getPrice() < 0) {
            throw new ProductException("Price can't be negative");
        }
        if (product.getStock() < 0) {
            throw new ProductException("Stock can't be negative");
        }
    }

    @Override
    public void purchase(Long id, Integer stock) throws ProductException {

        // find our existing product
        Product foundProduct = productRepo.getProducts().stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new ProductException(
                        "Product with id " + id + " not found."
                ));

        // validate on stock amount
        if (foundProduct.getStock() < stock) {
            throw new ProductException("Insufficient stock amount.");
        }

        // modify stock amount
        foundProduct.setStock(foundProduct.getStock() - stock);

    }

}
