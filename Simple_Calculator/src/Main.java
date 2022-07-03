import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number1,number2,select;

        Scanner input =new Scanner(System.in);
        System.out.println("Ilk Sayiyi Giriniz :");
        number1=input.nextInt();

        System.out.println("Ikinci Sayiyi Giriniz :");
        number2=input.nextInt();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.println("Hangi Islemi Yapmak Istersiniz ? :");
        select=input.nextInt();

        /*if (select == 1){
            System.out.println("Sonuc: "+ (number1+number2));
        }else if (select == 2){
            System.out.println("Sonuc : "+ (number1-number2));
        }else if (select == 3){
            System.out.println("Sonuc : "+(number1*number2));
        }else if (select == 4){
            if (number2 !=0){
                System.out.println("Sonuc : "+(number1/number2));
            }else {
                System.out.println("Sayi sifira bolunemez");
            }
        }else {
            System.out.println("Hatali Giris Yaptiniz,Lutfen Tekrar Deneyiniz");
             */

        switch (select){
            case 1:
                System.out.println("Sonuc : "+(number1+number2));
                break;
            case 2:
                System.out.println("Sonuc : "+(number1-number2));
                break;
            case 3:
                System.out.println("Sonuc : "+(number1*number2));
                break;
            case 4:
                if (number2!=0){
                    System.out.println("Sonuc : "+(number1/number2));
                }else {
                    System.out.println("Sayi 0'a Bolunemez");
                }
                break;
            default:
                System.out.println("Hatali Secim Yaptiniz,Lutfen Tekrar Deneyiniz");
        }
    }
}

