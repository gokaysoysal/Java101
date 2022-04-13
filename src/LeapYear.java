import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;

        Scanner scan = new Scanner(System.in);

        System.out.print("enter a year: ");
        year = scan.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 != 0)
            {
                System.out.println(year + " is not leap a year");
            }else {
                System.out.println(year + " is leap a year");
            }

        }else {
            System.out.println(year + " is not leap a year");
        }
    }
}
