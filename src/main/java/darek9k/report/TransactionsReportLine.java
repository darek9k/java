package darek9k.report;

import lombok.ToString;
import lombok.Value;

import java.math.BigDecimal;
import java.time.LocalDate;

@Value
class TransactionsReportLine {
     Integer id;
     String customerName;
     String productName;
     LocalDate date;
     Integer quantity;
     BigDecimal price;
}

