import java.util.Scanner;

// perfect number : 28, 496

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, sum = 0;
        char stop = 'a' ;

        System.out.println("If you want to exit the program \"press s\" !!");

        while(stop != 's'){
            System.out.print("To exit the program(press s) : ");
            stop = input.next().charAt(0); // character : next(), nextChar()

            System.out.print("\nIs this a perfect number : ");
            n = input.nextInt();

            for (int i = 1; i <= n-1; i++) {
                if (n % i == 0) {
                    sum += i;
                }
                //System.out.println("Sum : "+sum);
            }
            if (sum == n) {
                System.out.println(sum+" is a perfect number .");
            } else {
                System.out.println(sum+" is not a perfect number !!");
            }
        }
    }
}
