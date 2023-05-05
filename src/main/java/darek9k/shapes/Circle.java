package darek9k.shapes;

public class Circle extends Shape {

    private double r;

    private String label;

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
                ", label='" + label + '\'' +
                '}';
    }

    @Override
    public void shapeDetails() {
        System.out.println("Jestem kołem i mam promień r=" + r);
    }
}
