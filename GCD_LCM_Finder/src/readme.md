```import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1,n2,ebob=1;

        Scanner scan = new Scanner(System.in);

        System.out.print("N1 sayisini giriniz : ");
        n1 = scan.nextInt();

        System.out.print("N2 sayisini giriniz : ");
        n2 = scan.nextInt();

        //Finding GCD
        if(n1<n2){
            int i =n1;
            while (i>=1){
                if (n1%i == 0 && n2%i == 0){
                    ebob=i;
                    System.out.println(n1 + " ve " + n2 + " sayilarinin ebobu : " + ebob);
                    break;
                }
                i--;
            }

        }else if (n2<n1){
            int j = n2;
            while (j>=1){
                if (n1%j == 0 && n2%j == 0){
                    ebob=j;
                    System.out.println(n1 + " ve " + n2 + " sayilarinin ebobu : " + ebob);
                    break;
                }
                j--;
            }
        }
        //Finding LCM
        System.out.println(n1 + " ve " + n2 + " sayilarinin ekoku : " + (n1*n2/ebob));
    }
}
