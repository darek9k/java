package darek9k;

import java.util.random.RandomGenerator;

public class LoopsExample {
    public static void main(String[] args) {
        //while

        int i = 0;
        //The while loop will only execute if the condition is true.
        //It may not execute even once if the condition is false.
        int j = 0;
        while (i < 10) {
            System.out.println("Value i=" + i + ", number of loop runs= " + (++j));
            i++;
        }

        for (int index = 0; index <= 100; index++) {
            if (index % 2 == 0) {
                System.out.println("Even number=" + index);
                //Continue executes a for loop
                continue;
            }
            System.out.println("After if " + index);
        }
        //do while
        //Will run at least once.
        i = 0;
        do {
            System.out.println("Do while loop");
        } while (i < 0);

        int[] numbers = new int[100];
        RandomGenerator rd = RandomGenerator.getDefault();
        for (int idx = 0; idx < 100; idx++) {
            numbers[idx] = rd.nextInt();
        }
        iterateOverArray(numbers);
    }

    private static void iterateOverArray(int[] array) {
        for (int item : array) {
            System.out.println(item);
        }
    }
}
