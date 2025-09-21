
import java.util.Scanner;

public class TwoIntegersCompar {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number");
    int a = sc.nextInt();
        System.out.println("Please enter the second number");
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("Please note the same number ");
        } else if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("a is smaller than b");
        }
    }
}