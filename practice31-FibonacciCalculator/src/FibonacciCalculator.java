import java.util.Scanner;

public class FibonacciCalculator {
    public static void main(String[] args) {

        int n, ip1 = 0, ip2 = 1, fn = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the n-th term you want to find out: ");
        n = input.nextInt();
            for (int i = 1; i <= n; i++){
                fn = ip1 + ip2;
                System.out.println(ip1 + " + " + ip2 + " = " + fn);
                ip1 = ip2;
                ip2 = fn;
        }
    }
}
