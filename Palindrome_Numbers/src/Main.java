import java.util.Scanner;

public class Main {
    static boolean isPalindrome(int  number){
        int temp = number, reverseNumber = 0, lastNumber;

        while (temp != 0){ // 1234
            lastNumber = temp % 10 ;   // 4 -> 3 -> 2 -> 1
            System.out.println("Last Number: "+lastNumber);

            reverseNumber =  (reverseNumber * 10) + lastNumber;
            System.out.println("Now reverseNumber : "+reverseNumber);

            temp /= 10;
        }
        if (number == reverseNumber){
            System.out.println(number+" is a Palindrome number.");
            return true;
        }
        System.out.println(number+" is not a Palindrome number.");
        return false;
    }



    public static void main(String[] args) {

        int n;
        boolean result;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        n = scanner.nextInt();
        result = isPalindrome(n);
        if (result == true){
            System.out.println("*********************\nBoolean return value is :"+result);
        }
        else System.out.println("*********************\nreturn value is : "+result);
        //System.out.println(isPalindrome(n));
    }
}
