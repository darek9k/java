package darek9k;

import darek9k.shapes.FieldComputable;
import darek9k.shapes.PerimeterComputable;

public class LambdaExample {
    public static void main(String[] args) {
        FieldComputable fieldComputable = new FieldComputable() {
            @Override
            public double calculateField() {
                return 1;
            }
        };

        //---------------Object ---------param / method implementation
        FieldComputable fieldComputable2 = () -> 2;

        System.out.println(fieldComputable.calculateField());
        System.out.println(fieldComputable2.calculateField());

        PerimeterComputable perimeterComputable = () -> 5;

        System.out.println(perimeterComputable.calculate());
    }
}
