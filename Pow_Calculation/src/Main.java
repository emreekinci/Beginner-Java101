import java.util.Scanner;
/*
* Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı yazıyoruz.

Ödev
Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
* */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  Z^+ : positive integer
        System.out.println("Please enter positive numbers !!\n\texample: x^y \n(x, y) > 0 and (x, y) is Z^+ ");

        System.out.println();
        System.out.print("Base : ");
        int x = sc.nextInt();

        System.out.print("Exponent : ");
        int y = sc.nextInt();

        int total = 1;

        for (int i=1;i<=y;i++) {
            total*=x;
        }
        System.out.println("Total : "+ total);
    }
}

