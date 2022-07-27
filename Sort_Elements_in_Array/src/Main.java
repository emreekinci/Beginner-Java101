import java.util.*;

public class Main {
    public static void main(String[] args) {

        int element_num = 0;
        int start = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the number of elements for the array : ");
        element_num = scan.nextInt();

        int[] list_one = new int[element_num];
        //list_one = {1,8,9,4,5,6,11,22,33};

        for (int x = 0; x < list_one.length; x++) {
            int num = 0;
            System.out.print((x+1) +".element --> Please add element to array : ");
            num = scan.nextInt();
            list_one[x] = num;
            //int[] list_two = new int[element_num];
        }
        System.out.println("\nArray : "+ Arrays.toString(list_one)); // not sorted list
        Arrays.sort(list_one);
        System.out.println("**********************************\nSorted array list : "+ Arrays.toString(list_one));
    }
}
