package darek9k.customer;

import java.util.List;

class CustomerDao {

    private static final CustomerDao instance = new CustomerDao();

    private CustomerDao() {
    }

    public static CustomerDao getInstance() {
        return instance;
    }

    List<Customer> findAll() {
        return List.of(
                new Customer(1, "Marek", "Koszałka"),
                new Customer(2, "Jan", "Kowalski"),
                new Customer(3, "Adam", "Nowak"),
                new Customer(4, "Mirka", "Chylak"),
                new Customer(5, "Kinga", "Pastuszka"),
                new Customer(8, "Marek", "Zegarek"),
                new Customer(9, "Marek", "Koszałka")
        );
    }
}
