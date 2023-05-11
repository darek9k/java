package darek9k;

import darek9k.shapes.Circle;
import darek9k.shapes.Point;
import darek9k.shapes.Shape;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CompareExample {
    public static void main(String[] args) {
        Integer a = 5;
        Integer b = 6;
        Integer c = 6;

        System.out.println(a == b);
        System.out.println(c == b);

        System.out.println(a.equals((b)));
        System.out.println(c.equals(b));

        //we compare primitive types by ==
        int a2 = 5;
        int b2 = 6;
        int c2 = 6;

        System.out.println(a2 == b2);
        System.out.println(c2 == b2);

        Circle circle1 = new Circle(1, 2, 3);
        Circle circle2 = new Circle(3, 3, 6);
        Circle circle3 = new Circle(3, 4, 9);
        Circle circle4 = new Circle(0.5, 5, 9);
        Circle circle5 = new Circle(5, 6, 9);

        System.out.println(circle1 == circle2);
        System.out.println(circle3 == circle2);

        System.out.println(circle1.equals((circle2)));
        System.out.println(circle3.equals(circle2));

        AgeIndex e1 = AgeIndex.ADULT;
        AgeIndex e2 = AgeIndex.TEENAGER;
        AgeIndex e3 = AgeIndex.TEENAGER;

        System.out.println(e1 == e2);
        System.out.println(e3 == e2);

        System.out.println(e1.equals((e2)));
        System.out.println(e3.equals(e2));

        Set<Circle> circles = new HashSet<>();
        circles.add(circle1);
        circles.add(circle2);
        circles.add(circle3);
        circles.add(circle4);
        circles.add(circle5);

        System.out.println(circles);

        System.out.println(circles.stream()
                .sorted()
                .toList());

        System.out.println(circles.stream()
                .sorted(CompareExample::extracted)
                .toList());

        System.out.println(circles.stream()
                .sorted(Circle::compareByY)
                .toList());

        //The same as the extracted method, but with the use of built-in jvm mechanisms
        System.out.println(circles.stream()
                .sorted(Comparator.comparing(Shape::getX))
                .toList());

        System.out.println(circles.stream()
                .sorted(Comparator.comparing(Circle::getY).reversed()
                        .thenComparing(Circle::getX))
                .toList());

        List<Point> points = List.of(
                new Point(2, 7),
                new Point(3, 8),
                new Point(4, 9),
                new Point(5, 1),
                new Point(6, 2)
        );

        System.out.println(points.stream()
                .sorted()
                .toList()
        );
        System.out.println(points.stream()
                .sorted(Comparator.reverseOrder())
                .toList()
        );

        System.out.println(points.stream()
                .sorted(Comparator.comparing(Shape::getY))
                .toList()
        );

        System.out.println(points.stream()
                .sorted(Comparator.comparing(Point::getY).thenComparing(Point::getX))
                .toList()
        );
    }

    private static int extracted(Circle o1, Circle o2) {
        if (o1.getX() > o2.getX()) {
            return 1;
        } else if (o1.getX() < o2.getX()) {
            return -1;
        }
        return 0;
    }
}
