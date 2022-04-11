import java.util.Scanner;

public class Avarage {
    public static void main(String[] args) {

        // Değişkenleri oluştur
        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = inp.nextInt();

        System.out.print("Turkce Notunuz: ");
        turkce = inp.nextInt();

        System.out.print("Muzik Notunuz: ");
        muzik = inp.nextInt();

        double avarage = (mat + fizik + kimya + turkce + muzik)/5;

        if (avarage <= 55) {

            System.out.println("Sinifta kaldiniz!");

        }
        else {
            System.out.println("Tebrikler, sinifi gectiniz!");
        }
            System.out.println("Ortalama: " + avarage);
    }
}