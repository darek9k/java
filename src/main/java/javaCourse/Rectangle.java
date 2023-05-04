package javaCourse;

public class Rectangle {
    private int a;
    private int b;
    private String label;

    public Rectangle(int a, int b){
        this.a = a;
        this.b = b;
        this.label = "";
    }

    public Rectangle(int a, int b, String label) {
        this(a,b);
        this.label = label;
    }

    public Rectangle() {

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


    int calculateField(){
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
