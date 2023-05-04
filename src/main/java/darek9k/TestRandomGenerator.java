package darek9k;

import java.util.random.RandomGenerator;

public class TestRandomGenerator {
    public static void main(String[] args) {
        //Create a 6 element array.
        //Make 600 draw loops.
        //Count how many came out.

        int[] numberCounters = {0,0,0,0,0,0};
        RandomGenerator rd = RandomGenerator.getDefault();
        //we accept the use of magic numbers :)
        for(int i=0;i<600;i++){
            int randomNumber = rd.nextInt(6) + 1;
            numberCounters[randomNumber-1]++;
        }
        //for (int numberCounter : numberCounters) {
        //    System.out.println(numberCounter);
        //}
        for (int idx=0;idx <numberCounters.length; idx++){
            System.out.println("Number " + (idx+1) + " she was drawn " + numberCounters[idx] + " times");
        }

    }
}
