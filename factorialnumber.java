 import java.util.Scanner;
public class factorialnumber {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        long fact = 1;

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined");
        } else {
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }

            System.out.println("Factorial = " + fact);
        }
    }
}
    

