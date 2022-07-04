import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int temp;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a temperature value : ");
        temp = scan.nextInt();

        if (temp <= 5)
            System.out.print("You can ski...");

        else if (temp > 5 && temp <= 25) {
            if (temp > 5 && temp <= 15) {
                System.out.println("You can go to the cinema...");
            }
            if (temp > 10 && temp < 25) {
                System.out.println("Or u can go on a picnic...");
            }/* else
            System.out.println("You can go on a picnic...");*/
        }
         /*else if ((temp >5) && (temp <=15))
            System.out.print("Sinemaya gidebilirsiniz!");
        else if (temp >10 && temp <=25)
            System.out.println(" Veya piknik yapabilirsiniz!");*/
            if (temp >= 25 )
                System.out.print("You can go swimming...");
        }
}
