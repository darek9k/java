package darek9k.report;

import darek9k.customer.Customer;
import darek9k.customer.CustomerService;
import darek9k.product.Product;
import darek9k.product.ProductService;
import darek9k.transaction.Transaction;
import darek9k.transaction.TransactionService;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ReportService {
    private static final ReportService instance = new ReportService();

    private final CustomerService customerService = CustomerService.getInstance();
    private final ProductService productService = ProductService.getInstance();
    private final TransactionService transactionService = TransactionService.getInstance();

    private ReportService() {

    }

    public static ReportService getInstance() {
        return instance;
    }

    public void generateTransactionsReport() {
        List<Transaction> transactions = transactionService.findAll();

        Set<Integer> customerIds = new HashSet<>(transactions.size());
        Set<Integer> productIds = new HashSet<>(transactions.size());
        for (Transaction transaction : transactions) {
            customerIds.add(transaction.getCustomerId());
            productIds.add(transaction.getProductId());
        }

        Map<Integer, Customer> customerMap = customerService.find(customerIds);
        Map<Integer, Product> productMap = productService.find(productIds);

        for (Transaction transaction : transactions) {
            Customer customer = customerMap.get(transaction.getCustomerId());
            Product product = productMap.get(transaction.getProductId());
            System.out.println(transaction.getId() + ","
                    + customer.firstAndLastName() + ","
                    + product.getName() + ","
                    + transaction.getDate() + ","
                    + transaction.getQuantity() + ","
                    + transaction.getPrice()
            );
        }
    }
}