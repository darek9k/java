package darek9k;

import java.util.Arrays;
import java.util.random.RandomGenerator;

public class ArrayExample {
    public static void main(String[] args) {
        //Array declaration.
        int[] int1 = {1, 2, 3, 4, 5};
        int[] int2 = new int[]{1, 2, 3, 4, 5};
        int[] numbers = new int[5];

        String[] strings = {"Darek", "Adam"};
        System.out.println(Arrays.toString(strings));
        System.out.println(strings.length);
        System.out.println(strings[0]);

        String[] str3;
        str3 = new String[4];
        str3[1] = "A new string.";
        System.out.println(str3[0]);
        System.out.println(str3[1]);
        System.out.println(str3[2]);
        System.out.println(str3[3]);


        numbers[0] = 45;
        numbers[1] = 145;
        numbers[2] = 245;
        numbers[3] = 345;
        numbers[4] = 445;

        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);

        RandomGenerator[] randomGenerators = {RandomGenerator.getDefault(), RandomGenerator.getDefault(), RandomGenerator.getDefault()};

        //Homework.
        //Declare a String array, enter ten names.
        //Print the randomly drawn name on the console.

        String[] names = {"Ola", "Julia", "Darek", "Ewa", "Anna", "Stefan", "Tomek", "Jacek", "Zbyszek", "Rafał"};
        RandomGenerator random = RandomGenerator.getDefault();
        System.out.println(names[random.nextInt(names.length)]);


    }
}
