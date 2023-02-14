import java.util.*;
import java.text.DecimalFormat; //I want to set the precision.

public class Main {
    public static void main(String[] args) {
        double kilo_meter, total, per_km = 2.20;
        int startPrice = 10;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the distance in km: ");
        kilo_meter = input.nextDouble();



        total  = (kilo_meter * per_km);
        total += startPrice;

        total = (total < 20 ) ? 20 : total;// ternary operation
        DecimalFormat Df=new DecimalFormat("#0.0000");
        System.out.println("Final amount payable: " +Df.format(total) + "TL");
        System.out.println("See you in next projects.");
    }
}