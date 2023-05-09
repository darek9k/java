package darek9k;

import darek9k.shapes.Circle;
import darek9k.shapes.FieldComputable;
import darek9k.shapes.PerimeterComputable;

public class AnonymousClassExample {
    public static void main(String[] args) {
        FieldComputable fieldComputable = getFieldComputable();

        System.out.println(fieldComputable.calculateField());
        float a = 345;
        PerimeterComputable perimeterComputable = new PerimeterComputable() {
            private float b;
            @Override
            public float calculate() {
                b = 45;
                return a+b;
            }
        };
        System.out.println(perimeterComputable.calculate());
    }
    //Definition of an unnamed class
    // that implements FieldComputeble
    // and instantiate that class.
    // Definition and creation of a new instance.
    private static FieldComputable getFieldComputable() {
        return new FieldComputable() {
            @Override
            public double calculateField() {
                test();
                return 56;
            }

            private void test() {
                System.out.println("Test()");
            }
        };
    }
}
