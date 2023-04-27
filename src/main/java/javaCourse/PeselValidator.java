package javaCourse;

public class PeselValidator {

    public static void main(String[] args) {
        //social security number
        String pesel = "69062644122";
        //1379137913

        int sum = 0;

        sum += multiplyByWeight(pesel,0, 1);
        sum += multiplyByWeight(pesel.charAt(1), 3);
        sum += multiplyByWeight(pesel.charAt(2), 7);
        sum += multiplyByWeight(pesel.charAt(3), 9);
        sum += multiplyByWeight(pesel.charAt(4), 1);
        sum += multiplyByWeight(pesel.charAt(5), 3);
        sum += multiplyByWeight(pesel.charAt(6), 7);
        sum += multiplyByWeight(pesel.charAt(7), 9);
        sum += multiplyByWeight(pesel.charAt(8), 1);
        sum += multiplyByWeight(pesel.charAt(9), 3);

        System.out.println(sum);
        //Checksum. last digit.

        int digit = Integer.parseInt(String.valueOf(pesel.charAt(10)));

        String sumAsStr = String.valueOf(sum);
        String unity = sumAsStr.substring(sumAsStr.length() - 1);
        int unityAsNumber = Integer.parseInt(unity);

        boolean validPesel = (unityAsNumber == 0 && digit == 0)
                || (unityAsNumber > 0 && 10 - unityAsNumber == digit);
        if (validPesel == true) {
            System.out.println("Pesel jest poprawny / Is correct");

        } else {
            System.out.println("Pesel nie jest porawny /It is incoreect");
        }

    }

    private static int multiplyByWeight(char c, int weight) {
        String charAsStr = String.valueOf(c);
        int digit = Integer.parseInt(charAsStr);
        int multiply = digit * weight;
        return multiply;
    }

    //overload
    private static int multiplyByWeight(String pesel, int index, int weight){
        char c = pesel.charAt(index);
        return multiplyByWeight(c, weight);
    }
}
