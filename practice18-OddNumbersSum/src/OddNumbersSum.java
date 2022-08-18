import java.util.Scanner;

public class OddNumbersSum {
    public static void main(String[] args) {

        int number, sum = 0;
        Scanner input = new Scanner(System.in);

//        do {
//            System.out.println("Enter a number");
//            number = input.nextInt();
//            if (number % 2 == 1) sum += number;
//        } while (number > 0);
//        System.out.println("Sum: " + sum);

//        number = 1;
//        while (number > 0) {
//            System.out.print("Enter a number: ");
//            number = input.nextInt();
//            if (number % 2 == 1) sum += number;
//        }
//        System.out.println("Sum: " + sum);

        do {
            System.out.print("Enter a number: ");
            number = input.nextInt();
            if (number % 4 == 0) sum += number;
        } while (number % 2 != 1);
        System.out.println("Sum: " + sum);
    }
}
