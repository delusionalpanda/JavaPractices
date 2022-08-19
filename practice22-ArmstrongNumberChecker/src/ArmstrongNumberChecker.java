import java.util.Scanner;

public class ArmstrongNumberChecker {

    public static void main(String[] args) {

//        int number, numberOfDigits = 1, total = 0, exponent, dividedNumber, remainder, exponentiation = 1;
//          Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter the number you want to check: ");
//        number = input.nextInt();
//        dividedNumber = number;
//
//        // counts the number of digits
//        while (true) {
//            dividedNumber = dividedNumber / 10;
//            // instead of this, you can use dividedNumber != 0 for while condition
//            if (dividedNumber < 1) {
//                break;
//            }
//            numberOfDigits++;
//        }
//
//        // calculates the exponent for each digit using numberOfDigits as the power.
//        dividedNumber = number;
//        while (true) {
//            remainder = dividedNumber % 10;
//            dividedNumber = dividedNumber / 10;
//
//            for (int i = 1; i <= numberOfDigits; i++) {
//                exponentiation *= remainder;
//            }
//
//            total += exponentiation;
//            exponentiation = 1;
//            // instead of this, you can use dividedNumber != 0 for while condition
//            if (dividedNumber < 1) {
//                break;
//            }
//        }
//
//        if (total == number) {
//            System.out.println(number + " is an Armstrong number (AKA narcissistic number)");
//        } else {
//            System.out.println("Sorry.");
//        }

        // Additional Practice 2
        // Print the narcissistic numbers between 1 and 999. (1 and 999 are included)

        for (int number = 1; number <= 999; number++) {
            int numberOfDigits = 1, total = 0, dividedNumber = number, remainder, exponentiation = 1;

            // counts the number of digits
            while (true) {
                dividedNumber = dividedNumber / 10;
                // instead of this, you can use dividedNumber != 0 for while condition
                if (dividedNumber < 1) {
                    break;
                }
                numberOfDigits++;
            }

            // calculates the exponent for each digit using numberOfDigits as the power.
            dividedNumber = number;
            while (true) {
                remainder = dividedNumber % 10;
                dividedNumber = dividedNumber / 10;

                for (int i = 1; i <= numberOfDigits; i++) {
                    exponentiation *= remainder;
                }

                total += exponentiation;
                exponentiation = 1;
                // instead of this, you can use dividedNumber != 0 for while condition
                if (dividedNumber < 1) {
                    break;
                }
            }

            if (total == number) {
                System.out.println(number + " is an Armstrong number (AKA narcissistic number)");
            }
        }

        // Additional Practice 3
        // Finds the digits of the number, then sums them.
//        int number, total = 0;
//        System.out.println("Enter a number: ");
//        number = input.nextInt();
//
//        while (number != 0) {
//            total += number % 10;
//            number = number / 10;
//        }
//        System.out.println(total);
    }
}
