import java.util.Scanner;

public class DeseneGore {
    static int f() {
        int result = 1;
        int result2 = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n1 = input.nextInt();

        for (int i = n1; i > -n1 - i; i -= 5) {
            result = i;
            System.out.print(result + " ");
            if (i <= 0) {
                for (int k = i; k <= n1; k += 5) {
                    result2 = k;
                    System.out.print(result2 + " ");
                }
            }
            if (result2 == n1) {
                break;
            }
        }
        System.out.println();
        return f();

    }
    public static void main(String[] args) {

        f();

    }
}
