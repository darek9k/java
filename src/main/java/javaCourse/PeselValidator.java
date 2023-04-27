package javaCourse;

public class PeselValidator {

    public static void main(String[] args) {
        //social security number
        String pesel = "69062644122";
        //1379137913

        int sum = 0;
        //Extract single digits.
        char c = pesel.charAt(0);
        String charAsStr = String.valueOf(c);
        int digit = Integer.parseInt(charAsStr);
        int multiply = digit * 1;
        sum = sum + multiply;

        c = pesel.charAt(1);
        charAsStr = String.valueOf(c);
        digit = Integer.parseInt(charAsStr);
        multiply = digit * 3;
        sum = sum + multiply;

        c = pesel.charAt(2);
        charAsStr = String.valueOf(c);
        digit = Integer.parseInt(charAsStr);
        multiply = digit * 7;
        sum = sum + multiply;

        c = pesel.charAt(3);
        charAsStr = String.valueOf(c);
        digit = Integer.parseInt(charAsStr);
        multiply = digit * 9;
        sum = sum + multiply;

        c = pesel.charAt(4);
        charAsStr = String.valueOf(c);
        digit = Integer.parseInt(charAsStr);
        multiply = digit * 1;
        sum = sum + multiply;

        c = pesel.charAt(5);
        charAsStr = String.valueOf(c);
        digit = Integer.parseInt(charAsStr);
        multiply = digit * 3;
        sum = sum + multiply;

        c = pesel.charAt(6);
        charAsStr = String.valueOf(c);
        digit = Integer.parseInt(charAsStr);
        multiply = digit * 7;
        sum = sum + multiply;

        c = pesel.charAt(7);
        charAsStr = String.valueOf(c);
        digit = Integer.parseInt(charAsStr);
        multiply = digit * 9;
        sum = sum + multiply;

        c = pesel.charAt(8);
        charAsStr = String.valueOf(c);
        digit = Integer.parseInt(charAsStr);
        multiply = digit * 1;
        sum = sum + multiply;

        c = pesel.charAt(9);
        charAsStr = String.valueOf(c);
        digit = Integer.parseInt(charAsStr);
        multiply = digit * 3;
        sum = sum + multiply;

        System.out.println(sum);
        //Checksum. last digit.
        c = pesel.charAt(10);
        charAsStr = String.valueOf(c);
        digit = Integer.parseInt(charAsStr);

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
}
