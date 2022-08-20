import java.util.Scanner;

public class UpsideDownTriangle {
    public static void main(String[] args) {

        int n;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) System.out.print(" ");
            for (int k = n; k >= i; k--) System.out.print("* ");
            System.out.println();
        }
    }
}
