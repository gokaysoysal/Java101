import java.util.Scanner;

public class DeseneGore {
    static int loop(int n) {
        for (int i = n; i >= -4; i -= 5) {
            System.out.print(i + " ");
            if (i <= 0) {
                for (int m = i; m <= n; m += 5) {
                    System.out.print(m + " ");
                }
            }
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int k = input.nextInt();
        loop(k);
    }
}
