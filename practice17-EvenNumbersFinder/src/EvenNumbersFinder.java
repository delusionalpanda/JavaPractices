import java.util.Scanner;

public class EvenNumbersFinder {

    public static void main(String[] args) {

          int number;
          Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter the maximum range: ");
//        number = input.nextInt();
//
//        for (int i = 0; i <= number; i++) {
//            if (i % 2 == 0) System.out.println(i);
//        }

        // Additional Practice
        // A program that finds the average of the numbers if the number is divisible by 12 (3 and 4) given maximum range starting from 0.
        int sum = 0, counter = 0;
        System.out.print("Enter the maximum range: ");
        number = input.nextInt();
        for (int i = 1; i <= number; i++) {
            if (i % 12 == 0) {
                sum += i;
                counter++;
            }
        }
        System.out.println("Average = " + (double)(sum / counter));
    }
}
