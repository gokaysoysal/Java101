import java.util.Scanner;

public class Heat {
    public static void main(String[] args) {

        int heat;

        Scanner input = new Scanner(System.in);

        System.out.print("Sicakligi giriniz: ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.print("Kayak yapabilirsiniz.");
        }
        else if (heat <=25 ) {
            if (heat < 15 ) {
                System.out.println("Sinemaya gidebilirsiniz.");
            }
            if ( heat >= 10) {
                System.out.println("Piknige gidebilirsiniz.");
            }
        }
        else
            System.out.print("Yuzmeye gidebilirsiniz.");

    }
}
