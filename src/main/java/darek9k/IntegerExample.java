package darek9k;

public class IntegerExample {
    public static void main(String[] args) {
        int a = 1;
        //Integer b = new Integer(2);
        //Integer c = new Integer ("2");

        //autoboxing - int na Integer, Integer.valueOf(2)
        Integer d = 4;
        Integer e = a;
        Integer f = Integer.valueOf("2");

        //unboxing Integer -> int
        //uses intValue;
        //f.intValue();
        int g = f;

        int i = a + d;

        //int i1 = b + c;

        Integer[][] multiplyTable = createMultiplyTable (10);
        displayMultiplyTable(multiplyTable);

    }
    private static Integer[][] createMultiplyTable(Integer n){
        Integer[][] multiplyTable = new Integer[n][n];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n ; j++) {
                multiplyTable[i-1][j-1]=i*j;

            }

        }
        return multiplyTable;
    }
    private static void displayMultiplyTable(Integer[][] multiplyTable){
        for (Integer[] integers : multiplyTable) {
            for (Integer integer : integers) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }
}
