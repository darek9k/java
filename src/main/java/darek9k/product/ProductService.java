package darek9k.product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ProductService {
    private static final ProductService instance = new ProductService();

    private ProductDao productDao = ProductDao.getInstance();

    private ProductService() {

    }

    public static ProductService getInstance() {
        return instance;
    }

    public Map<Integer, Product> find(Set<Integer> ids) {
        List<Product> products = productDao.findAll();
        Map<Integer, Product> result = new HashMap<>(products.size());

        for (Product product : products) {
            if (ids.contains(product.getId())) {
                result.put(product.getId(), product);
            }
        }
        return result;
    }
}
