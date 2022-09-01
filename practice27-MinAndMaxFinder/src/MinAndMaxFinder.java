import java.util.Scanner;

public class MinAndMaxFinder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int N, max = Integer.MAX_VALUE, min = Integer.MIN_VALUE, temp, counter = 1;

        System.out.print("Enter value of N: ");
        N = input.nextInt();

        if (N > 1) {
            while (counter < N) {
                if (counter < 3) {
                    System.out.print("Number 1: ");
                    min = input.nextInt();
                    System.out.print("Number 2: ");
                    max = input.nextInt();
                    if (min > max) {
                        temp = max;
                        max = min;
                        min = temp;
                    }
                    counter = 2;
                    if (N == 2) break;
                }

                counter++;
                System.out.print("Number " + counter + ": ");
                temp = input.nextInt();
                if (temp > max) {
                    max = temp;
                } else if (temp < min) {
                    min = temp;
                }
            }
            System.out.println("Max: " + max + "\nMin: " + min);
        } else if (N == 1) {
            System.out.print("Number: ");
            temp = input.nextInt();
            max = temp;
            min = temp;
            System.out.println("Max: " + max + "\nMin: " + min);
        } else {
            System.out.println("Invalid N!");
        }

    }
}
