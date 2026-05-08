package collectionframeworks;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class MapDemo {

    public static void main(String[] args) {

        // Map : HashMap, TreeMap
        Map<String, Product> products = new HashMap<>();

        String uuid = UUID.randomUUID().toString();
        Product product = new Product();
        product.setId(uuid);
        product.setTitle("Coca Cola");
        product.setPrice(1.1);

        Product product1 = new Product();
        product1.setId( UUID.randomUUID().toString() );
        product1.setTitle("Pepsi");
        product1.setPrice(1.5);

        products.put(product.getId(), product);
        products.put(product1.getId(), product1);

        System.out.println(products);


        Product foundProduct = products.get(product.getId());
        System.out.println("Found Product: " + foundProduct);

        System.out.println(
                products.keySet()
        );
        System.out.println(
                products.values()
        );

//        products.

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "hi");
//        map.put(1, "hello");
        System.out.println(map);

    }

}
