package darek9k;

import darek9k.customer.Customer;
import darek9k.transaction.Transaction;
import darek9k.transaction.TransactionService;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Customer> customers = List.of(
                new Customer(1, "Marek", "Koszałka"),
                new Customer(2, "Jan", "Kowalski"),
                new Customer(3, "Adam", "Nowak"),
                new Customer(4, "Mirka", "Chylak"),
                new Customer(5, "Kinga", "Pastuszka"),
                new Customer(8, "Marek", "Zegarek"),
                new Customer(9, "Marek", "Koszałka")
        );
        System.out.println(customers.stream()
                .filter(customer -> customer.getFirstName().startsWith("M"))
                .map(Customer::getLastName)
                .filter(s -> s.endsWith("ka"))
                .distinct()
                .sorted()
                .collect(Collectors.toList())
        );


        System.out.println(customers.stream()
                .filter(customer -> {
                    String lastName = customer.getLastName().toLowerCase();
                    return lastName.startsWith("z")
                            || lastName.startsWith("k")
                            || lastName.startsWith("p");
                })
                .map(Customer::getFirstName)
                .distinct()
                .sorted()
                .collect(Collectors.toList())
        );

        TransactionService transactionService = TransactionService.getInstance();
        List<Transaction> transactions = transactionService.findAll();

        Set<Integer> customerIds = extracted(transactions, Transaction::getCustomerId);
        Set<Integer> productIds = extracted(transactions, Transaction::getProductId);

        Set<Integer> customerIds2 = transactions.stream()
                .map(Transaction::getCustomerId)
                .collect(Collectors.toSet());

        Set<Integer> productIds2 = transactions.stream()
                .map(Transaction::getProductId)
                .collect(Collectors.toSet());


        System.out.println(customerIds);
        System.out.println(productIds);
        //It's not a systemout call, it's a method parameter.
        // Implementation of the run method of the Runnable interface.
        runnableExample(() -> System.out.println("Jesteśmy w runnable"));
        //Consumer doesn't return anything, it just takes a parameter.
        consumerExample(integer -> System.out.println(integer * 5));
        supplierExample(() -> "supplier");

        doMath(3, 4, Integer::sum);
        doMath(4, 3, (a, b) -> a - b);
        doMath(3, 4, (a, b) -> a * b);
        doMath(8, 4, (a, b) -> a / b);
        doMath(9, 4, (a, b) -> a % b);
    }

    private static Set<Integer> extracted(List<Transaction> transactions, Function<Transaction, Integer> mapper) {
        Set<Integer> ids = new HashSet<>(transactions.size());
        for (Transaction transaction : transactions) {
            ids.add(mapper.apply(transaction));
        }
        return ids;
    }

    private static void runnableExample(Runnable runnable) {
        runnable.run();
    }

    private static void consumerExample(Consumer<Integer> consumer) {
        consumer.accept(5);
    }

    private static void supplierExample(Supplier<String> supplier) {
        System.out.println(supplier.get());
    }

    private static void doMath(Integer a, Integer b, BiFunction<Integer, Integer, Integer> mathFunction) {
        System.out.println(mathFunction.apply(a, b));
    }

}
