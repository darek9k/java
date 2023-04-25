package javaCourse;
//variables
public class LessonVar {
    public static void main(String[] args) {
        //integer (4 bytes of memory allocation)
        //variable declaration 'age'
        int age;
        //value assignment
        age = 18;
        //one line
        int userAge = 18;
        System.out.println(age);
        //camelCase
        //int userAge;

        userAge = 40;
        System.out.println(age);

        // + - * / %
        int addition = userAge + 5;

        //assignment, not declaration
        userAge = userAge - 9;

        int x1 = userAge * 2;
        int x2 = userAge / 3;
        int x3 = userAge % 3;

        System.out.println("Addition: " + addition); //+ joins two variables, the addition variable will be cast to a String, not a math operation.
        System.out.println("userAge: " + userAge);
        System.out.println("x1: " + x1);
        System.out.println("x2: " + x2);
        System.out.println("x3: " + x3);


        //method scope variable.
    }
    public static void hello(String[] args) {
        int age = 30;
        System.out.println(age);
        //camelCase
        //int userAge;

        age = 21;
        System.out.println(age);

        //method scope variable.
    }
}
