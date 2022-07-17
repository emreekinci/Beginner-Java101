
public class Test {

    public static void main(String[] args) {
        
        /* without constructors
        Account account1 = new Account();
        
        account1.setHesapNo("1234");
        account1.setBakiye(2000);
        account1.setIsim("Emre Ekinci");
        account1.setEmail("asdasd@gmail.com");
        account1.setTelefonNo("646646468434\n");

        System.out.println("Hesabi : "+account1.getHesapNo());
        System.out.println("Bakiye : "+account1.getBakiye());
        System.out.println("Isim : "+account1.getIsim());
        System.out.println("Mail : "+account1.getEmail());
        System.out.println("Telefon no : "+account1.getTelefonNo());

         */

        Account account2 = new Account("123213",1000.0,"Emre Ekinci","emreekincivaljean@gmail.con","324324");

        // account2.paraYatir(500);


        account2.paraCekme(2000);
    }

}

