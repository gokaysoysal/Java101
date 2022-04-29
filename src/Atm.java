import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName, password;
        int right = 3, balance = 1500, select;

        while (right > 0) {
            System.out.print("Kullanici adinizi girin: ");
            userName = input.nextLine();
            System.out.print("Parolanizi girin: ");
            password = input.nextLine();
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Kodluyoruz Bank'a hos geldiniz.");
                do {
                    System.out.println("1)Para yatirma\n" + "2)Para cekme\n" + "3)Bakiye sorgulama\n" + "4)Cikis yap");
                    System.out.print("Yapmak istediginiz islemi secin: ");
                    select = input.nextInt();

                    switch (select) {
                        case (1):
                            System.out.print("Yatirilacak tutar: ");
                            int add = input.nextInt();
                            balance += add;
                            System.out.print("Hesabinizdaki yeni tutar: " + balance + "\n");
                            break;

                        case (2):
                            System.out.print("Cekmek istediginiz tutar: ");
                            int pay = input.nextInt();
                            if (pay > balance) {
                                System.out.print("Yetersiz bakiye.");

                            } else {
                                balance -= pay;
                                System.out.print("islem basarili.\n" + "Kalan bakiye: " + balance + "\n");
                            }
                            break;
                        case (3):
                            System.out.print("Bakiyeniz: " + balance + "\n");
                            break;
                        case (4):
                            System.out.print("Cikis basarili.");
                    }
                } while (select != 4);
                {
                    break;
                }
            } else {
                right--;
                System.out.print("sifre ve ya parolayi yanlis girdiniz.\n" + "Kalan giris hakkiniz: " + right + "\n");
                switch (right) {
                    case (0):
                        System.out.print("kartiniz bloke olmustur.");
                        break;
                }
            }

        }
    }
}
