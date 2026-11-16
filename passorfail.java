 import java.util.Scanner;
public class passorfail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks;
        System.out.print("Enter marks: ");
        marks = sc.nextInt();

        if (marks >= 40)
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }
}
    

