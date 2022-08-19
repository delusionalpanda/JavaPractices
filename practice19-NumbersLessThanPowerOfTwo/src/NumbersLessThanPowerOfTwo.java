import java.util.Scanner;

public class NumbersLessThanPowerOfTwo {

    public static void main(String[] args) {

        int maxRange;
        Scanner input = new Scanner(System.in);


        System.out.println("Enter the maximum range: ");
        maxRange = input.nextInt();

//        if (maxRange >= 1) System.out.println(1);
//        for (int i = 2; i <= maxRange; i *= 2){
//            System.out.println(i);
//        }

        // Additional Practice
        // An app that returns powers of 4 and 5 if the powers are less than the entered number.

//        if (maxRange >= 1) System.out.println(1 + " " + 1);
//        for (int i = 4, j = 5; i <= maxRange || j <= maxRange; i *= 4, j *= 5) {
//            if (j > maxRange) {
//                System.out.println(i);
//            } else System.out.println(i + " " + j);
//        }

        for (int i = 1, j = 1; i <= maxRange || j <= maxRange; i *= 4, j *= 5) {
            if (j > maxRange) {
                System.out.println(i);
            } else System.out.println(i + " " + j);
        }
    }
}
