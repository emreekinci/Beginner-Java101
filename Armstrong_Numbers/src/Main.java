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


//*****************************************************************************************

/*
version 2

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        /*
        Girilen bir sayının armstrong sayısını olup olmadığını bulmaya çalışın.
        Örneğin, 4 basamaklı bir sayının armstrong sayısı olması için şu şartı sağlaması gerekmektedir.
        1634 = 1^4 + 6^4 + 3^4 + 4^4 (Buradaki 4 basamak sayısı)
        371 = 3^3 + 7^3 + 1^3 (Buradaki 3 basamak sayısı)
    
        Bu programı do while döngüsü yardımıyla yapabilirsiniz.
        */
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Sayıyı Giriniz: ");
        int sayi = scanner.nextInt();
        System.out.print("Basamak Sayısı : ");
        int basamak_sayisi = scanner.nextInt();
        
        int gecici_sayi = sayi;
        int toplam = 0;
        
        do {
            int basamak_degeri = gecici_sayi % 10;
            gecici_sayi /= 10;
            
            toplam += Math.pow(basamak_degeri,basamak_sayisi); // pow( base, exponent )
            System.out.println("Sayinin simdiki degeri : "+toplam);
        }while(gecici_sayi > 0);
        
        if (sayi == toplam) {
            
            System.out.println("Bu sayı bir armstrong sayısıdır...");
        }
        else {
            System.out.println("Bu sayı bir armstrong sayısı değildir...");
        } 
    }
}

*/
