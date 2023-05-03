package javaCourse;

public class Circle {

    double r;

    String label;

    double calculateField(){
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
