package darek9k.shapes;

import java.util.Objects;

public class Circle extends Shape implements FieldComputable, PerimeterComputable, Comparable<Circle>{

    private final double r;

    private final String label;

    public double getR() {
        return r;
    }

    public String getLabel() {
        return label;
    }

    public Circle(double r, int x, int y, String label) {
        super(x,y);
        this.r = r;
        this.label = label;
    }

    public Circle(double r, int x, int y) {
        super(x,y);
        this.r = r;
        this.label = "";
    }
    public Circle(double r, String label) {
        super (0,0);
        this.r = r;
        this.label = label;
    }

    public double calculateField(){
        return Math.PI*r*r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ",x=" + getX() +
                ",y=" + getY() +
                 ", label='" + label + '\'' +
                '}';
    }

    @Override
    public void shapeDetails() {
        System.out.println("Jestem kołem i mam promień r=" + r);
    }

    @Override
    public float calculate() {
        return (float)(2*Math.PI*r);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.getR(), getR()) == 0 && getLabel().equals(circle.getLabel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getR(), getLabel());
    }

    public Circle max(Circle c){
        return getR() > c.getR() ? this : c;
    }
    public static Circle max(Circle c1, Circle c2){
        return c1.getR() > c2.getR() ? c1 : c2;
    }

    @Override
    public int compareTo(Circle o) {
        if(getR()>o.getR()){
            return 1;
        } else if(getR()<o.getR()){
            return -1;
        }
        return 0;
    }

    public int compareByY(Circle o) {
        if(getY()>o.getY()){
            return 1;
        } else if(getY()<o.getY()){
            return -1;
        }
        return 0;
    }
}
