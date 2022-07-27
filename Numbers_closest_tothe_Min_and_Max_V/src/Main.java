
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int[] list = {1544, 766, 688, 533, -188, -632, 298, 984};
        int min = list[0];
        int max = list[0];

        System.out.println(Arrays.toString(list)); // print not sorted array
        System.out.print("Please enter a number : ");
        int number = scan.nextInt();

        Arrays.sort(list);
        System.out.println(Arrays.toString(list)); // print sorted array an other way is for loop..
        for (int i : list) {
            if (i < number) {
                min = i;
            }
            if (i > number) {
                max = i;
                break;  // break the loop on the first number greater than the entered number

            }
        }

        System.out.println("The nearest number smaller than the entered number : " + min);
        System.out.println("The nearest number greater than the entered number : " + max);
    }
}




/*
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
*/
