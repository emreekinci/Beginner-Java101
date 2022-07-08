import java.util.Scanner;

/*Java döngüler ile girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran programı yazıyoruz.

Ödev
Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.*/

public class Main {
    public static void main(String[] args) {

        int number;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a positive number : ");
        number = scanner.nextInt();

        if (number >= 1){
            int power_four = 0;
            for (int i = 1; i <= number; i *= 4){
                System.out.println("4 ^ " + power_four + " : " + i);
                power_four++;
            }
            System.out.println("\n***************\n");

            int power_five = 0;
            for (int i = 1; i <= number; i *= 5){
                System.out.println("5 ^ " + power_five + " : " + i);
                power_five++;
            }
        }
        else System.out.println("Negative numbers are not exponentiated !! ");
        scanner.close();
    }
}

