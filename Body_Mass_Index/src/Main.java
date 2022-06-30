import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double weight, height, mass_Index;
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter your weight = ");
        weight = scan.nextDouble();

        System.out.print("Please enter your height = ");
        height = scan.nextDouble();

        mass_Index =( weight /( height * height));

        System.out.println("Your BMI( Body Mass Index ) result is = " + mass_Index);
    }
}
