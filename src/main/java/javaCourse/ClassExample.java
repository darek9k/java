package javaCourse;

public class ClassExample {
    public static void main(String[] args) {
        //Different instances. Three different reflections. Rectangle classes.
        Rectangle rectangle = new Rectangle(10,20,"Prostoka1");
        Rectangle rectangle2 = new Rectangle(10,20);
        //int calculateField = rectangle.calculateField();

        System.out.println(rectangle);
        System.out.println("Pole obiektu " + rectangle.getLabel()+ " wynosi: " + rectangle.calculateField());

        Circle circle = getCircle(2.5,"Koło");

        Circle circle1 = getCircle(5, "Koło1");

        extracted(circle);
        extracted(circle1);
    }

    private static Circle getCircle(double r, String label) {
        return new Circle(r, label);
    }

    private static void extracted(Circle c) {
        System.out.println(c);
        System.out.println("Pole koła " + c.getLabel() + " wynosi: " + c.calculateField());
    }
}
