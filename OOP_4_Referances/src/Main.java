public class Main {

    public static void main(String[] args) {

        Account account1 = new Account("Mustafa Murat Coşkun","coskun.m.murat@gmail.com","34234");

        Account account2 = account1;

        Account account3 = new Account();

        if (account1 == account3 ) {
            System.out.println("Ayni Objeyi gosteriyorlar..."); // account1 = account2

        }
        else {
            System.out.println("Ayni Objeyi gostermiyorlar....");
        }

        new Account("Ahmet Can","example@gmail.com","65657").bilgilerigoster(); // obje ile erisim

    }

}
