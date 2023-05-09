package darek9k.transaction;

import java.util.List;

public class TransactionService {
    private static final TransactionService instance = new TransactionService();
    private final TransactionDao transactionDao = TransactionDao.getInstance();
    private TransactionService(){

    }
    public static TransactionService getInstance(){
        return instance;
    }
    public List<Transaction> findAll(){
        return transactionDao.findAll();
    }

}
