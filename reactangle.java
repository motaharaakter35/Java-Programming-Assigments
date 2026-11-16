 import java.util.Scanner;
public class reactangle {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length, width;

        System.out.print("Enter length: ");
        length = scanner.nextDouble();

        System.out.print("Enter width: ");
        width = scanner.nextDouble();

        System.out.println("Area = " + (length * width));
        System.out.println("Perimeter = " + 2 * (length + width));
    }
}

