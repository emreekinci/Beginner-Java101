import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int step;
        Scanner scan = new Scanner(System.in);

        System.out.print("Please write the number of digits of the inverted triangle :");
        step = scan.nextInt();

        for (int i=step; i >0 ; i--){
            for (int k=step-i; k>0; k--){
                System.out.print(" ");
            }

            for (int j=(2*i)-1; j>0; j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
