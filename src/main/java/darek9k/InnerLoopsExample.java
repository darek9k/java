package darek9k;

public class InnerLoopsExample {

    public static final int MAX = 100;

    public static void main(String[] args) {
        for (int i = 1; i <= MAX; i++) {
            for (int j = 1; j <= MAX; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
