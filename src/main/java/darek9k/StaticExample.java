package darek9k;

import darek9k.shapes.Circle;
import darek9k.shapes.Point;

public class StaticExample {
    public static void main(String[] args) {
        System.out.println(Person.getCounter());
        Person person = new Person(9, "Darek");

        System.out.println(person.getCounter());

        //Person.counter++;

        Person person2 = new Person(8, "Jarek");
        System.out.println(Person.getCounter());
        System.out.println(person.getCounter());
        System.out.println(person2.getCounter());

        //classical method
        //Circle c1=null;
        //Circle c2=null;

        //Circle max = c1.max(c2);

        //Circle max1 = Circle.max(c1, c2);

        System.out.println(Point.getCounter());

        for (int i = 0; i < 500; i++) {
            new Point(i,i);
        }
        System.out.println(Point.getCounter());

    }
}
