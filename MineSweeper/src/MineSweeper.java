import java.util.Scanner;
public class MineSweeper {
    int rowNumber;
    int colNumber;

    public MineSweeper(int rowNum, int colNum) {

        rowNumber = rowNum;
        colNumber = colNum;
    }

    public void putMine(String [][][] _arr) {

        int mineCount = (int)(rowNumber * colNumber / 4);
        while (mineCount > 0){
            int location = (int) (Math.random() * rowNumber * colNumber);
            int x = location / colNumber;
            int y = location % colNumber;
            if (x < rowNumber && y < colNumber){
                _arr[x][y][0] = "*";
                _arr[x][y][1] = "0";
                mineCount--;
            }
        }
    }

    public int control(int x, int y, String[][][] _arr) {

        int sum = 0;
        for(int i = - 1; i < 2; i++) {
            for(int j = - 1; j < 2; j++) {
                if (x + i < 0 || y +j < 0) continue;
                if (x + i >= rowNumber || y +j >= colNumber) continue;
                if (i == 0 && j == 0) continue;
                if (_arr[x + i][y + j][0] == "*") sum++;
            }
        }
        return sum;
    }

    public void placeNumber(String[][][] _arr) {
        for(int i = 0; i < rowNumber; i++){
            for(int j = 0;j < colNumber; j++){
                if( _arr[i][j][0] == null) {
                    _arr[i][j][0] = String.valueOf(control(i, j, _arr));
                    _arr[i][j][1] = "0";
                }
            }
        }
    }

    public void printField(String[][][] _arr) {
        for(int i = 0;  i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                if (_arr[i][j][1] == "0") {
                    System.out.print("- ");
                } else {
                    System.out.print(_arr[i][j][0] + " ");
                }
            }
            System.out.print("\n");
        }
    }

    public void dataEntry(int x, int y , String[][][] _arr) {
        _arr[x][y][1]="1";
    }


    public void run() {

        String[][][] arr = new String[rowNumber][colNumber][2];

        Scanner input = new Scanner(System.in);
        putMine(arr);
        placeNumber(arr);
        int entrance = 0;
        int row;
        int col;
        while(rowNumber * colNumber - entrance>(int)(colNumber * rowNumber / 4)) {
            printField(arr);
            System.out.print("Satir sayisini giriniz : ");
            row = input.nextInt();
            System.out.print("Sutun sayisini giriniz : ");
            col = input.nextInt();
            if (arr[row][col][0].equals("*")) {
                dataEntry(row,col,arr);
                printField(arr);
                System.out.println("...Game Over...");
                break;
            } else {
                dataEntry(row, col, arr);
            }
            System.out.println("-----------------------------------------------------------");
        }
    }
}

