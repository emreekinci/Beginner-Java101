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

