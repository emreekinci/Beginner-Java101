
import java.util.Arrays;
// add user col and row numbers
public class Main {
    public static void main(String[] args) {
        String[][] character = new String[7][4]; // row: 7  ,col: 4

        for(int i=0; i<character.length; i++){
            for (int j=0; j<character[i].length; j++){
                if(i==0||(i==3||i==6)){
                    if( (i==0 && j==3) || (i==3 && j==3) || (i==6 && j==3) )
                    {
                        character[i][j] = " ";
                        continue;
                    }
                    character[i][j]=" * ";
                } else if (j==0||j==3) {
                    character[i][j]=" * ";
                }else {
                    character[i][j]="   ";
                }
            }
        }
        for(String[] row : character){  // row: vertical elements
            for (String col : row){     // col: horizontal elements
                System.out.print(col);
            }
            System.out.println();
        }
        System.out.println("\n row elements: "+ character.length);
    }
}

