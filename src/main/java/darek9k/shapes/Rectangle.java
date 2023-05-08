package darek9k.shapes;

import java.sql.SQLOutput;
import java.util.Objects;

public class Rectangle extends Shape implements FieldComputable, PerimeterComputable{
    private int a;
    private int b;
    private String label;

    public Rectangle(int a, int b){
        super(0,0);
        this.a = a;
        this.b = b;
        this.label = "";
    }

    public Rectangle(int a, int b, int x, int y, String label) {
        super(x,y);
        this.a = a;
        this.b = b;
        this.label = label;
    }

    public Rectangle(int a, int b, int x, int y) {
        super(x,y);
        this.a = a;
        this.b = b;
        this.label = "";
    }

    public Rectangle() {
        super(0,0);
    }

    @Override
    public void shapeDetails() {
        System.out.println("Jestem prostokątem i mam wymiary a= " + a + " i b=" + b);
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public String getLabel() {
        return label;
    }


    public double calculateField(){
        return a*b;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                ", x=" + getX() +
                ", y=" + getY() +
                ", label='" + label + '\'' +
                '}';
    }

    @Override
    public float calculate() {
        return (2*a)+(2*b);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return getA() == rectangle.getA() && getB() == rectangle.getB();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getA(), getB());
    }
}
