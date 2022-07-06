import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a year : ");
        int year = scan.nextInt();

        boolean leap = false;

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;

        if(leap)
            System.out.println(year + " is a Leap Year :) ");
        else
            System.out.println(year + " is not a Leap Year !! ");
    }
}












/*
Alternative solution :

 Scanner scanner = new Scanner(System.in);

    int yil;

        System.out.println("Yıl giriniz");

                yil = scanner.nextInt();

                //100 ün katı olmayıp 4 e kalansız bölünme koşulu
                if((yil % 100 != 0) && (yil %4 == 0)){
                System.out.println(yil + "senesi bir artık yıldır");
                }
                //100 ün katı ve 400 e tam bölünebilme koşulu
                else if((yil % 100 == 0) && (yil % 400 == 0)){
                System.out.println(yil + "senesi bir artık yıldır.");
                }
                else if((yil % 100 == 0) && (yil % 400 != 0)){
                System.out.println(yil + "senesi bir artık yıl değildir.");  
                
                
                
 */
