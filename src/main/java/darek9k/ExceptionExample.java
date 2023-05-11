package darek9k;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.function.BiFunction;

public class ExceptionExample {
    public static void main(String[] args) {
        //NOT CHECKED - are not checked during compilation,
        // thrown during runtime, startup.

        // NullPointerException, NPE
        //On a reference that contains null, we try to call a method.
        //String str=null;
        //The first exception terminates the program.
        //It was thrown from the main method.
        //int a = 5/0;
        //String str2 = args[args.length];


        //CHECKED - checked during compilation.
        // we declare throws in methods and constructors
        File file = new File("aasdasdasdad.txt");
        try {
            readFile(file);
        } catch (Exception e) {

            System.out.println("W zewn catchu excepton");
            e.printStackTrace();
            //throw new RuntimeException(e);
        }

        try {
            doMathWithCheckedEx(15,0,(p1,p2) -> p1/p2);
        } catch (CheckedDivideByZero ignored) {

        }
        try {
            doMathWithNotCheckedEx(15, 0, (p1, p2) -> p1 / p2);
        }catch (NotCheckedDivideByZero ignored) {
        }
        System.out.println("KONIEC");
    }

    private static void readFile(File file) throws FileNotFoundException, CheckedException {
        new Scanner(new File("D:\\kursJava\\java\\src\\main\\java\\darek9k\\ExceptionExample.java"));

        try {
            Scanner scanner = new Scanner(new File("D:\\kursJava\\java\\src\\main\\java\\darek9k\\ExceptionExample.java"));

            for (int i = 0; i < 100 ; i++) {
                String s = scanner.nextLine();
                System.out.println(s);
            }
            System.out.println("Po wyjątku w try");
        } catch (FileNotFoundException e) {
            System.out.println("W catchu FileNotFoundException");
            //e.printStackTrace();

            throw new CheckedException(e);
        } catch (NoSuchElementException e) {
            System.out.println("W catchu FileNotFoundException");
            //e.printStackTrace();

            throw new NotCheckedException(e);
        } finally {
            System.out.println("Finally w read file");
        }
    }
    private static void doMathWithCheckedEx(Integer a, Integer b, BiFunction<Integer, Integer, Integer> mathFunction) throws CheckedDivideByZero {
        try {
            System.out.println(mathFunction.apply(a, b));
        }catch (ArithmeticException ex){
            System.out.println("Nie można wyznaczyć wyniku");
            throw new CheckedDivideByZero();
        }
    }

    private static void doMathWithNotCheckedEx(Integer a, Integer b, BiFunction<Integer, Integer, Integer> mathFunction){
        try {
            System.out.println(mathFunction.apply(a, b));
        }catch (ArithmeticException ex){
            System.out.println("Nie można wyznaczyć wyniku");
            throw new NotCheckedDivideByZero();
        }
    }
}
