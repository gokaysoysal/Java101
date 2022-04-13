import  java.util.Scanner;

public class TicketPrice {
    public static void main(String[] args) {
        int distance, age, type;
        double perKm = 0.10, standart, cocuk, genc, yasli;



        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi giriniz: ");
        distance = input.nextInt();
        System.out.print("Yasinizi giriniz: ");
        age = input.nextInt();
        System.out.println("Bilet opsiyonu seciniz" + "\n1)Tek yon\n2)Gidis-Donus");
        type = input.nextInt();

        standart = perKm * distance;
        cocuk   = standart * 0.5;
        genc = (standart) - standart * 0.1;
        yasli = (standart) - standart * 0.3;


        if (type == 1){
            if (age >=0 && age < 12){
                System.out.print(standart - cocuk);
            }else if (age >=12 && age <25){
                System.out.print(standart - genc);
            }else if (age >=26 && age <64) {
                System.out.print(standart);
            }else if (age>=64 ) {
                System.out.print(standart - yasli);
            }else{
                System.out.print("Geçersiz giriş yaptınız!");
            }
        }
        else if (type == 2){
            if (age >=0 && age < 12){
                System.out.print((cocuk)-cocuk * 0.2);
            }else if (age >=12 && age <25){
                System.out.print((genc) - genc *0.2);
            }else if (age>=25 && age <64){
                System.out.print((standart)-standart*0.2);
            }else if (age>=64 ) {
                System.out.print((yasli) - yasli * 0.2);
            }else{
                System.out.print("Geçersiz giriş yaptınız!");
            }
        }
    }
}
