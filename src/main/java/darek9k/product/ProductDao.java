package darek9k.product;

import java.util.List;

class ProductDao {
    private static final ProductDao instance = new ProductDao();

    private ProductDao(){

    }
    public static ProductDao getInstance(){
        return instance;
    }

    List<Product> findAll() {
        return List.of(
                new Product(1,"Kurs Zostań Testerem"),
                new Product(2, "Kurs Podstawy Javy"),
                new Product(3, "Kurs Backend Java Developer")

        );
    }
}
