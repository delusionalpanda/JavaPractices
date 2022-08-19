import java.util.Scanner;

public class ExponentCalculator {

    public static void main(String[] args) {

        int base, exponent, total = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base: ");
        base = input.nextInt();
        System.out.print("Enter the exponent: ");
        exponent = input.nextInt();

       if (base == 0 && exponent == 0) {
           System.out.println("Undefined or 1");
       } else {
           for (int i = 1; i <= exponent; i++) {
               if (base == 0) {
                   total = 0;
                   break;
               }
               total *= base;
           }
           System.out.println(base + "^" + exponent + " = " + total);
       }
    }
}
