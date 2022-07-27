import java.util.Scanner;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, -33};
        int arr_len = list.length;

        int min = list[0];
        int max = list[0];

        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.println("************\nStart Array list: ");
        for (int i = 0 ; i < arr_len ; i++ ){
            System.out.print(list[i] + " ");
        }

        // not sorted results
        System.out.println("\nNot Sorted Array List !!! \n");

        System.out.println("************\nMin value is : " + min+"\ninfo not sorted !!");
        System.out.println("************\n--> Number closest to the minimum value is : " + list[1]);
        System.out.println("************\nMax value is : " + max+ "\ninfo not sorted !!");
        System.out.println("--> Number closest to the maximum value is : " + list[arr_len - 2]);

        // sorted results ...
        Arrays.sort(list);

        System.out.println("\nNew Sorted Array List !!! ");

        for (int i=0 ; i < arr_len; i++){
            System.out.println(i+ " : \t"+list[i]+ " ");
        }
        System.out.println("************\nMin value is : " + min);
        System.out.println("************\n--> Number closest to the minimum value is : " + list[1]);
        System.out.println("************\nMax value is : " + max);
        System.out.println("--> Number closest to the maximum value is : " + list[arr_len - 2]);

    }
}
