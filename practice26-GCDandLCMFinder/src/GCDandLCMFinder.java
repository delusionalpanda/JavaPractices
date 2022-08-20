import java.util.Scanner;

public class GCDandLCMFinder {
    public static void main(String[] args) {

        int number1, number2, GCD = 1, LCM, counter = 2;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number1 = input.nextInt();
        System.out.print("Enter a number: ");
        number2 = input.nextInt();

        if (number1 <= number2) {
            while (counter <= number1) {
                if (number1 % counter == 0 && number2 % counter == 0) {
                    GCD = counter;
                }
                counter++;
            }
        } else {
            while (counter <= number2) {
                if (number1 % counter == 0 && number2 % counter == 0) {
                    GCD = counter;
                }
                counter++;
            }
        }
        System.out.println("GCD(" + number1 + "," + number2 + ") = " + GCD);
        System.out.println("LCM(" + number1 + "," + number2 + ") = " + (number1 * number2)/ GCD);
    }
}
