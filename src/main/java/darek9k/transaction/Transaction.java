package darek9k.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Transaction {
    private Integer id;
    private Integer productId;
    private Integer customerId;
    private LocalDate date;
    private Integer quantity;
    private BigDecimal price;

    public Transaction(){

    }
    public Transaction(Integer id, Integer productId, Integer customerId, LocalDate date, Integer quantity, BigDecimal price) {
        this.id = id;
        this.productId = productId;
        this.customerId = customerId;
        this.date = date;
        this.quantity = quantity;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
