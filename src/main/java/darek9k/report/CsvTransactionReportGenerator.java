package darek9k.report;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

class CsvTransactionReportGenerator implements TransactionReportGenerator {

    @Override
    public void generate(List<TransactionsReportLine> transactionsReportLines) {
        System.out.println("Ja generuje CSV");

        try (CSVPrinter printer = new CSVPrinter(new FileWriter("csv.txt"), CSVFormat.EXCEL)) {
            for (TransactionsReportLine transactionsReportLine : transactionsReportLines) {
                printer.printRecord(transactionsReportLine.getId(),
                        transactionsReportLine.getCustomerName(),
                        transactionsReportLine.getProductName(),
                        transactionsReportLine.getDate(),
                        transactionsReportLine.getQuantity(),
                        transactionsReportLine.getPrice());
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        transactionsReportLines.forEach(transactionsReportLine -> System.out.println(transactionsReportLine.toString()));
    }
}
