import java.util.Scanner;

public class areaoftriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base of the triangle");
        int base = input.nextInt();
        System.out.println("Enter the height of the triangle");
        int height = input.nextInt();
        int area = base*height;
        System.out.println("The area of the triangle is " + area );

    }
}
