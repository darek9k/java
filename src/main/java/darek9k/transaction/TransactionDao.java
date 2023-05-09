package darek9k.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

class TransactionDao {
    private static final TransactionDao instance = new TransactionDao();

    private TransactionDao() {

    }

    public static TransactionDao getInstance() {
        return instance;
    }

    List<Transaction> findAll() {
        return List.of(
                new Transaction(1, 1, 1, LocalDate.of(2023, 1, 1), 2, new BigDecimal(94)),
                new Transaction(2, 1, 1, LocalDate.of(2023, 1, 3), 1, new BigDecimal(97)),
                new Transaction(3, 3, 4, LocalDate.of(2023, 1, 2), 4, new BigDecimal(1397)),
                new Transaction(4, 3, 9, LocalDate.of(2023, 1, 4), 6, new BigDecimal(2794))
        );
    }
}
