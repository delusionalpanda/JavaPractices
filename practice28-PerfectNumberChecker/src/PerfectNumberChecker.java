import java.util.Scanner;

public class PerfectNumberChecker {
    public static void main(String[] args) {

        int number, total = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number you want to check: ");
        number = input.nextInt();

        for (int i = 1; i <= number / 2; i++){
            if (number % i == 0) {
                total += i;
                //System.out.println(i + " is a proper divisor." + " Total: " + total);
            }
        }
        //System.out.println(number + " ?= " + total);
        System.out.println((number == total) ? "YES! " + number + " is a perfect number."
                : "NO! "  + number + " is NOT a perfect number.");
    }
}
