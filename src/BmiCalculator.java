import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {


        float height, weight;
        double bodyMassIndex;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your height in meters : ");
        height = input.nextFloat();

        System.out.print("Please enter your weight in kg : ");
        weight = input.nextFloat();

        bodyMassIndex = weight / (height * height);

        System.out.println("Your body mass index is : " + bodyMassIndex);

    }
}
