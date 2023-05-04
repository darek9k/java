package darek9k;

import java.util.random.RandomGenerator;

public class ifElseExample {
    public static void main(String[] args) {

        String name = "  ";

        if (name.isBlank()) {
            System.out.println("Name is required.");
            //return; //With return we terminate the execution of the method.
        } else {

            RandomGenerator randomGenerator = RandomGenerator.getDefault();
            int randomNumber = randomGenerator.nextInt(10);
            System.out.println("Name is: " + name);

            if (randomNumber < 5) {
                //If true this block will execute.
                System.out.println(randomNumber + "  is less than 5");
            } else {
                //This block executes when the condition is not met. (false)
                System.out.println(randomNumber + " is greater/equal than 5");
            }
        }
        System.out.println("It always gets done.");
    }
}
