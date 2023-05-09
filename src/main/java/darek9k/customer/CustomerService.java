package darek9k.customer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CustomerService {

    private static final CustomerService instance = new CustomerService();

    private final CustomerDao customerDao = CustomerDao.getInstance();

    private CustomerService() {
    }

    public static CustomerService getInstance() {
        return instance;
    }

    public Map<Integer, Customer> find(Set<Integer> ids) {
        List<Customer> customers = customerDao.findAll();
        Map<Integer, Customer> result = new HashMap<>(customers.size());

        for (Customer customer : customers) {
            if (ids.contains(customer.getId())) {
                result.put(customer.getId(), customer);
            }
        }
        return result;
    }
}
