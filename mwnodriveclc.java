  import java.util.Scanner;

public class mwnodriveclc {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b;

        System.out.print("Enter two numbers: ");
        a = sc.nextDouble();
        b = sc.nextDouble();

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Choose an option: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result = " + (a + b));
                break;
            case 2:
                System.out.println("Result = " + (a - b));
                break;
            case 3:
                System.out.println("Result = " + (a * b));
                break;
            case 4:
                if (b != 0)
                    System.out.println("Result = " + (a / b));
                else
                    System.out.println("Cannot divide by zero");
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
    

