import java.util.Scanner;

public class SidesofTriangles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first side of the triangle");
        double side1 = input.nextDouble();
        System.out.println("Please enter the second side of the triangle");
        double side2 = input.nextDouble();
        System.out.println("Please enter the third side of the triangle");
        double side3 = input.nextDouble();

        if (side1 == side2 && side1 == side3) {
            System.out.println("This is an equilateral triangle");
        } else if (side1 == side2 && side1 == side3 && side2 == side3) {
            System.out.println("This is an isosceles triangle");
        } else {
            System.out.println("This is a Scalene triangle");
        }
    }
}
