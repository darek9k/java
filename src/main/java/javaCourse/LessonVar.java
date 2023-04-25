package javaCourse;
//variables
public class LessonVar {
    public static void main(String[] args) {
        // 1 byte -128 to 127
        byte age = - 128;
        int i = age - 1;
        System.out.println("age: " + i);
        age = 127;
        System.out.println("age: " + (age+1));

        // 2 bytes -32.768 to 32.767
        // short

        short shortInt = -32768;

        int i1 = shortInt - 1;

        //integer (4 bytes of memory allocation)
        //variable declaration 'age'
        int views = 18;

        views = 2147483647;

        views = views +1;

        System.out.println("Views: " + views);

        views = -2147483648;
        views = views-1;
        System.out.println("Views: " + views);

        // 8 bytes / big number
        long bigNumber = 9223372036854775807L;
        bigNumber = -9223372036854775808L;
    }
}
