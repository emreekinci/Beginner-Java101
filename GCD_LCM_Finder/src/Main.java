import java.util.Scanner;
import java.io.*;

public class Main {
            // gcd method returns the GCD of a and b
            static int gcd(int a, int b) { //EBOB

                // if b=0, a is the GCD
                if (b == 0)
                    return a;

                    // call the gcd() method recursively by
                    // replacing a with b and b with
                    // modulus(a,b) as long as b != 0
                else
                    return gcd(b, a % b);
            }

            // lcm() method returns the LCM of a and b
            static int lcm(int a, int b, int gcdValue) //EKOK : ( n1 * n2 ) / EBOB
            {
                return Math.abs(a * b) / gcdValue;
            }

            // Driver method
            public static void main(String[] args) {

                int a, b, gcdValue;
                Scanner scan = new Scanner(System.in);
                System.out.println("Please enter first number : ");
                a = scan.nextInt();
                System.out.println("Please enter second number : ");
                b = scan.nextInt();

                gcdValue = gcd(a, b);

                // calling gcd() over
                System.out.println("GCD = " + gcdValue);

                // calling lcm() over integers 30 and 20
                System.out.println("LCM = " + lcm(a, b, gcdValue));
            }

    }






//version2
/*
import java.util.Scanner;


public class Main {
    public static int ebobBulma(int sayi1,int sayi2) {
        
        int ebob = 1;
        
        for (int i = 1; i <= sayi1 && i <= sayi2 ; i++) {
            if ((sayi1 % i == 0) && (sayi2 % i == 0) ){
                
                ebob = i;
            }
           
        }
        return ebob;
        
    }
    
    
    public static void main(String[] args) {
        // Kullanıcıdan alınan 2 sayının ebobunu bulma
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Birinci Sayı : ");
        int birinci_sayi = scanner.nextInt();
        
        System.out.print("İkinci Sayı : ");
        int ikinci_sayi = scanner.nextInt();
        System.out.println("İki Sayının Ebobu : " + ebobBulma(birinci_sayi, ikinci_sayi));         
    }
}      
        
*/
