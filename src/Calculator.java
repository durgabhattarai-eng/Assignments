import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();

        System.out.println("Enter operator (+, -, *, /): ");
        char operator = input.next().charAt(0);

        int result = 0;
        boolean valid = true;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    valid = false;
                }
                break;
            default:
                System.out.println("Invalid input! Please use +, -, *, or /.");
                valid = false;
                break;
        }

        if (valid) {
            System.out.println("The result is: " + result);
        }

        input.close();
    }
}