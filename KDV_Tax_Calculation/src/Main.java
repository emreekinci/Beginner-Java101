import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double Amount, vat_rate =0, vat_Amount, total_Amount;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an amount: ");
        Amount = scan.nextDouble();

        if(Amount <= 0){
            System.out.println("Amount can not be negative value !!! ");return;
        }
        vat_rate = Amount > 1000 ? 0.08 : 0.18;
        vat_Amount = vat_rate * Amount;
        total_Amount = Amount + vat_Amount;

        System.out.println("Amount: "+Amount); // Ana para - Tutar
        System.out.println("Vat Rate: "+vat_rate); // KDV orani
        System.out.println("Vat Amount: "+vat_Amount); // KDV dahil Tutar
        System.out.println("Total Amount(Last): "+total_Amount); // Tutar + KDV li Tutar
    }
}
