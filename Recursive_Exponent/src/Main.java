import java.util.Scanner;

public class Main {

    static int result = 1;
    static int us(int y, int x){  // base^x
        /*if (x == 0){
            return 1;
        }*/
        while (x != 0){
            result *= y;
            us(y,x-1);
            return result;
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int  base, x;

        System.out.print("Base number : "); //5
        base = scan.nextInt();
        System.out.print("Exponential number : "); //3
        x = scan.nextInt();

        System.out.println("Base: "+base+"\nExponent: "+x +"\n"+base+" ^ "+x +": "+us(base,x));
    }
}

