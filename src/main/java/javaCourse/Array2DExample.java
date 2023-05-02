package javaCourse;

public class Array2DExample {
    public static void main(String[] args) {
        int[][] multiplicationTable = {
                {1, 2, 3},
                {2, 4, 6},
                {3, 6, 9}
        };
//        int[][] multiplicationTable2 = new int[][]{
//                {1, 2, 3},
//                {2, 4, 6},
//                {3, 6, 9}
//        };
        //int[][] multiplicationTable3 = new int[3][3];
        int[][] multiplicationTable4 = new int[3][0];

        String[][] array2D = {
                {"00", "01", "02"},
                {"10", "11", "12"},
                {"20", "21", "22"}
        };

        System.out.println(multiplicationTable[0]);

        multiplicationTable4[0] = new int[10];
        multiplicationTable4[1] = new int[5];
        multiplicationTable4[2] = new int[3];

        multiplicationTable4[0][9] = 50;
        multiplicationTable4[1][4] = 3;

        System.out.println("Element na pozycji 00 : " + array2D[0][0]);
        System.out.println("Element na pozycji 10 : " + array2D[1][0]);

        int[][] multiplyTable = createMultiplyTable(3);
        displayMultiplyTable(multiplyTable);
    }
    private static int[][] createMultiplyTable(int n) {
        int[][] multiplyTable = new int[n][n];

        for (int i = 1, idxRow = 0; i <= n; i++, idxRow++) {
            for (int j = 1, idxCol = 0; j <= n; j++, idxCol++) {
                multiplyTable[idxRow][idxCol] = i * j;
            }
        }

        return multiplyTable;
    }

    private static void displayMultiplyTable(int[][] multiplyTable) {

        for (int[] ints : multiplyTable) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
