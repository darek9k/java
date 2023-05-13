package darek9k.report;

import java.math.BigDecimal;
import java.time.LocalDate;


class TransactionsReportLine {
     Integer id;
     String customerName;
     String productName;
     LocalDate date;
     Integer quantity;
     BigDecimal price;

     public Integer getId() {
          return id;
     }

     public String getCustomerName() {
          return customerName;
     }

     public String getProductName() {
          return productName;
     }

     public LocalDate getDate() {
          return date;
     }

     public Integer getQuantity() {
          return quantity;
     }

     public BigDecimal getPrice() {
          return price;
     }

     public TransactionsReportLine(Integer id, String customerName, String productName, LocalDate date, Integer quantity, BigDecimal price) {
          this.id = id;
          this.customerName = customerName;
          this.productName = productName;
          this.date = date;
          this.quantity = quantity;
          this.price = price;
     }

     @Override
     public String toString() {
          return "TransactionsReportLine{" +
                  "id=" + id +
                  ", customerName='" + customerName + '\'' +
                  ", productName='" + productName + '\'' +
                  ", date=" + date +
                  ", quantity=" + quantity +
                  ", price=" + price +
                  '}';
     }
}

