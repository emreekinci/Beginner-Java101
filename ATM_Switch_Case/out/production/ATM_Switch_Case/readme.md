import java.util.Scanner;

>public class Main {<br>
    public static void main(String[] args) {<br>
        String userName, password;<br>
        Scanner input = new Scanner(System.in);<br>
        int right = 3;<br>
        int balance = 1500;<br>
        int select;<br>
        while (right > 0) {<br>
                System.out.print("Kullanıcı Adınız :");<br>
                userName = input.nextLine();<br>
                System.out.print("Parolanız : ");<br>
                password = input.nextLine();<br>
                if (userName.equals("patika") && password.equals("dev123")) {<br>
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");<br>
                do {<br>
                    System.out.println("1-Para yatırma\n" +<br>
                            "2-Para Çekme\n" +<br>
                            "3-Bakiye Sorgula\n" +<br>
                            "4-Çıkış Yap");<br>
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");<br>
                    select = input.nextInt();<br>
                    if (select == 1) {<br>
                        System.out.print("Para miktarı : ");<br>
                        int price = input.nextInt();<br>
                        balance += price;<br>
                    } else if (select == 2) {<br>
                        System.out.print("Para miktarı : ");<br>
                        int price = input.nextInt();<br>
                        if (price > balance) {<br>
                            System.out.println("Bakiye yetersiz.");<br>
                        } else {<br>
                            balance -= price;<br>
                        }<br>
                    } else if (select == 3) {<br>
                        System.out.println("Bakiyeniz : " + balance);<br>
                    }<br>
                } while (select != 4);<br>
                System.out.println("Tekrar görüşmek üzere.");<br>
                break;<br>
            } else {<br>
                right--;<br>
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");<br>
                if (right == 0) {<br>
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");<br>
                } else {<br>
                    System.out.println("Kalan Hakkınız : " + right);<br>
                }<br>
            }<br>
        }<br>
    }<br>
}<br>

## Ödev

> Aynı projedeki ATM işlemlerini "Switch-Case" kullanarak yapınız.