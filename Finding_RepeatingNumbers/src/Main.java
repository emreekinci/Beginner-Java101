import java.util.Arrays;

public class Main {
    static boolean isFind(int []arr,int value){

        for (int i: arr){
            if (i==value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int [] list = {3,5,6,1,2,4,6,3,6,6,2,8,8};
        int [] odd_num = new int[list.length];
        int start = 0;

        for (int i = 0;i< list.length;i++){

            for (int j= 0 ;j<list.length;j++){

                if ((i != j) && (list[i] == list[j])) {
                    if(!isFind(odd_num,list[i])){  // basta false donecek ki ekleme olsun
                        odd_num[start++] = list[i];
                        break;
                    }
                }
            }
        }
        // added code section
        for (int value: odd_num) {
            if ((value!= 0) && (value%2 == 0)) { // deger 0 olmayacak ve cift sayi olacak
                System.out.println(value);
            }
        }
    }
}