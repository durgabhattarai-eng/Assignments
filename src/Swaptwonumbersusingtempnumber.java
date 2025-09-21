import java.util.Scanner;

public class Swaptwonumbersusingtempnumber {

    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number: ");
        a = sc.nextInt();
        System.out.println("Enter the Second number: ");
        b = sc.nextInt();
        System.out.println("/n-----before swapping----");
        System.out.println("First number (a) = " + a);
        System.out.println("Second number (b) = " + b);

        int temp = a;
        a = b;
        b = temp;
        System.out.println("/n-----after swapping----");
        System.out.println("First number (a) = " + a);
        System.out.println("Second number (b) = " + b);
    }


}
