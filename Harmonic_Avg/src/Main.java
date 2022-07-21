
public class Main {
    public static void main(String[] args) {
        double[] numbers = {1, 2, 3, 4, 5}; // len: 5

        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += (1 / numbers[i]);
            //System.out.println(sum);
        }
        double harmonicAvg = numbers.length / sum;
        System.out.println("Harmonik Seri : " + sum);
        System.out.println("Harmonik Ortalama : " + harmonicAvg);
    }
}
/*
import java.text.DecimalFormat;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] arr={1,2,3,4,5};
        double sum=0;
        for(double i:arr){
            sum+=1/i;
        }
        double average= arr.length/sum;
        System.out.println("Harmonik ortalama: "+ average);

    }
}*/