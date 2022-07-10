import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.print("Basamak sayisini girin ;");
        int n=scanner.nextInt();

        int a = 0, b = 1, c;

        for (int i=1;i<=n;i++){
            c = a + b;
            System.out.println(a+"+"+b+"="+c);
            a = b ;
            b = c;
            System.out.println(" ");
        }
    }
}
