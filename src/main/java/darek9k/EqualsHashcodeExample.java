package darek9k;

import darek9k.shapes.Circle;
import darek9k.shapes.Rectangle;

import java.util.HashMap;
import java.util.Map;

public class EqualsHashcodeExample {
    public static void main(String[] args) {
        Map<Circle, Integer> circles = new HashMap<>();

        Circle key = new Circle(5, 2, 3, "circle");
        Circle key2 = new Circle(5, 10, 3, "circle");
        Circle key3 = new Circle(8, 2, 3, "circle");

        if (key.equals(key2)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

        circles.put(key, 1);
        circles.put(key2, 2);
        circles.put(key3, 3);

        System.out.println(circles);

        Map<Rectangle, Integer> rectangles = new HashMap<>(3);
        rectangles.put(new Rectangle(3,4,5,6),1);
        rectangles.put(new Rectangle(3,4,5,6),2);
        rectangles.put(new Rectangle(5,5,10,10),3);

        System.out.println(rectangles);
    }


}
