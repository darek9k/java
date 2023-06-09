package darek9k.shapes;

public class Square extends Shape implements FieldComputable, PerimeterComputable{
    private final int a;

    public int getA() {
        return a;
    }

    public Square(int a, int x, int y) {
        super(x, y);
        this.a = a;
    }

    @Override
    public void shapeDetails() {
        System.out.println("Jestem kwadratem o boku a=" +a);
    }

    @Override
    public double calculateField() {
        return a*a;
    }

    @Override
    public float calculate() {
        return 4*a;
    }
}
