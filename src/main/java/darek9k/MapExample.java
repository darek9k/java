package darek9k;

import java.util.*;
import java.util.random.RandomGenerator;

public class MapExample {

    public static final int INITIAL_CAPACITY = 1000000;

    public static void main(String[] args) {
        //Map - there is no predetermined size.
        //- contains key => value pairs,
        //- we get to the elements by key,
        //-keys are unique
        Map<String, String> countiresMap = new HashMap<>(5);
        Map<String, String> countiresMap2 = new HashMap<>(5);

        countiresMap.put("PL","Polska");
        countiresMap.put("EN","Anglia");
        countiresMap.put("US","USA");
        countiresMap.put("DE","Niemcy");
        countiresMap.put("pp","Polska");
        countiresMap.put("NL",null);

        countiresMap2.put("DE","Niemcy");
        countiresMap2.put("FR","Francja");

        System.out.println(countiresMap);

        countiresMap.putAll(countiresMap2);

        System.out.println(countiresMap);
        System.out.println(countiresMap2);

        String plValue = countiresMap.get("PL");
        String nullValue = countiresMap.get("GR");
        String nullValue2 = countiresMap.get("NL");

        System.out.println(plValue);
        System.out.println(nullValue);
        System.out.println(nullValue2);

        Set<String> keySet = countiresMap.keySet();
        System.out.println(keySet);

        for (String key : keySet) {
            System.out.println(key + " => " + countiresMap2.get(key));
        }

        Collection<String> values = countiresMap.values();
        for (String value : values) {
            System.out.println(value);

        }

        String remove = countiresMap.remove("NL");
        String remove2 = countiresMap.remove("UP");

        System.out.println("-------------------");
        System.out.println(remove);
        System.out.println(remove2);
        System.out.println(countiresMap);

        Map<String, String> countries = Map.of("PL", "Polska", "DE","Niemcy", "NL","Holandia");

        System.out.println(countries);

        Set<Map.Entry<String, String>> entries = countiresMap2.entrySet();
        System.out.println(entries);
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + "=>" + entry.getValue());
        }
        RandomGenerator rd = RandomGenerator.getDefault();
        Map<Integer, Integer> hugeMap = new HashMap<>(INITIAL_CAPACITY);
        for (int i = 0; i < INITIAL_CAPACITY; i++) {
            hugeMap.put(i, rd.nextInt());
        }

        extracted(hugeMap, 0);
        extracted(hugeMap, INITIAL_CAPACITY/2);
        extracted(hugeMap, -1);
        extracted(hugeMap, INITIAL_CAPACITY-1);
        extracted(hugeMap, INITIAL_CAPACITY);

        List<Person> persons = List.of(
                new Person(1,"Darek"),
                new Person(2, "Tomek"),
                new Person(3, "Jarek"),
                new Person(4, "Marek"),
                new Person(5, "Arek")
        );
        //A map can store any type.
        Map<Integer, Person> personsMap = new HashMap<>(persons.size());

        for (Person person : persons) {
            personsMap.put(person.getId(),person);
        }
        System.out.println(persons);
        System.out.println(personsMap);
    }

    private static void extracted(Map<Integer, Integer> hugeMap, Integer key) {
        long start = System.nanoTime();
        Integer integer = hugeMap.get(key);
        long stop = System.nanoTime();
        System.out.println("Dla klucza: " + key +  " wartość wynosi: " + integer + ". Trwało: " +(stop-start)/1000 + "us");
    }
}
