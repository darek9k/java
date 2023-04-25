package javaCourse;

import javax.sound.midi.Soundbank;

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

        //floating point types 0.31415 * 10^1  0.031415 * 10^2  311415 * 10^-4
        float pi2 = 3.1415f; // 4 bytes
        pi2 = (float)3.1415;
        System.out.println(Float.MAX_VALUE); // 3.4028235 +10^38
        System.out.println(Float.MIN_VALUE); // 1.4 * 10^-45

        double pi = 3.1415; // 8 bytes
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);

        float diff2 = 2 - 1.1f;
        double diff1 = 2 - 1.1;

        System.out.println(diff1);
        System.out.println(diff2);



    }
}
