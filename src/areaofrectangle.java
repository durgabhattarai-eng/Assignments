import java.util.Scanner;

public class areaofrectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle" );
        int length = input.nextInt();
        System.out.println("Enter the width of the rectangle" );
        int width = input.nextInt();
        int area = length * width;
        System.out.println("The area of the rectangle is " + area);
        int perimeter = area * 2;
        System.out.println("The perimeter of the rectangle is " + perimeter);

    }
}
