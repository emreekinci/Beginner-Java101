import java.util.Scanner;

class Main  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mayin tarlasi oynuna hosgeldin !\n"+
                "koordinat secerken ,bayrak dikmek istersen koordinattan sonra 'f' harfini gir ,ornegin : (3 1 f)\n"+
                "tarlanin boyutunu gir ,ornegin  (4 7)  : ");

        int x , y ;
        x = scanner.nextInt();
        y = scanner.nextInt();

        MineSweeper mineSweeper = new MineSweeper(x, y); // x, y users value.
        //mineSweeper.printMineMap();
        mineSweeper.run();
        scanner.close();
    }
}

/*
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Dizinin Satır sayısını giriniz:");
        int satirSayisi= scan.nextInt();
        System.out.print("Dizinin Sutun sayısını giriniz:");
        int sutunSayisi= scan.nextInt();
        MineSweeper minesweeper = new MineSweeper(satirSayisi, sutunSayisi);
        minesweeper.run();
    }
}
 */

