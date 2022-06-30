import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    double a, b, c, u, perimeter, area;

    Scanner scan = new Scanner(System.in);
        System.out.println("Enter the sides of the triangle: "); // triangle sides: a,b,c
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();

        u = (a + b + c) / 2; // u = (perimeter / 2)
        perimeter = 2 * u;
        area = Math.sqrt(u*(u-a)*(u-b)*(u-c));   // area^2 = u * (u - a) * (u - b) * (u - c)
        System.out.println("Area of triangle: "+area);
    }

}
