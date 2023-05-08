package darek9k;

public class Person {
    private static Integer counter = 0;

    private final Integer id;

    private final String name;

    public Person(Integer id, String name) {
        counter++;
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static Integer getCounter() {
        return counter;
    }

    public static void setCounter(Integer counter) {
        Person.counter = counter;
    }

    @Override
    public String toString() {
        return "Person{" +
                "counter" + counter +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
