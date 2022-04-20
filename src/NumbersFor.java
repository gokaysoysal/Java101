import java.util.Scanner;

public class NumbersFor {

    public static void main(String[] args) {
        int i, k, total =1;

        Scanner input = new Scanner(System.in);

        System.out.print("Ussu alinacak sayiyi girin: ");
        i = input.nextInt();
        System.out.print("Us olacak sayiyi girin: ");
        k = input.nextInt();

        for (int y=1; y<=k; y++){
            total *=i;
        }
        System.out.print(total);

    }}
