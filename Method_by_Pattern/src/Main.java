
import java.util.Scanner;

public class Main {
    static int negative(int x) {
        if (x <= 0) {
            return x;
        } else {
            System.out.print(x + " ");
            return negative(x - 5);
        }
    }

    static int positive(int x, int y) {
        if (x > y) {
            return x;
        } else {
            System.out.print(x + " ");
            return positive(x + 5, y);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number : ");
            int number = scan.nextInt();

            int desc = negative(number);
            positive(desc, number);

            if (number == 0) {
                break;
            }
            System.out.println("\n*******************************\nEnter 0 or a negative number to exit.\n");
        }
    }
}



