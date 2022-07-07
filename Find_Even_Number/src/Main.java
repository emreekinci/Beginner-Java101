import java.util.Scanner;
/*
Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazıyoruz.
        Ödev
        Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
*/

public class Main {
    public static void main(String[] args) {
        int flag = 1, count = 2 , Up_limit = 0, sum = 0;
        double avg = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Set an upper limit : ");
        Up_limit = scanner.nextInt();

        if(Up_limit > 0){
            while( Up_limit >= count ){
                if (count % 12 == 0){
                    //flag = 1;
                    sum+=count;
                    avg = sum / flag ;
                    System.out.println("_____________________________"+"\nStart FLAG: "+flag+"\n****************************");
                    System.out.println("\nSum of numbers from 0 to up limit : "+sum+
                            "\nThe average of these numbers : "+avg);
                    flag++;
                }
                //System.out.println("Odd number : "+count);

                count+=2;
            }
            System.out.println("\n****************************\nEnd sum value: "+sum+"\nEnd avg value: "+avg+"\nExit Flag(next start flag): "+flag);
        }// loop end
        else {
            System.out.println("Please enter a correct value between 0 to \"infinite\"  ");
            //System.out.println(336/7);
        }
    }
}



/*
public class Main {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        int limit = 0,sayilar = 0,toplam=0;
        System.out.print("Limit sayisini giriniz : ");
        limit = oku.nextInt();
        for(int i =1; i < limit ; i++)
        {
            if(i%3 == 0 && i%4 ==0) {
                sayilar += i;
                toplam++;
            }
        }

        System.out.print("Toplam " + toplam + " sayinin ortalamasi : " + (sayilar/toplam));
    }
}
*/
