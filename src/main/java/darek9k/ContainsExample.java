package darek9k;

import java.util.*;
import java.util.random.RandomGenerator;

public class ContainsExample {

    public static final int MAX_ITEMS = 10000000;

    public static void main(String[] args) {
        Integer[] ints = new Integer[MAX_ITEMS];
        Set<Integer> hashSet = new HashSet<>(MAX_ITEMS);
        Set<Integer> treeSet = new TreeSet<>();
        Set<Integer> linked = new LinkedHashSet<>(MAX_ITEMS);
        List<Integer> list1 = new ArrayList<>(MAX_ITEMS);
        List<Integer> list2 = new LinkedList<>();

        RandomGenerator rd = RandomGenerator.getDefault();
        int nextInt =0;
        for (int i = 0; i < MAX_ITEMS; i++) {
            nextInt = rd.nextInt(Integer.MAX_VALUE);
            ints[i]= nextInt;
            hashSet.add(nextInt);
            treeSet.add(nextInt);
            linked.add(nextInt);
            list1.add(nextInt);
            list2.add(nextInt);
        }

        extracted(ints, nextInt);
        extracted(ints, -1);

        contains(hashSet, nextInt,"HashSet");
        contains(hashSet, -1,"HashSet");

        contains(treeSet, nextInt,"TreeSet");
        contains(treeSet, -1,"TreeSet");

        contains(linked, nextInt,"LinkedHashSet");
        contains(linked, -1,"LinkedHashSet");

        contains(list1, nextInt,"ArrayList");
        contains(list1, -1,"ArrayList");

        contains(list2, nextInt,"LinkedList");
        contains(list2, -1,"LinkedList");



    }

    private static void extracted(Integer[] ints, int nextInt) {
        System.out.println("-----------Tablica------------");
        long start = System.nanoTime();
        boolean contains = false;
        for (Integer anInt : ints) {
            if(anInt== nextInt){
                contains=true;
                break;
            }
        }
        System.out.println(contains);
        long stop = System.nanoTime();
        System.out.println("Trwało " + (stop-start)/1000 + "mikros");
    }

    private static void contains(Collection<Integer> collection, Integer item, Object collectionType){
        System.out.println("-----------" + collectionType + "------------");
        long start = System.nanoTime();
        System.out.println(collection.contains(item));
        long stop = System.nanoTime();
        System.out.println("Trwało " + (stop-start)/1000 + "mikros");
    }
}
