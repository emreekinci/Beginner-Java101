import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, r, n_Fact = 1, r_Fact = 1, nr_Fact = 1;
        double combination;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number n : ");
        n = input.nextInt();

        System.out.print("Please enter the number r : ");
        r = input.nextInt();

        for (int counter = 1; counter <= n; counter++) {
            n_Fact *= counter;
        }

        for (int counter = 1; counter <= r; counter++) {
            r_Fact *= counter;
        }

        int n_r = n - r;
        for (int counter = 1; counter <= n_r; counter++) {
            nr_Fact *= counter;
        }

        //C(n,r) = n! / (r! * (n-r)!)
        combination = n_Fact / ( r_Fact * nr_Fact );
        System.out.println("n = " + n + " r = " + r + " while combination : " + combination);

        input.close();

    }
}
