import java.util.Scanner;

/*
Ödev
Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.

Örnek : 1643 = 1 + 6 + 4 + 3 = 14
*/

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        /*
        Ödev
        Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
        Örnek : 1643 = 1 + 6 + 4 + 3 = 14
         */

        System.out.print("Enter a number :  ");
        int sayi = scn.nextInt();
        int total = 0;

        do{
            int lastDigit = sayi % 10;
            sayi = sayi/10;
            System.out.print(lastDigit);
            if(sayi != 0){
                System.out.print("+");
            }
            total += lastDigit;
        }while(sayi != 0);

        // Sonucu basar
        System.out.println(" = " + total);

        /*
            Örnek Çıktı:
            Sayi girin: 9087
            7+8+0+9 = 24
         */


        for (int k = 1; k < 1000; k++) {
            int counter = 0, result = 0; //we declared these two integer in this loop bc at the end
            // of every loop, we have to initialise these two variables to make sure that they
            // don't affect the result variable.
            int temp = k, mod;
            while (temp != 0) { //find the number of digit : Basamak sayısını bulduk
                temp /= 10;
                counter++;
            }
            temp = k;
            while (temp != 0) {
                mod = temp % 10;
                int init = 1;
                for (int i = 1; i <= counter; i++) {
                    init *= mod;
                }
                result += init;
                temp /= 10;
            }
            if (result == k) {
                System.out.println(k + "     is an Armstrong Number.");
            }
        }
    }
}
