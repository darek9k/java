package darek9k.transaction;

public class TransactionService {
    private static final TransactionService instance = new TransactionService();

    private TransactionService(){

    }
    public static TransactionService getInstance(){
        return instance;
    }
}
