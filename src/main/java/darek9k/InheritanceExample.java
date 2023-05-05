package darek9k;

import darek9k.shapes.Circle;
import darek9k.shapes.Rectangle;
import darek9k.shapes.Shape;

public class InheritanceExample {
    public static void main(String[] args) {
        Shape shape1 = new Shape(2, 3);
        Circle circle = new Circle(5, 7, 8, "Moje koło");


        //Polymorphism.
        //Circle is Circle and Shape.

        Shape[] shapes = {new Shape(150,90),
                new Circle (1,2,3,"Circle"),
                new Rectangle(5,5,6,8,"Prostokąt")
        };
        for (Shape shape : shapes) {
            shapeDesc(shape);
        }

        //shape1.myPosition();

        shapeDesc(shape1);
        //circle.myPosition();

        shapeDesc(circle);
    }

    private static void shapeDesc(Shape shape) {
        shape.myPosition();
    }
}
