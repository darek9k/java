package javaCourse;

public class Rectangle {
    int a;
    int b;

    String label;

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
