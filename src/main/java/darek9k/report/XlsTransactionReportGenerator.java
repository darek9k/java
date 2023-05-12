package darek9k.report;

import java.util.List;

class XlsTransactionReportGenerator implements TransactionReportGenerator {

    @Override
    public void generate(List<TransactionsReportLine> transactionsReportLines) {
        System.out.println("Ja generuje XLSY");

        transactionsReportLines.forEach(transactionsReportLine -> System.out.println(transactionsReportLine.toString()));
    }

}
