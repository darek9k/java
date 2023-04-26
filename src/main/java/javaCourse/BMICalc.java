package javaCourse;

public class BMICalc {
    public static void main(String[] args) {
        //declaration
        String name = "Darek";
        String lastName = "Zegarek";

        int age = 41;

        System.out.println(name);

        //combining variables
        String nameAndLastName = name + " " + lastName;
        System.out.println(nameAndLastName);

        System.out.println(nameAndLastName + age);

        //overwriting
        name = "Adam";
        System.out.println(nameAndLastName);

        //methods
        int length = name.length();
        System.out.println(length);
        System.out.println(name.toUpperCase());
        // also primitive type
        char c = name.charAt(1);
        System.out.println(c);

        //converting a number to a string
        String ageAsString = String.valueOf(age);

        System.out.println(ageAsString);

        int age41 = Integer.parseInt(ageAsString);
        System.out.println(ageAsString);

        //Task.
        //Create a String variable, assign your name to it,
        // write it in lower case.
        // Change the first letter to uppercase and display on the screen.
        String myName = "darek";
        char firstLetter = myName.charAt(0);
        //String firstLetterAsStr = String.valueOf(firstLetter);
        //String upperCaseFirstLetter = firstLetterAsStr.toUpperCase();
        char upperCaseFirst = Character.toUpperCase(firstLetter);
        System.out.println(upperCaseFirst + myName.substring(1));

    }
}
