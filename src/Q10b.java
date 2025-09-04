import java.util.Scanner;

public class Q10b {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a: ");
    double a = sc.nextDouble();
    System.out.println("enter b: ");
    double b = sc.nextDouble();
    System.out.println("enter c: ");
    double c = sc.nextDouble();
    double s = (a + b + c) / 2;
    double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
    System.out.println("The area of the Triangle is " + area);

}
}
