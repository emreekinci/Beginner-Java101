import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pear_kg= 2.14 , apple_kg =3.67 , tomato_kg=1.11 , banana_kg=0.95 , eggplant_kg=5.0,
                amount_Pear, amount_Apple, amount_Tomato, amount_Banana, amount_Eggplant;
        double total_cost = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("How many kg of pear ? ");
        amount_Pear = scan.nextDouble();

        System.out.println("How many kg of apples ? ");
        amount_Apple = scan.nextDouble();

        System.out.println("How many kg of tomato ?");
        amount_Tomato = scan.nextDouble();

        System.out.println("How many kg of banana ?");
        amount_Banana = scan.nextDouble();

        System.out.println("How many kg of eggplant ?");
        amount_Eggplant = scan.nextDouble();

        total_cost = (pear_kg * amount_Pear) + (apple_kg * amount_Apple) + (tomato_kg * amount_Tomato)
                + (banana_kg * amount_Banana) + (eggplant_kg * amount_Eggplant) ;

        System.out.println("Total cost is : "+total_cost);

    }
}
