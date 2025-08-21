import java.util.Scanner;

public class perimeteroftriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the first side of triangle");
        int length1 = input.nextInt();
        System.out.println("Enter the length of the second side of triangle");
        int length2 = input.nextInt();
        System.out.println("Enter the length of the third side of triangle");
        int length3 = input.nextInt();
        int perimeter = (length1+length2+length3);
        System.out.println("The perimeter of the triangle is " + perimeter);
    }
}
