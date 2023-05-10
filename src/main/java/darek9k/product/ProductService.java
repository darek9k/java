package darek9k.product;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ProductService {
    private static final ProductService instance = new ProductService();

    private final ProductDao productDao = ProductDao.getInstance();

    private ProductService() {

    }

    public static ProductService getInstance() {
        return instance;
    }

    public Map<Integer, Product> find(Set<Integer> ids) {
        List<Product> products = productDao.findAll();

        return products.stream()
                .filter(product -> ids.contains(product.getId()))
                .collect(Collectors.toMap(Product::getId, product -> product));
    }
}
