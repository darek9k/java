package darek9k;

public class PeselGender {
    public static void main(String[] args) {
        //Write out the text or the pesel belongs to a woman. And then true or false.
        String pesel = "69062644120";

        char c = pesel.charAt(9);
        String charAsStr = String.valueOf(c);
        int digit = Integer.parseInt(charAsStr);

        boolean womenValidator = (digit % 2 == 0);

        //With if modification.
        // Write out whether this pesel belongs to a woman or whether this pesel belongs to a man.

        if (digit % 2 == 0) {
            System.out.println("Pesel należy do kobiety / It belongs to a woman.");
        } else {
            System.out.println("Pesel należy do mężczyzny / It belongs to a man");
        }

    }
}
