public class Main {
    public static void toplama(int a , int b ,int c) { // a, b, c : local var.

        //int deneme = 10; // local var : deneme
        System.out.println("Toplama Sonucu: " + (a+b+c));

    }
    public static void main(String[] args) {

        toplama(10,20,30);
        //System.out.println(deneme); // not local deneme !! **error -->java: cannot find symbol

        int a = 4;
        String yazdir = "Merhabalar..."; // yazdir : local

        if(a < 10){
            System.out.println(yazdir); // yazdir : local
        }
    }
}

