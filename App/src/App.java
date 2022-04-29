import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    double x = 3.14;
    double y = -10;
    double z = Math.max(x, y);
    // min, abs, sqrt, round, ceil, floor
    // System.out.println(z);

    double side1;
    double side2;
    double side3;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter side 1: ");
    side1 = scanner.nextDouble();

    System.out.println("Enter side 2: ");
    side2 = scanner.nextDouble();

    side3 = Math.sqrt((side1 * side1) + (side2 * side2));

    System.out.println("side3 is: " + side3);
    scanner.close();
  }
}
