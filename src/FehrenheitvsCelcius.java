import java.util.Scanner;

public class FehrenheitvsCelcius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Fehrenheit: ");
        int f = input.nextInt();

        int a = (int) ((f*1.8) + 32);
        System.out.println("The Fehrenheit equivalent to the celcius is: " + a);

        System.out.println("Enter the Celcius: ");
        int c = input.nextInt();
        int b = (int) ((c*9/5) + 32);
        System.out.println("The Celcius equivalent to the Fehrenheit is: " + b);
    }
}
