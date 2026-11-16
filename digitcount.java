import java.util.Scanner;
public class digitcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, count = 0;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        num = Math.abs(num);

        if (num == 0)
            count = 1;
        else {
            while (num != 0) {
                count++;
                num /= 10;
            }
        }

        System.out.println("Total digits = " + count);
    }
}
    

