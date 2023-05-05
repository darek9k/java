package darek9k.shapes;

import java.sql.SQLOutput;

public class Rectangle extends Shape{
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


    public int calculateField(){
        return a*b;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                ", label='" + label + '\'' +
                '}';
    }
}
