package darek9k.customer;

public class CustomerService {

    private static final CustomerService instance = new CustomerService();
    private CustomerService(){
    }
    public static CustomerService getInstance(){
        return instance;
    }
}
