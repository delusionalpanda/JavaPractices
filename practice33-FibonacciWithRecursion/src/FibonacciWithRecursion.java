import java.util.Scanner;

public class FibonacciWithRecursion {

    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n-2) + fibonacci(n - 1);
    }
    public static void main(String[] args) {

        int number;
        Scanner i = new Scanner(System.in);

        System.out.print("Enter the which n-th term you want to find out: ");
        number = i.nextInt();

        if (number < 0) System.out.println("Please enter number >= 0");
        else System.out.println(fibonacci(number));

    }
}
