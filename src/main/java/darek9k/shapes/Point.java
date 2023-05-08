package darek9k.shapes;

public class Point extends Shape{

    private static Integer counter;

    static{
        counter = 0;
    }
    public Point(int x, int y) {
        super(x, y);
        counter++;
    }

    @Override
    public void shapeDetails() {
        System.out.println("Jestem punktem");
    }

    public static Integer getCounter() {
        return counter;
    }
}
