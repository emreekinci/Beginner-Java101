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

//version2
/*
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        // while döngüsü yardımıyla bir kullanıcı girişi yazmaya çalışın.
        
        Scanner scanner = new Scanner(System.in);
        
        int giris_hakki = 3;
        
        String sys_kullanici_adi = "Mustafa Murat";
        String sys_parola = "12345";
        
        System.out.println("*****************************");
        System.out.println("Kullanıcı Girişine Hoşgeldiniz...");
        System.out.println("*****************************");
        
        while (true) {
            System.out.print("Kullanıcı Adı : ");
            String kullanici = scanner.nextLine();
            System.out.print("Parola : ");
            String parola = scanner.nextLine();
            
            if (kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)) {
                System.out.println("Hoşgeldiniz, " + kullanici);
                break;
            }
            else if (kullanici.equals(sys_kullanici_adi) && !parola.equals(sys_parola)) {
                
                System.out.println("Parolanız Yanlış...");
                giris_hakki -= 1;
                
                System.out.println("Giriş Hakkı : " + giris_hakki);
                
                
            }
            else if (!kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)) {
                
                System.out.println("Kullanıcı Adınız Yanlış...");
                giris_hakki -= 1;
                System.out.println("Giriş Hakkı : " + giris_hakki);

                
            }
            else {
                System.out.println("Kullanıcı Adınız ve Parolanız Yanlış...");
                
                giris_hakki -= 1;
                System.out.println("Giriş Hakkı : " + giris_hakki);

                
            }
            if (giris_hakki == 0){
                
                System.out.println("Giriş hakkınız bitti. Tekrar Bekleriz....");
                break;  // exit to while loop
            }
           
        }
    }
}






*/
