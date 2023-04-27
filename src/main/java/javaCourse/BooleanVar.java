package javaCourse;

import java.util.random.RandomGenerator;

public class BooleanVar {
    public static void main(String[] args) {
        //Declaration
        boolean b;
        b = true;
        b = false;

        RandomGenerator randomGenerator = RandomGenerator.getDefault();
        int age = randomGenerator.nextInt(36)+1;
        System.out.println("Age: " + age + ". Is he an adult? " + (age>=18));

        age = randomGenerator.nextInt(100)+1;
        System.out.println("Age: " + age + ". Is he an adult? " + (age>=18));

        age = randomGenerator.nextInt(100)+1;
        System.out.println("Age: " + age + ". Is he an adult? " + (age>=18));

        age = randomGenerator.nextInt(100)+1;
        System.out.println("Age: " + age + ". Is he an adult? " + (age>=18));

        age = randomGenerator.nextInt(100)+1;
        System.out.println("Age: " + age + ". Is he an adult? " + (age>=18));

        //Operators
        b = 3>5;
        System.out.println(b);
        System.out.println(3==3);
        System.out.println(3<=5);
        System.out.println(3<5);

        //Function examples.
        System.out.println("Marek".isEmpty());
        System.out.println("Marek".isBlank());

        System.out.println("isEmpty(): " + "  ".isEmpty());
        System.out.println("isBlank(): " + "  ".isBlank());

        //Combining conditions.
        //AND &&
        age = randomGenerator.nextInt(25)+1;
        boolean inRange18_25 = age>=18 && age<=25;
        System.out.println("Age(" + age + ") - is between 18 and 25 - " + inRange18_25);

        //OR ||
        age = randomGenerator.nextInt(50)+1;
        boolean outOfRange18_25 = age<18 || age>25;
        System.out.println("Age(" + age + ") - is outside 18 and 25 - " + outOfRange18_25);

        //and *
            //or +
        age = randomGenerator.nextInt(50)+1;
        int height = randomGenerator.nextInt(80)+100;

        boolean ageCond = age >= 18 && age <= 25;
        boolean heightCond = height >= 160 && height <= 170;

        boolean b1 = ageCond || heightCond;
        System.out.println("Age(" + age + "), height(" + height + ") - is between 18 and 25 or height is between 160 and 170 " + b1);

        //Changing boolean to string and vice versa.
        String booleanAsStr = String.valueOf(b1);

        boolean b2 = Boolean.parseBoolean(booleanAsStr);
    }
}
