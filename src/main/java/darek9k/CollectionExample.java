package darek9k;

import java.util.ArrayList;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {

        //declaring a list. Genericity.
        List<Integer> numbers = new ArrayList<>();
        List<Integer> numbers2 = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);

        numbers2.add(3);
        numbers2.add(4);

        numbers.addAll(numbers2); //Copy of references. No new object is created.

        System.out.println(numbers);

        System.out.println(numbers.get(2));

        //Removal.
        numbers.remove(0);
        System.out.println(numbers);

        for (Integer number : numbers) {
            System.out.println(number);
        }

         //Immutable
        List<String> strs = List.of("str1","str2","str3");
        System.out.println(strs);

        //Create a list of 100 numbers from 9 to 99
        // and from that create a second list that contains the items in reverse order.

        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            integers.add(i);
        }
        System.out.println(integers);
        List<Integer> integers2 = new ArrayList<>();
        for (int i = integers.size()-1; i >= 0; i--) {
            integers2.add(integers.get(i));
        }
        System.out.println(integers2);
    }
}
