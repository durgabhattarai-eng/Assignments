import java.util.Scanner;

public class EvenOddIdentifier {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int number = input.nextInt();
        if (number%2==0)
        {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is not even");
        }
    }
}
