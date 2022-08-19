import java.util.Scanner;

public class HarmonicNumberCalculator {

    public static void main(String[] args) {

        int n;
        double total = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("n-th harmonic number: ");
        n = input.nextInt();

        if (n == 0) {
            System.out.println("n must be >= 1");
        } else {
            for (int i = 1; i <= n; i++){
                total += 1.0/i;
            }
            System.out.println(n + "-th harmonic number = " + total);
        }


    }
}
