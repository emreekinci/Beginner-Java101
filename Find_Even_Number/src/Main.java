import java.util.Scanner;
/*
Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazıyoruz.
        Ödev
        Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
 */

public class Main {
    public static void main(String[] args) {
        int count = 0 , Up_limit = 0; ;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Set an upper limit : ");
        Up_limit = scanner.nextInt();

        if(Up_limit >= 0){
            while( Up_limit >= count ){
                System.out.println("Odd number : "+count);
                count+=2;
            }
        }// loop end
        else {
            System.out.println("Please enter a correct value between 0 to \"infinite\"  ");
        }
    }
}
