import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int birthday;


        System.out.print("Enter your year of birth : ");
        birthday = input.nextInt();
        ;
        String zodiac = null;

        if (birthday % 12 == 0) {
            zodiac = "Maymun";
        } else if (birthday % 12 == 1) {
            zodiac = "Horoz";
        } else if (birthday % 12 == 2) {
            zodiac = "Kopek";
        } else if (birthday % 12 == 3) {
            zodiac = "Domuz";
        } else if (birthday % 12 == 4) {
            zodiac = "Fare";
        } else if (birthday % 12 == 5) {
            zodiac = "Okuz";
        } else if (birthday % 12 == 6) {
            zodiac = "Kaplan";
        } else if (birthday % 12 == 7) {
            zodiac = "Tavsan";
        } else if (birthday % 12 == 8) {
            zodiac = "Ejderha";
        } else if (birthday % 12 == 9) {
            zodiac = "Yilan";
        } else if (birthday % 12 == 10) {
            zodiac = "At";
        } else if (birthday % 12 == 11) {
            zodiac = "Koyun";
        }
        System.out.println("Your Chinese zodiac is: " + zodiac);
    }

}