import java.util.Scanner;

public class RecursivePowerCalculator {

    public static int power(int base, int exponent) {
        int power = 1;
        if (exponent == 0) return power;
        else {
            return power = power(base ,exponent - 1) * base;
        }
    }
    public static void main(String[] args) {

        int x, y;
        Scanner scan = new Scanner(System.in);

        System.out.print("Base: ");
        x = scan.nextInt();
        System.out.print("Exponent: ");
        y = scan.nextInt();

        if (x < 0 || y < 0) System.out.println("The numbers you enter must be >= 0!");
        else System.out.println("Power(" + x + "," + y + ") = " + power(x,y));
    }
}
