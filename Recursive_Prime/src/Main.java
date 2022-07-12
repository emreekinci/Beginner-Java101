import java.util.Scanner;

public class Main {
    static boolean checkPrime(int number,int index){
        if(number<=2){
            return (number==2)?true:false;
        }
        if(number % index==0){
            return false;
        }
        if(index*index>number){
            return true;
        }
        return checkPrime(number,index+1);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while(true){
            char exit;
            System.out.print("*****************************\nInfo !!\nFor Exit Program : press Y\nPlease enter a character(Y/N) : ");// Y N
            exit = scan.next().charAt(0);
            if (exit == 'Y') return ;

            System.out.print("Please enter a number : ");
            int number = scan.nextInt();

            if(checkPrime(number,2)){
                System.out.println(number+" is a prime number.!");
            }else{
                System.out.println(number+" is not a prime number !");
            }
        }
    }
}

