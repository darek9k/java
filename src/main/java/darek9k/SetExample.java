package darek9k;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<String> strs = new HashSet<>();
        Set<String> strs2 = new HashSet<>();

        //Adding items. Removal of duplicates - feature of Sets.
        //The display order is not preserved.

        strs.add("strs1");
        strs.add("strs1");
        strs.add("strs2");
        strs.add("strs3");

        strs2.add("strs3");
        strs2.add("strs5");


        System.out.println(strs);
        System.out.println(strs2);

        strs.addAll(strs2);

        List<String> names = List.of("Marek","Adam","Marek");
        Set<String> uniqueNames = new HashSet<>(names);

        System.out.println(uniqueNames);

        System.out.println(strs);
        System.out.println(strs2);

        strs.removeAll(strs2);
        System.out.println(strs);

        Set<Integer> numbers = Set.of(5,8,3);

        for (Integer number : numbers) {
            System.out.println(number);
        }

        Iterator<Integer> iterator = numbers.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        Set<Integer> linked = new LinkedHashSet<>();

        hashSet.add(90);
        hashSet.add(8);
        hashSet.add(4);
        hashSet.add(78);
        hashSet.add(45);

        treeSet.add(90);
        treeSet.add(8);
        treeSet.add(4);
        treeSet.add(78);
        treeSet.add(45);

        linked.add(90);
        linked.add(8);
        linked.add(4);
        linked.add(78);
        linked.add(45);

        System.out.println(hashSet);
        System.out.println(treeSet);
        System.out.println(linked);
    }
}
