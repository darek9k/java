package darek9k;

import darek9k.shapes.Circle;
import darek9k.shapes.Rectangle;
import darek9k.shapes.Shape;
import darek9k.shapes.Square;

public class InheritanceExample {
    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle (1,2,3,"Circle"),
                new Rectangle(5,5,6,8,"Prostokąt"),
                new Square(5,150,200)
        };
        for (Shape shape : shapes) {
            shapeDesc(shape);
        }
    }

    private static void shapeDesc(Shape shape) {
        shape.description();
    }

}
