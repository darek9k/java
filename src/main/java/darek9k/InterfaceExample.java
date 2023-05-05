package darek9k;

import darek9k.shapes.*;

public class InterfaceExample {
    public static void main(String[] args) {
        FieldComputable[] fieldComputables = {
                new Circle(1, 2, 3, "Circle"),
                new Rectangle(5, 5, 6, 8, "Prostokąt"),
                new Square(9, 150, 200)
        };

        PerimeterComputable[] perimeterComputables = {
                new Circle(1, 2, 3, "Circle"),
                new Rectangle(5, 5, 6, 8, "Prostokąt"),
                new Square(9, 150, 200)
        };

        for (FieldComputable fieldComputable : fieldComputables) {
            calculateField(fieldComputable);
        }

        for (PerimeterComputable perimeterComputable : perimeterComputables) {
            calculate(perimeterComputable);
        }

    }


    private static void calculateField(FieldComputable fieldComputable) {
        System.out.println("Moje pole to: "+fieldComputable.calculateField());
    }

    private static void calculate(PerimeterComputable perimeterComputable){
        System.out.println("Mój obwód to: "+perimeterComputable.calculate());
    }
}
