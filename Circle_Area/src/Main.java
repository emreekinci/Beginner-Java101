import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pi = 3.14, r, degree, formula, area, perimeter;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter radius-r : ");
        r = scan.nextDouble();

        System.out.println("Please enter circle degree: ");
        degree = scan.nextDouble();

        area = pi * r * r;
        perimeter = 2 * pi * r;
        formula = (( pi * r * r * degree ) / 360 );

        if(formula == area) {
            System.out.println("Slice equal circle !!");
        }

        System.out.println("Perimeter of the circle: "+ perimeter);
        System.out.println("Area of the slice: "+formula);
        System.out.println("Area of the circle: "+area);


    }
}
