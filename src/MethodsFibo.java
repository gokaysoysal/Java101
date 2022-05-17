import java.util.Scanner;

public class MethodsFibo {
    static int fib(int n) {

        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter the number to follow: ");
        int k = input.nextInt();

        System.out.print(fib(k));
    }
}
