import java.util.Scanner;
import java.text.DecimalFormat; //I want to set the precision.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double pi = 3.14;
        System.out.println("Please enter the radius value.");
        int radius = input.nextInt();
        System.out.println("The entered radius length:" +radius);

        System.out.println("Please enter the angle of the circle:");
        int angle = input.nextInt();
        System.out.println("The entered the angle:" + angle);

        double area;
        area = (pi*(radius*radius)*angle)/360;
        DecimalFormat Df=new DecimalFormat("#0.0000");
        System.out.println("The area of circle is " + Df.format(area));

    }
}