import java.util.Scanner;

public class Scales {
    public static void main(String[] args) {

        double pearP = 2.14, appleP = 3.67, tomatoP = 1.11 , bananaP = 0.95, eggplantP = 5.00, totalItem, vat = 0.18, vatT;
        double pearK, appleK, tomatoK, bananaK, eggplantK, total;


        Scanner input = new Scanner(System.in);

        System.out.print("Please enter pear weight in kg : ");
        pearK = input.nextDouble();

        System.out.print("Please enter apple weight in kg : ");
        appleK = input.nextDouble();

        System.out.print("Plese enter tomato weight in kg : ");
        tomatoK = input.nextDouble();

        System.out.print("Please enter banana weight in kg : ");
        bananaK = input.nextDouble();

        System.out.print("Please enter eggplant weight in kg : ");
        eggplantK = input.nextDouble();

        totalItem = (pearK * pearP) + (appleK * appleP) + (tomatoK * tomatoP) + (bananaK * bananaP) + (eggplantK * eggplantP);
        vatT = totalItem * vat;
        total = totalItem + vatT;

        System.out.println("Total item is " + totalItem + " TL");
        System.out.println("VAT : " + vatT + " TL");
        System.out.print("Total : " + total + " TL");

    }
}
