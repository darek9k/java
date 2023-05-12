package darek9k;


import darek9k.report.ReportService;
import darek9k.report.ReportType;

public class ReportExample {
    public static void main(String[] args) {
        ReportService reportService = ReportService.getInstance();
        reportService.generateTransactionsReport(ReportType.CSV);
        reportService.generateTransactionsReport(ReportType.XLS);
//        CustomerService customerService = CustomerService.getInstance();
//        CustomerService customerService2 = CustomerService.getInstance();
//
//        TransactionService transactionService = TransactionService.getInstance();
//        TransactionService transactionService2 = TransactionService.getInstance();
//
//        ProductService productService = ProductService.getInstance();
//        ProductService productService2 = ProductService.getInstance();
//
//        System.out.println(customerService);
//        System.out.println(customerService2);
//
//        System.out.println(transactionService);
//        System.out.println(transactionService2);
//
//        System.out.println(productService);
//        System.out.println(productService2);
    }
}
