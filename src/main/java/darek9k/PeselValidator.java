package darek9k;

public class PeselValidator {

    public static void validate(String pesel) {
        //social security number

        //1. Check the length is 11 characters.
        //2. Check if each character is a number.
        //3. Check if the checksum is correct.
        String validationResult = isPeselValid(pesel) ? "TAK" : "NIE";
        System.out.println("If pesel " + pesel + " valid? " + validationResult);
    }

    private static boolean isPeselValid(String pesel){
        return isPeselLengthValid(pesel) && onlyNumbers(pesel) && isCrtValid(pesel);
    }
    private static boolean isPeselLengthValid(String pesel){
        return pesel != null && pesel.length()==11;
    }

    private static boolean onlyNumbers(String pesel){
        for(int i=0; i<pesel.length(); i++){
            char c = pesel.charAt(i);
            //not true = false, not false = true
            if(!Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }
    private static boolean isCrtValid(String pesel) {
        int sum = 0;
        int[] weights = {1,3,7,9,1,3,7,9,1,3};

        for(int i=0; i<10;i++){
            sum += multiplyByWeight(pesel,i, weights[i]);
        }
        //Checksum. last digit.

        int digit = Integer.parseInt(String.valueOf(pesel.charAt(10)));

        String sumAsStr = String.valueOf(sum);
        String unity = sumAsStr.substring(sumAsStr.length() - 1);
        int unityAsNumber = Integer.parseInt(unity);

        return (unityAsNumber == 0 && digit == 0)
                || (unityAsNumber > 0 && 10 - unityAsNumber == digit);
    }

    private static int multiplyByWeight(char c, int weight) {
        String charAsStr = String.valueOf(c);
        int digit = Integer.parseInt(charAsStr);
        return digit * weight;
    }

    //overload
    private static int multiplyByWeight(String pesel, int index, int weight){
        char c = pesel.charAt(index);
        return multiplyByWeight(c, weight);
    }
}
