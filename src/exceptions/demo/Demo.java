package exceptions.demo;

public class Demo {

    public static void main(String[] args) {

        ProductRepo repo = new ProductRepo();
        ProductService service = new ProductServiceImpl(repo);

        Product product = new Product(
                "Coca Cola", 1.2,  20
        );
        Product product1 = new Product(
                "Pepsi", 1.5, 40
        );

        service.createProduct(product);
        service.createProduct(product1);

        try {
            System.out.println(
                    service.getAll()
            );
        } catch (ProductException e) {
            System.out.println("Error: " + e.getMessage());
        }

        service.purchase(1L, 10);

        System.out.println(service.getAll());

    }

}
