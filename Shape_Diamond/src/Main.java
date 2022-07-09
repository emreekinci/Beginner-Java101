import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.print("Please enter the number of lines of the triangle : ");
        int step = scanner.nextInt(); // 10 --> upper triangular
        int rev_step = step-1;        // 10 - 1 : 9

        for (int i = 1; i<=step; i++){

            for (int m = 1; m<=step-i; m++){
                System.out.print(" ");
            }

            for (int k =1; k<=2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i<=rev_step; i++){

            for (int m = 1; m<=i; m++){
                System.out.print(" ");
            }
            for (int k = 1; k<= (2*step)-(2*i+1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
