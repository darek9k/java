package javaCourse;

public class BMICalc {
    public static void main(String[] args) {
        //BMI = weight in kg / (height in meters)^2
        //1. two integer variables: weight and height in cm and assign some values
        // calculate BMI and print to screen.
        int weight = 90;
        int height = 188;
        double heightInMeters = height / 100.0;

        double bmi = weight / heightInMeters / heightInMeters;
        System.out.println(bmi);

        //2. two floating point variables weight and height and rewrite some values.
        float weight2 = 89.6f;
        float height2 = 1.88f;
        float bmi2 = weight2 / height2 / height2;
        System.out.println(bmi2);

    }
}
