import java.util.Scanner;

import java.util.Scanner;

public class Highvaluesof3digit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first Number: ");
        int Number1 = input.nextInt();

        System.out.print("Enter the second Number: ");
        int Number2 = input.nextInt();

        System.out.print("Enter the third Number: ");
        int Number3 = input.nextInt();

        int max;

        if (Number1 >= Number2 && Number1 >= Number3) {
            max = Number1;
            System.out.println("Number 1 is the greatest.");
        } else if (Number2 >= Number1 && Number2 >= Number3) {
            max = Number2;
            System.out.println("Number 2 is the greatest.");
        } else {
            max = Number3;
            System.out.println("Number 3 is the greatest.");
        }

        System.out.println("The highest value is: " + max);
    }
}

