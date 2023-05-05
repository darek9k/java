package darek9k.shapes;

public class Point extends Shape{
    public Point(int x, int y) {
        super(x, y);
    }

    @Override
    public void shapeDetails() {
        System.out.println("Jestem punktem");
    }
}
