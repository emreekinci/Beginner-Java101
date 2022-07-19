
public class Test {
    /*
    *      3 constructor and 3 method
    * */
    public static void main(String[] args) {

        Account account1 = new Account(); //added
        account1.paraYatir(12000);
        account1.setEmail("setemailusing@gmail.com");
        account1.setIsim("Set Name");

        //System.out.println(account1.getEmail());
        Account account2 = new Account("Ahmet Can","example@gmail.com","87987897");

        System.out.println(account2.getEmail());
        System.out.println(account2.getBakiye());

        account2.setBakiye(8500);//added
        account1.bilgilerigoster();
        account2.bilgilerigoster();

    }
}
