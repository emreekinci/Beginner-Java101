import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName = "Emre Ekinci", password = "Valjean_Java135" , newPassword;

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter username : ");
        userName = scan.nextLine();

        System.out.print("Please enter password : ");
        password = scan.nextLine();

        if( userName.equals("Emre Ekinci") && password.equals("Valjean_Java135")  ){
            System.out.println("\t --> Login Successful ");
        }
        else{
            System.out.println("\t --> Login Failed ): !");
            System.out.print("Do you want to reset your password?" +
                    "\n1 : Yes, I want" + "\n2 : No, I do not want." +
                    "\nPlease make your selection : ");

            int selection = scan.nextInt();
            scan.nextLine();

            switch(selection){
                case 1:
                    System.out.print("Please enter a new password : ");
                    newPassword = scan.nextLine();

                    if(newPassword == password ){ // old password: Valjean_Java135
                        System.out.print("You cannot enter your old password.\nPlease enter a different password\n");
                    }
                    else{
                        System.out.print("Congratulations, password changed.\n--> Your new password : " + newPassword);
                    }
                    break;
                case 2:
                    System.out.print("The password has not been changed !!");
                    break;
                default:
                    System.out.print("You made an incorrect entry!!");
            }
        }
    }
}
