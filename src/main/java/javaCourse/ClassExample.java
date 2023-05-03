package javaCourse;

public class ClassExample {
    public static void main(String[] args) {
        //Different instances. Three different reflections. Rectangle classes.
        Rectangle rectangle = new Rectangle();
        Rectangle rectangle2 = new Rectangle();

        rectangle.a = 10;
        rectangle.b = 20;
        rectangle.label = "Prostokat1";

        //int calculateField = rectangle.calculateField();

        System.out.println(rectangle);
        System.out.println("Pole obiektu " + rectangle.label + " wynosi: " + rectangle.calculateField());

        Circle circle = getCircle(2.5,"Koło");

        Circle circle1 = getCircle(5, "Koło1");

        extracted(circle);
        extracted(circle1);
    }

    private static Circle getCircle(double r, String label) {
        Circle circle = new Circle();
        circle.r = r;
        circle.label = label;
        return circle;
    }

    private static void extracted(Circle c) {
        System.out.println(c);
        System.out.println("Pole koła " + c.label + " wynosi: " + c.calculateField());
    }
}
