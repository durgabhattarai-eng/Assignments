
import java.util.Scanner;

public class Poundtokiloconversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Pound: ");
        int pound = input.nextInt();
        int kilograms = (int) ((pound*0.454));
        System.out.println("The Kilograms equivalent to the Pounds is: " + kilograms);

        System.out.print("Enter the kilograms: ");
        int kilograms2 = input.nextInt();
        int pound2 = (int) ((kilograms*2.205));
        System.out.println("The Pounds equivalent to the Kilograms is: " + pound2);
    }

}
