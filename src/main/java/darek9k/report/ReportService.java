package darek9k.report;

import darek9k.customer.Customer;
import darek9k.customer.CustomerService;
import darek9k.product.Product;
import darek9k.product.ProductService;
import darek9k.shapes.Circle;
import darek9k.shapes.Shape;
import darek9k.transaction.Transaction;
import darek9k.transaction.TransactionService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

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

    public void generateTransactionsReport(ReportType reportType) {
        List<Transaction> transactions = transactionService.findAll();
        Set<Integer> customerIds = transactions.stream()
                .map(Transaction::getCustomerId)
                .collect(Collectors.toSet());

        Set<Integer> productIds = transactions.stream()
                .map(Transaction::getProductId)
                .collect(Collectors.toSet());

        Map<Integer, Customer> customerMap = customerService.find(customerIds);
        Map<Integer, Product> productMap = productService.find(productIds);

        List<TransactionsReportLine> transactionsReportLines = transactions.stream()
                .map(transaction -> {
                    Customer customer = customerMap.get(transaction.getCustomerId());
                    Product product = productMap.get(transaction.getProductId());

                    return new TransactionsReportLine(
                            transaction.getId(),
                            customer.firstAndLastName(),
                            product.getName(),
                            transaction.getDate(),
                            transaction.getQuantity(),
                            transaction.getPrice()
                    );
                })
                .toList();


        TransactionReportGenerator transactionReportGenerator = TransactionReportGeneratorProvider.provide(reportType);
        transactionReportGenerator.generate(transactionsReportLines);


    }
}