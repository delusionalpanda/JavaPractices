import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {

        // Factorial Calculator
//        int factorial;
//        Scanner input = new Scanner(System.in);

//        System.out.print("n! = ?" +
//                "\nn = ");
//        factorial = input.nextInt();

//        System.out.print(factorial + "! = ");
//        if (factorial == 0) {
//            factorial = 1;
//        } else {
//            for (int i = factorial - 1; i > 1; i--){
//                factorial = factorial * i;
//            }
//        }
//        System.out.print(factorial);

        // Combination Calculator
        System.out.println("C(n,r) = n! / (r!(n-r)!)");

        int n, r;
        Scanner input = new Scanner(System.in);

        System.out.print("n = ");
        n = input.nextInt();
        System.out.print("r = ");
        r = input.nextInt();

        int factorial = n, nFactorial = 0, rFactorial = 0, nMinusRFactorial = 0;
        int counter = 0;

        if ( n >= r && r >= 0) {
            do {
                if (factorial == 0) {
                    factorial = 1;
                } else {
                    for (int i = factorial - 1; i > 1; i--){
                        factorial = factorial * i;
                    }
                }
                if (counter == 0) {
                    nFactorial = factorial;
                    factorial = r;
                } else if (counter == 1) {
                    rFactorial = factorial;
                    factorial = n - r;
                } else {
                    nMinusRFactorial = factorial;
                }
                counter++;
            }
            while (counter < 3);
            System.out.println("C" + "(" + n + "," + r + ") = " + (nFactorial / (rFactorial*(nMinusRFactorial))));
        } else System.out.println("Please enter n >= r >= 0");
    }
}
