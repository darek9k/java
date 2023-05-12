package darek9k.report;

import java.util.Map;

public class TransactionReportGeneratorProvider {
    private static final Map<ReportType, TransactionReportGenerator> GENERATOR_MAP = Map.of(
            ReportType.CSV, new CsvTransactionReportGenerator(),
            ReportType.XLS, new XlsTransactionReportGenerator()
    );
    static TransactionReportGenerator provide(ReportType reportType){

        return GENERATOR_MAP.get(reportType);
    }
}
