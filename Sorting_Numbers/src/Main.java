import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float num_1, num_2, num_3, max= 0;

        // sorting numbers : descending
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please enter first number: ");
        num_1 = scanner.nextFloat();

        System.out.println("Please enter second number: ");
        num_2 = scanner.nextFloat();

        System.out.println("Please enter third number: ");
        num_3 = scanner.nextFloat();

        if ((num_1 > num_2) && (num_1 > num_3)) {
            if (num_2 > num_3) {
                System.out.print("num1>num2>num3");
            } else {
                System.out.print("num1>num3>num2");
            }
        } else if ((num_2 > num_1) && (num_2 > num_3)) {
            if (num_1 > num_3) {
                System.out.print("num2>num1>num3");
            }else {
                System.out.print("num2>num3>num1");
            }

        } else{
            if (num_1 > num_2){
                System.out.print("num3>num1>num2");
            }else{
                System.out.print("num3>num2>num1");
            }
        }
    }
}


