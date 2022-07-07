import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String password = "" ;
        boolean isPasswordTrue = true ;
        int error_count = 3;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please create a password for user login !!\nPassword is : ");
        password = scan.nextLine();

        while (isPasswordTrue){

            String Control_password = "";
            System.out.println("\nEnter password to login : ");
            Control_password = scan.nextLine();

            error_count--;
            System.out.println("error count: "+error_count);
            if( password.equals(Control_password)){
                    System.out.println("Succesful login with : "+password);
                    isPasswordTrue = false;
            }
            else {
                System.out.println("Failed login process !!");
                System.out.println("\nwrong password is : "+Control_password+"\nTrue password is : "+password+"\nIncorrect number of entries : "+error_count);
            }
            if (error_count == 0) isPasswordTrue = false;

        }
    }
}
