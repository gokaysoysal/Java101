import java.sql.SQLOutput;
import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {

        String userName,password;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter username: ");
        userName = inp.nextLine();

        System.out.print("Enter password: ");
        password = inp.nextLine();

        if (userName.equals("kodluyoruz") && password.equals("org")) {
            System.out.print("Giris basarili!");
        }
        else    {
            System.out.print("Bilgileriniz yanlis!");
        }
    }
}
