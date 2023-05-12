package darek9k.transaction;

import darek9k.customer.Customer;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Stream;

class TransactionDao {
    private static final TransactionDao instance = new TransactionDao();

    private TransactionDao() {

    }

    public static TransactionDao getInstance() {
        return instance;
    }

    List<Transaction> findAll() {
        try (Stream<String> lines = Files.lines(Path.of("files/transactions.csv"))){
            return lines
                    .map(Transaction::fromCsvString)
                    .toList();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
