import java.util.Scanner;

public class Cylinder_Volume {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder ");
        int radius = input.nextInt();
        System.out.println("Enter the height of the cylinder ");
        int height = input.nextInt();
        int a = 2 * radius;
        System.out.println("The area of the cylinder is " + a);
        int volume = (int) (Math.PI*a)*height;
        System.out.println("The volume of the cylinder is " + volume);
    }
}
