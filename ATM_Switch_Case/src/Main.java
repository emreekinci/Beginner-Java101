import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i=1000,toplam=0,q=3;

        System.out.print("Please enter username : ");
        String t=scanner.nextLine();

        System.out.print("Please enter password : ");
        String k=scanner.nextLine();

        if(t.equals("emre") && k.equals("99")) {
            System.out.println("***********************\nTo deposit money -> 1 \n" +
                    "Withdraw money -> 2\n" +
                    "Money inquiry -> 3\n" +
                    "Exit -> 4 \n***********************");
            System.out.print("Please choose your transaction number : ");
            int select =scanner.nextInt();

            switch (select){
                case 1:
                    System.out.println("Amount of money : "); // para miktarı
                    int b=scanner.nextInt();
                    i+=b;
                    System.out.print("Total money:  "+i);break; // Balance : bakiye
                case 2:
                    System.out.print("Amount to be withdrawn: "); // çekilecek miktar
                    int h=scanner.nextInt();
                    if(h>i){
                        System.out.println("insufficient balance : "); // yetersiz bakiye
                        break;}
                    else {
                        i -= h;
                        System.out.println("Balance : " + i);
                    }break;

                case 3:
                    System.out.println("Your current balance : "+i);break;
                case 4:
                    System.out.println("Good Bye , See you later...");break;
            }
        }
        else {
            q--;
            System.out.println("You entered an incorrect username or password !!\n.");
            if(q==0)
                System.out.println("Your account has been blocked. Contact the bank.");
        }
    }
}
