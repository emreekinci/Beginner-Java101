import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        for (int a=1;a<=100;a++) {
            int kont = 0;
            for (int i = 1; i <= a; i++) {
                if (a % i == 0) {
                    kont++;
                }
            }
            if (kont == 2) {
                System.out.print(a + " ");
            }
        }
    }
}





/*
//version2
public class Main {
    public static boolean asalMi(int sayi) {
        
        for (int i = 2 ; i < sayi;i++) {
            
            if (sayi % i == 0){
                return false;
                
            }
        }
        return true;
        
        
    }
    public static void main(String[] args) {
        
        
        for (int i = 2 ; i < 1000 ; i++) {
            
            if (asalMi(i)){
                System.out.println(i);
                
            }
        }
        /*
        1'den 1000'e kadar olan sayılardan asal olanları ekrana yazdırın.
        
        Asal Sayı : 1'e ve kendisinden başka hiçbir sayıya bölünmeyen sayıya asal sayı denir.
        */    
    }
}// version2 end
*/


//   ????
        /*
        int prime;
        int st = 1;
        int end= 100;

        while(end !=0){
            prime = 0;
            end--;
            while(st != 100){
                st++;
                if(end % st == 0){
                    prime++;
                }
            }
            if(prime == 2){
                System.out.println(end+" ");
            }
        }*/

