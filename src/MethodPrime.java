import java.util.Scanner;

public class MethodPrime {
    static boolean isPrime(int n) {
        for (int i = 2; i < 10; i++) {
            int result = n % i;
            if (result == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter prime number: ");
        int k = input.nextInt();
        System.out.print(isPrime(k));
    }
}
