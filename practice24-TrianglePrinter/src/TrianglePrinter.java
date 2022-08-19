import java.util.Scanner;

public class TrianglePrinter {
    public static void main(String[] args) {


        int n, counter;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter how many lines (n) you want: ");
        n = input.nextInt();
        counter = n;

        for (int i = 1; i <= n; i++) {
            for (int j = counter - 1; j >= 1; j--) {
                System.out.print(" ");
            }
            counter--;
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // Additional code to print Rhombus.
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = n -1; k >= i; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