/*
import java.util.Scanner;

public class MineSweeper {
    int rowCount;
    int colCount;
    int mineCount;
    char[][] gameBoard;
    char[][] gameMap;
    int satir;
    int sutun;
    int nearStarCount;

    MineSweeper(int row, int col) {
        this.rowCount = row;
        this.colCount = col;
        this.gameBoard = new char[row][col];
        this.gameMap = new char[row][col];
        this.mineCount = ((col * row) / 4);


    }

    void minePosition() { // ilk olara yıldızlar nereye onu random ile gameMap e atadık
        for (int i = 0; i < mineCount; i++) {
            while (true) {
                int a = (int) (Math.random() * rowCount);
                int b = (int) (Math.random() * colCount);
                if (gameMap[a][b] != '*')
                    gameMap[a][b] = '*';
                break;
            }
        }
    }

    void printGameMap() {
        System.out.println("Mayın Tarlasının Konumu");
        minePosition(); // ile yıldızları bastığımız metodu çağırdık Asıl işlem GameMap Arrayinde
        for (int i = 0; i < gameMap.length; i++) {
            for (int j = 0; j < gameMap[0].length; j++) {
                if (gameMap[i][j] != '*') { // ile yıldız olmayan yerlere - bastık
                    gameMap[i][j] = '-';
                }
                System.out.print(gameMap[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("==============================");
    }

    void elementsGameBoard() {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                gameBoard[i][j] = '-';
            }
        }
    }

    void printGameBoard() {
        for (int i = 0; i < this.gameBoard.length; i++) {
            for (int j = 0; j < this.gameBoard[i].length; j++) {
                System.out.print(this.gameBoard[i][j] + " ");
            }
            System.out.println();
        }
    }

    void getData() { // Kullanıcıdab bilgi alıyoruz
        boolean isTrue = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Seçmek istediğiniz noktanın satır ve sutun bilgilerini giriniz");
        System.out.print("Satır bilgisini giriniz:");
        satir = (scan.nextInt() - 1);
        System.out.print("Sutun bilgisini giriniz:");
        sutun = (scan.nextInt() - 1);
        while (!isTrue) { // isTrue == false ile aynı yanlış girerse tekrar istenir
            if (satir < 0 || satir > gameBoard.length - 1 || sutun < 0 || sutun > gameBoard[0].length - 1) {
                System.out.println("Hatalı bir giriş yaptınız tekrar giriniz.");
                System.out.print("Satır bilgisini giriniz:");
                satir = scan.nextInt() - 1;
                System.out.print("Sutun bilgisini giriniz:");
                sutun = scan.nextInt() - 1;
            } else
                isTrue = true;
        }
        System.out.println("=========================");
    }

    public int starCountonMap() { // Seçilen alan yakınında kaç tane yıldız var sayısını verir
        //Sağı - solu- yukarısı-aşağısı sağ,sol çapraz_üst - sağ,sol çapraz alt
        nearStarCount = 0;
        if (sutun + 1 < gameMap[0].length - 1) {
            if (gameMap[satir][sutun + 1] == '*')
                nearStarCount++;
        }

        if (sutun - 1 >= 0) {
            if (gameMap[satir][sutun - 1] == '*')
                nearStarCount++;
        }

        if (satir + 1 < gameMap.length - 1) {
            if (gameMap[satir + 1][sutun] == '*')
                nearStarCount++;
        }

        if (satir - 1 >= 0) {
            if (gameMap[satir - 1][sutun] == '*')
                nearStarCount++;
        }
        if (satir - 1 >= 0 && sutun - 1 >= 0) {
            if (gameMap[satir - 1][sutun - 1] == '*')
                nearStarCount++;
        }
        if (satir - 1 >= 0 && sutun + 1 < gameMap[0].length - 1)
            if (gameMap[satir - 1][sutun + 1] == '*')
                nearStarCount++;
        if (satir + 1 < gameMap.length - 1 && sutun - 1 >= 0)
            if (gameMap[satir + 1][sutun - 1] == '*')
                nearStarCount++;
        if (satir + 1 < gameMap.length - 1 && sutun + 1 < gameMap[0].length - 1)
            if (gameMap[satir + 1][sutun + 1] == '*')
                nearStarCount++;
        return nearStarCount;
    }

    public void changeBoardGame() {
        switch (starCountonMap()) { // Toplamda kaç tane yıldız varsa yakınında onun sayısını buluyoruz
            case 0:
                gameBoard[satir][sutun] = '0';
                gameMap[satir][sutun] = '0';
                break;
            case 1:
                gameBoard[satir][sutun] = '1';
                gameMap[satir][sutun] = '1';
                break;

            case 2:
                gameBoard[satir][sutun] = '2';
                gameMap[satir][sutun] = '2';
                break;

            case 3:
                gameBoard[satir][sutun] = '3';
                gameMap[satir][sutun] = '3';
                break;
            case 4:
                gameBoard[satir][sutun] = '4';
                gameMap[satir][sutun] = '4';
                break;

            case 5:
                gameBoard[satir][sutun] = '5';
                gameMap[satir][sutun] = '5';
                break;

            case 6:
                gameBoard[satir][sutun] = '6';
                gameMap[satir][sutun] = '6';
                break;
            case 7:
                gameBoard[satir][sutun] = '7';
                gameMap[satir][sutun] = '7';
                break;  // Daha fazla gidilebilirdi ben 7 ye kadar gittim
        }

    }

    boolean checkContinue() {
        for (int i = 0; i < gameMap.length; i++) {
            for (int j = 0; j < gameMap[0].length; j++) {
                if (gameMap[i][j] == '-')
                    return false;
            }
        }
        return true;
    }

    public void run() {
        printGameMap();// Yıldızlar gameMap arrayine eklendi ve yıldızlı hali ekrana bastık
        System.out.println("Mayın Tarlası Oyununa Hoşgeldiniz ! ");
        System.out.println("-----------------------------------");
        elementsGameBoard(); // İçerisinde yıldız görünmeyen kullanıcı oyun base i
        printGameBoard(); // ekrana bastık bunu
        while (true) { // Burada loop sayısı hesaplanıp for döngüsü de olabilirdi ama while(true) hayat kurtarır :)
            this.getData();
            if (gameMap[satir][sutun] == '*') {
                System.out.println("Mayına bastınız.");
                System.out.println("Game Over !!!");
                break;
            } else {
                changeBoardGame();
                printGameBoard();
                if ((checkContinue())) {
                    System.out.println("Tebrikler...Oyunu Kazandınız !");
                    break;
                }
            }
        }

    }
}
 */
