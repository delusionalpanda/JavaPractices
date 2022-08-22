import java.util.Scanner;

public class NumberPattern {


    public static void main(String[] args) {

        int number, maxRange;
        boolean switchRotation = false;
        Scanner scan = new Scanner(System.in);

        System.out.print("Number: ");
        number = scan.nextInt();
        maxRange = number;
        System.out.print("Pattern: ");
        pattern(number, maxRange, switchRotation);

    }

    // Number gets decreased until it is > 0.
    // When it hits the bottom which is being 0 or less than 0, it prints the bottom number.
    // Then the program changes the rotation and starts increasing the number.
    public static boolean pattern(int number, int maxRange, boolean switchRotation) {
        System.out.print(number + " ");
        if (!switchRotation) {
            if (number > 0) {
                pattern(number - 5, maxRange,false);
            } else {
                pattern(number + 5, maxRange,true);
            }
        } else {
               if (number < maxRange) pattern(number + 5, maxRange, true);
        }
        return true;
    }
}
