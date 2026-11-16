import java.util.Scanner;
public class farenheit {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double celsius, fahrenheit;

        System.out.print("Enter Celsius: ");
        celsius = sc.nextDouble();

        fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Fahrenheit = " + fahrenheit);
    }
}
    

