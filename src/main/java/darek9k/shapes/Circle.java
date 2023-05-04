package darek9k.shapes;

public class Circle {

    private double r;

    private String label;

    public double getR() {
        return r;
    }

    public String getLabel() {
        return label;
    }

    public Circle(double r, String label) {
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
}
