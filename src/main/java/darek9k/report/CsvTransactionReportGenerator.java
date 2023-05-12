package darek9k.report;

import java.util.List;

class CsvTransactionReportGenerator implements TransactionReportGenerator {

    @Override
    public void generate(List<TransactionsReportLine> transactionsReportLines) {
        System.out.println("Ja generuje CSV");

        transactionsReportLines.forEach(transactionsReportLine -> System.out.println(transactionsReportLine.toString()));
    }
}
