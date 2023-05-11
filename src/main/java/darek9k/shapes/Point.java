package darek9k.shapes;

public class Point extends Shape implements Comparable<Point>{

    private static Integer counter;

    static{
        counter = 0;
    }
    public Point(int x, int y) {
        super(x, y);
        counter++;
    }
    public String toString() {
        return "Point{" +
                "x=" + getX() +
                ",y=" + getY() +
                '}';
    }
    @Override
    public void shapeDetails() {
        System.out.println("Jestem punktem");
    }

    public static Integer getCounter() {
        return counter;
    }

    @Override
    public int compareTo(Point o) {
        return Integer.compare(getX(), o.getX());
    }
}
