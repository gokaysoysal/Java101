import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int num,sum=0;


        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = input.nextInt();

        for (int i = 1; i<num; i++){
            if (num%i ==0){
                sum+=i;

            }
        }
        if (sum==num){
            System.out.print(num + " is perfect number!");
        }else
            System.out.print(num + " is not perfect number!");
    }
}
