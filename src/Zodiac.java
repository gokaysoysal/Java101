import java.util.Scanner;

public class Zodiac {
    public static void main(String[] args) {

        int month, day;
        String burc = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Dogdugunuz ay: ");
        month = input.nextInt();
        System.out.print("Dogdugunuz gun: ");
        day = input.nextInt();

        switch (month) {
            case 1:
                if (day >= 1 && day <= 31) {
                    if (day <= 22) {
                        burc = "oglak";
                    } else
                        burc = "kova";

                } else {
                    isError = true;
                }
                break;
            case 2:
                if (day >= 1 && day <= 31) {
                    if (day <= 20) {
                        burc = "balik";
                    } else
                        burc = "koc";

                } else {
                    isError = true;
                }
                break;
            case 3:
                if (day >= 1 && day <= 31) {
                    if (day <= 21) {
                        burc = "boga";
                    } else
                        burc = "ikizler";

                } else {
                    isError = true;
                }
                break;
            case 4:
                if (day >= 1 && day <= 31) {
                    if (day <= 23) {
                        burc = "yengec";
                    } else
                        burc = "aslan";

                } else {
                    isError = true;
                }
                break;
            case 5:
                if (day >= 1 && day <= 31) {
                    if (day <= 23) {
                        burc = "basak";
                    } else
                        burc = "terazi";

                } else {
                    isError = true;
                }
                break;
            case 6:
                if (day >= 1 && day <= 31) {
                    if (day <= 23) {
                        burc = "akrep";
                    } else
                        burc = "yay";

                } else {
                    isError = true;
                }
                break;
            default:
                isError = true;

        }
        if (isError) {
            System.out.print("Hatali giris yaptiniz. Tekrar deneyiniz.");
        } else
            System.out.print("Burcunuz: " + burc);
    }
}
