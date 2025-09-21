import java.util.Scanner;

public class Agenamenationalityformat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        int age = 0;
        boolean validInput = false;
        while (!validInput) {
            System.out.println("Enter your age: ");

                age = sc.nextInt();
                if (age <= 0 || age > 100) {
                    System.out.println("Invalid age. Please enter a value between 0 and 100.");
                } else {
                    validInput = true;
                }
        }

        System.out.println("Enter your nationality: ");
        String nationality = sc.next();


        System.out.println("--- Personal Details ---");
        System.out.printf("%-15s: %s%n", "Name", name);
        System.out.printf("%-15s: %d%n", "Age", age);
        System.out.printf("%-15s: %s%n", "Nationality", nationality);
    }
}
