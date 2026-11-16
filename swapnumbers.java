 import java.util.Scanner; 
public class swapnumbers {   
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, temp;

        System.out.print("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();

        temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping:");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }
}
    

