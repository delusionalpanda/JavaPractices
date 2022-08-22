import java.util.Scanner;

public class PrimeNumberChecker {

    static boolean isPrime(int n, int i)
    {
        if (n % i == 0 || n <= 1)
            return false;
        if (i > n / 2 ) {
            return true;
        }

        return isPrime(n, i + 1);
    }

    public static void main(String[] args) {

        int n;
        Scanner scan = new Scanner(System.in);

        System.out.print("Number: ");
        n = scan.nextInt();
        if (isPrime(n, 2) || n == 2)
            System.out.println("Yes! It's a prime.");
        else
            System.out.println("No! It's not a prime.");

    }
}
