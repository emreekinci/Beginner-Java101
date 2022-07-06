import java.util.Scanner;

/*    Conditions
BMI  < 18.5      : Weak
18.5 < BMI < 25  : Normal
25   < BMI < 30  : Overweight
> 30  : Obese
*/
public class Main {
    public static void main(String[] args) {
        int kg = 0 ;
        double height= 0, Bmı = 0;  // Bmı : Body Mass Index
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your kg : ");
        kg  = scanner.nextInt();

        System.out.print("\nYour height : ");
        height = scanner.nextDouble();

        Bmı = (kg / (height * height));
        
        if(Bmı < 18.5){
            System.out.println("weak");
        } else if (Bmı >= 18.5 && Bmı < 25) {
            System.out.println("Normal ");
        } else if (Bmı >= 25 && Bmı < 30) {
            System.out.println("Overweight");
        }
        else System.out.println("Obese");
        System.out.println("Your BMI value is : "+Bmı);
    }
}
