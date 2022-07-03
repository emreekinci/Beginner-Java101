/*
Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
Geçme Notu : 55
        Ödev
Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            
        // defining variables
        int Math, Physics, Turkish, Chemistry, Music, average ;
        Scanner scan = new Scanner(System.in);

        // get note information from user
        System.out.println("Math score : ");
        Math = scan.nextInt();
        System.out.println("Physics score : ");
        Physics = scan.nextInt();
        System.out.println("Turkish score : ");
        Turkish = scan.nextInt();
        System.out.println("Chemistry score : ");
        Chemistry = scan.nextInt();
        System.out.println("Music score : ");
        Music = scan.nextInt();

        // for invalid input values --> for outside the range of 0 to 100
        if (Math < 0 || Math > 100)
            Math = 0;
        if (Physics < 0 || Physics > 100)
            Physics = 0;
        if (Turkish < 0 || Turkish > 100)
            Turkish = 0;
        if (Chemistry < 0 || Chemistry > 100)
            Chemistry = 0;
        if (Music < 0 || Music > 100)
            Music = 0;

        average = ( Math + Physics + Turkish + Chemistry + Music ) / 5 ;

        // info message about the result
        if (average < 55) {
            System.out.println("You failing the class !!! ");
        }
        else {
            System.out.println("You passed the class, congrats ...");
        }
        System.out.println("Your average is : " + average);
    }
}

