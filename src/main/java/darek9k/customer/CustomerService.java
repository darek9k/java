package darek9k.customer;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

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

        //Map<Integer, List<Customer>> map = customers.stream()
        //          .filter(customer -> ids.contains(customer.getId()))
        //        .collect(Collectors.groupingBy(Customer::getId));

        return customers.stream()
                .filter(customer -> ids.contains(customer.getId()))
                .collect(Collectors.toMap(Customer::getId, Function.identity()));
    }
}
