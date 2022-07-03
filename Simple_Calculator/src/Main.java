import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number1,number2,choose;

       import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number1,number2,choose;

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter First Number :");
        number1=scan.nextInt();

        System.out.println("Enter Second Number :");
        number2=scan.nextInt();

        System.out.println("1-Addition\n2-Extraction\n3-Multiplication\n4-Division");
        System.out.println("Which operation would you like to do ? :");
        choose = scan.nextInt();

        switch (choose){
            case 1:
                System.out.println("Result : "+(number1+number2));
                break;
            case 2:
                System.out.println("Result : "+(number1-number2));
                break;
            case 3:
                System.out.println("Result : "+(number1*number2));
                break;
            case 4:
                if (number2!=0){
                    System.out.println("Result : "+(number1/number2));
                }else {
                    System.out.println("Number cannot be divided by 0");
                }
                break;
            default:
                System.out.println("You Made a Wrong Choice, Please Try Again");
        }
    }
}
