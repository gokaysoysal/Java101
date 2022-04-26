import java.util.Scanner;
public class FibSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first= 0, second=1;

        System.out.print("Enter a number: ");
        int m = input.nextInt();

        System.out.print( "1 ");
        for (int i=2;i<=m;i++){
             int fib = first + second;

             System.out.print(fib + " ");
             first = second;
             second = fib;
        }
    }
}
