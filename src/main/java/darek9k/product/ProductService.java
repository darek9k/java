package darek9k.product;

import darek9k.transaction.TransactionService;

public class ProductService {
    private static final ProductService instance = new ProductService();

    private ProductService(){

    }
    public static ProductService getInstance(){
        return instance;
    }
}
