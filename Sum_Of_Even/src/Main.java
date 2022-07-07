import java.util.Scanner;

/*

    Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden ve girilen
    değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.

    Ödev
    Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden
    çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
 */

public class Main {
    public static void main(String[] args) {

        int num;
        int total = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Please enter number( odd ) : ");
            num = scanner.nextInt();
            if( num % 4 == 0){
                total+=num;
            }
            System.out.println("Subtotal is : "+total);
        }while (num % 2 == 0);
        System.out.println("Result total is : "+total);

    }
}
